package practica1.ejercicio2.incisoa.griego;

class Gamma {
    void unMetodoG(){
        Alpha a = new Alpha();
        a.x=10;
        a.otroMetodoA();
    }

    public static void main(String[] args) {
        Gamma g = new Gamma();
        g.unMetodoG();
    }
}
