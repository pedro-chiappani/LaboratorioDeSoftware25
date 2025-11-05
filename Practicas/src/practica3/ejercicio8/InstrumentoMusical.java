package practica3.ejercicio8;

public interface InstrumentoMusical {
    void hacerSonar(Notas n, int duracion);
    String queEs();
    default void afinar(FrecuenciasDeLa frecuencia){
        System.out.println("Afinado en " + frecuencia.getFrec());
    }
}
