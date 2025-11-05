package test;

import logginutils.Logger;

public class Main {
    public static void main(String[] args) {
        Logger logger1 = new Logger();

        logger1.logError("Error critico en la base");
        logger1.logWarning("Warning critico en la base");
    }
}
