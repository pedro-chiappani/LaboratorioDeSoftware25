package practica5.ejercicio3;

import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.ServerSocket;
import java.net.Socket;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Contenedor {

    public static void iniciarServer(Object objeto){
        Class<?> clase = objeto.getClass();
        if (!clase.isAnnotationPresent(Servidor.class))
            throw new IllegalArgumentException("La clase no está anotada con @Servidor");

        Servidor sv = clase.getAnnotation(Servidor.class);
        String dir = sv.direccion();
        int port = sv.puerto();
        String file = sv.archivo();

        try (ServerSocket serverSocket = new ServerSocket(port)) {
            System.out.println("Servidor escuchando en http://" + dir + ":" + port);

            while (true) {
                Socket cliente = serverSocket.accept();
                String ipCliente = cliente.getInetAddress().getHostAddress();
                loguearConexion(file, ipCliente);

                // Responder al navegador (mínimo HTTP válido)
                OutputStream out = cliente.getOutputStream();
                PrintWriter writer = new PrintWriter(out, true);
                writer.println("HTTP/1.1 200 OK");
                writer.println("Content-Type: text/plain");
                writer.println();
                writer.println("Conexión recibida desde " + ipCliente);
                writer.flush();

                // Invocar métodos anotados
                for (Method metodo : clase.getDeclaredMethods()) {
                    if (metodo.isAnnotationPresent(Invocar.class)) {
                        metodo.setAccessible(true);
                        metodo.invoke(objeto);
                    }
                }

                cliente.close();
            }
        } catch (IOException | InvocationTargetException | IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }

    private static void loguearConexion(String archivo, String ip) {
        try (FileWriter fw = new FileWriter(archivo, true)) {
            String timestamp = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
            fw.write("[" + timestamp + "] Conexión desde IP: " + ip + "\n");
        } catch (IOException e) {
            System.out.println("Error al escribir en el archivo de log");
            e.printStackTrace();
        }
    }
}
