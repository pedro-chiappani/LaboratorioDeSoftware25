package practica1.ejercicio4;

public class Logger {

    private static Logger instancia;
    private String mensaje;
    private String status;

    private Logger(){
    }

    public static Logger getInstancia() {
        if (instancia == null) {
            instancia = new Logger();
        }
        return instancia;
    }

    public void logInfo(String mensaje){
        this.mensaje = mensaje;
        this.status = "INFO";
    }

    public void logError(String mensaje){
        this.mensaje = mensaje;
        this.status = "ERROR";
    }

    public void logWarning(String mensaje){
        this.mensaje = mensaje;
        this.status = "WARNING";
    }

    public void imprimir() {
        System.out.println("["+this.status+"] " + this.mensaje);
    }

}
