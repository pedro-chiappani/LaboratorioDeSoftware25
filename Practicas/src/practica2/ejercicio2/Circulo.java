package practica2.ejercicio2;

public class Circulo extends FiguraGeometrica {
    private int radio;

    public Circulo(){

    }

    public void dibujar(){
        System.out.println("Dibujando Circulo");
    }

    public int area(){
        return (int) ((int) 3.14*Math.pow(radio, 2));
    }

    public void setRadio(int r){
        this.radio = r;
    }

    public int getRadio(){
        return this.radio;
    }
}
