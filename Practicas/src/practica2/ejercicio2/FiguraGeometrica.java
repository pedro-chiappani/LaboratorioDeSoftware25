package practica2.ejercicio2;

public abstract class FiguraGeometrica implements Comparable<FiguraGeometrica> {
    private String color;

    public abstract void dibujar();

    public abstract int area();


    public void setColor(String c){
        this.color = c;
    }

    public String getColor(){
        return this.color;
    }

    public int compareTo(FiguraGeometrica figura){
        if (this.area()==figura.area()){
            return 0;
        }else if (this.area()>figura.area()){
            return 1;
        }else
            return -1;
    }
}
