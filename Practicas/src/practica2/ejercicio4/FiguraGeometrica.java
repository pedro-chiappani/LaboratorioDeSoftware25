package practica2.ejercicio4;

import java.io.Serializable;

public abstract class FiguraGeometrica implements Serializable {
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
