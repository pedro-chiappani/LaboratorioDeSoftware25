package practica3.ejercicio8;

public class Piano implements InstrumentoMusical{
    @Override
    public void hacerSonar(Notas n, int duracion) {
        System.out.println("Suena la nota "+ n.name() + " por " + duracion + " tiempo.");
    }

    @Override
    public String queEs() {
        return "Es un Piano";
    }

}
