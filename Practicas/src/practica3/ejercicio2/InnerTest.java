package practica3.ejercicio2;

public class InnerTest {
    public static void main(String[] args){
        InnerStatic is = new InnerStatic();
        for (int i=1; i<5; i++) {
            is.new Circulo(i);
            InnerStatic.Circulo.getArea();
            InnerStatic.Circulo.getLongitudCircunferencia();
        }}
}
