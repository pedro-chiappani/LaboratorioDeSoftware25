package practica3.ejercicio2;

import java.util.Scanner;

import static java.lang.Math.pow;

public class InnerStatic {
    static double PI = 3.1416;
    class Circulo{
        static double radio = 2;
        Circulo(double radio){
            this.radio = radio;
        }
        static double getArea(){
            double a = PI*pow(radio, 2);
            System.out.println("El area es: " +a);
            return a;
        }
        static double getLongitudCircunferencia(){
            double l= 2*PI*radio;
            System.out.println("La longitud es: " +l);
            return l;
        }
    }

//    public Circulo createCirculo(double radio){
//        Circulo c = new Circulo(radio);
//        return  c;
//    }

    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        InnerStatic is = new InnerStatic();
        System.out.println("Ingrese el radio");
        double r = sc.nextDouble();
        Circulo c = is.new Circulo(r);
        c.getArea();
        c.getLongitudCircunferencia();
    }
}
