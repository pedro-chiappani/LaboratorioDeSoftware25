package logginutils;

import java.util.logging.Level;

public class Logger {

    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(Logger.class.getName());

    public void logInfo(String mensaje){
        logger.log(Level.INFO, mensaje);
    }

    public void logError(String mensaje){
        logger.log(Level.SEVERE, mensaje);
    }

    public void logWarning(String mensaje){
        logger.log(Level.WARNING, mensaje);
    }


}
