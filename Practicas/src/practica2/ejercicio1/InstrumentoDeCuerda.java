package practica2.ejercicio1;

public class InstrumentoDeCuerda implements InstrumentoMusical{
    public void hacerSonar(){
        System.out.println("Sonar Cuerdas");
    }
    public String queEs() {
        return "Instrumento de Cuerda";
    }

    @Override
    public void afinar() {

    }
}
