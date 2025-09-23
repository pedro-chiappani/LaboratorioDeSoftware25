package practica1.ejercicio2.incisob.romano;

import practica1.ejercicio2.incisob.griego.Alpha;

class Beta {
    void unMetodoB() {
        Alpha a = new Alpha();
        a.x = 10;
        a.unMetodoA();
    }

    public static void main(String[] args){
        Beta b = new Beta();
        b.unMetodoB();
    }
}
