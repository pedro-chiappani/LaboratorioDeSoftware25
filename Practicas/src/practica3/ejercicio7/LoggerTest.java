package practica3.ejercicio7;

public class LoggerTest {
    public static void main(String[] args) {
        Logger logger1 = Logger.getInstancia();
        Logger logger2 = Logger.getInstancia();
        Logger logger3 = Logger.getInstancia();

        logger1.logError("Error critico en la base");
        logger2.imprimir();
        logger3.logWarning("Warning critico en la base");
        logger1.imprimir();
    }
}
