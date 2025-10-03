package practica2.ejercicio2;

public class Rectangulo extends FiguraGeometrica {

    int ancho;
    int alto;

    public Rectangulo(){
    }

    public Rectangulo(int alto, int ancho){
        this.alto = alto;
        this.ancho = ancho;
    }
    @Override
    public void dibujar(){
        System.out.println("Dibujando Rectangulo");
    }
    @Override
    public int area(){
        return this.ancho * this.alto;
    }
}
