package practica1.ejercicio5;

public class Rectangulo extends FiguraGeometrica{

    int ancho;
    int alto;

    public Rectangulo(){
    }

    public Rectangulo(int alto, int ancho){
        this.alto = alto;
        this.ancho = ancho;
    }

    public void dibujar(){
        System.out.println("Dibujando Rectangulo");
    }

    public int area(){
        return this.ancho * this.alto;
    }
}
