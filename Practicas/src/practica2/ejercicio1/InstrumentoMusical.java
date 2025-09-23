package practica2.ejercicio1;

public interface InstrumentoMusical {
    void hacerSonar();
    String queEs();
    default void afinar(){}
}
