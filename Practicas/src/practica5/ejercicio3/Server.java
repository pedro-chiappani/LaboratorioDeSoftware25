package practica5.ejercicio3;

@Servidor(direccion = "127.0.0.1",puerto = 5050,archivo = "file.txt")
public class Server {
    @Invocar
    public void prueba(){
        System.out.println("prueba");
    }
}
