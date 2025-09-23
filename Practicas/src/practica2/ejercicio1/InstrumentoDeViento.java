package practica2.ejercicio1;

public abstract class InstrumentoDeViento implements InstrumentoMusical {
        public void hacerSonar(){
            System.out.println("Sonar Vientos");
        }
        public String queEs() {
            return "Instrumento de Viento";
        }

}
