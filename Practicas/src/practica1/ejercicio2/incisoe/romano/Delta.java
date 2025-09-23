package practica1.ejercicio2.incisoe.romano;

import practica1.ejercicio2.incisoe.griego.Alpha;

public class Delta extends Alpha {
    void unMetodoD(Alpha a, Delta d){
//        a.x=10;
        d.x=10;
//        a.otroMetodoA();
//        d.otroMetodoA();
    }

    public static void main(String[] args) {
        Alpha a = new Alpha();
        Delta d = new Delta();
        d.unMetodoD(a,d);
    }
}