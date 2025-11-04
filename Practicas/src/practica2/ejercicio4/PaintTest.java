package practica2.ejercicio4;

public class PaintTest {
    public static void main (String[] args){
        Paint paint = new Paint();
        paint.init();
        FiguraGeometrica[] fg = paint.getPaleta();
        for (FiguraGeometrica f : fg) {
            System.out.println("Area " + f.area());

            if (f instanceof Circulo) {
                Circulo c = (Circulo) f;
                System.out.println("Radio " + c.getRadio());
            }
        }

    }
}
