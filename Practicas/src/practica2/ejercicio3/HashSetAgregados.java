package practica2.ejercicio3;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

public class HashSetAgregados<E> extends HashSet<E> {
    private int cantidadAgregados = 0;
    public HashSetAgregados() {
    }
    public HashSetAgregados(int initCap, float loadFactor) {
        super(initCap, loadFactor);
    }
    @Override public boolean add(E e) {
        cantidadAgregados++;
        return super.add(e);
    }
    @Override
    public boolean addAll(Collection<? extends E> c) {
        cantidadAgregados += c.size();
        return super.addAll(c);
    }
    public int getCantidadAgregados() {
        return cantidadAgregados;
    }

    public static void main (String[] args){
        HashSetAgregados<Integer> hsa = new HashSetAgregados<Integer>();
        List<Integer> lista = new ArrayList<Integer>();
        lista.add(1);lista.add(2);lista.add(3);
        hsa.addAll(lista);

        System.out.println(hsa.getCantidadAgregados());
    }
}
