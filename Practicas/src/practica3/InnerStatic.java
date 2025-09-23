package practica3;

import java.util.Scanner;

public class InnerStatic {
    static double PI = 3.14;
    static class Circulo {
        static double radio;

        public Circulo(double radio) {
            this.radio = radio;
        }

        static double getArea() {
            double a = PI * Math.pow(radio, 2);
            System.out.println("El area es: " +a);
            return a;
        }

        static double getLongitudCircunferencia(){
            double l = 2 * PI * radio;
            System.out.println("El longitud circunferencia es: " +l);
            return l;
        }
    }

    public void createCirculo(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa el radio del circulo");
        double radio = sc.nextDouble();
        Circulo c = new Circulo(radio);
        c.getArea();
        c.getLongitudCircunferencia();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa el valor del primer circulo");
        double r =  sc.nextDouble();
        Circulo c =  new Circulo(r);
        c.getArea();
        c.getLongitudCircunferencia();
    }

}
