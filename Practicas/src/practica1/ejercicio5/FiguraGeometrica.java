package practica1.ejercicio5;

public abstract class FiguraGeometrica {
    private String color;

    public abstract void dibujar();

    public abstract int area();


    public void setColor(String c){
        this.color = c;
    }

    public String getColor(){
        return this.color;
    }
}
