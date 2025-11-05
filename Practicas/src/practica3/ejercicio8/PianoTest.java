package practica3.ejercicio8;

public class PianoTest {

    private static final Piano piano = new Piano();

    public static void main(String[] args){
        piano.afinar(FrecuenciasDeLa.FREQ440);
        System.out.println(piano.queEs());
        piano.hacerSonar(Notas.DO,4);
        piano.hacerSonar(Notas.LA,2);
        piano.hacerSonar(Notas.DO,2);
        piano.hacerSonar(Notas.RE,4);
    }
}
