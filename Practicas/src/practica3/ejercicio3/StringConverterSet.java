package practica3.ejercicio3;

import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Iterator;

public class StringConverterSet extends AbstractSet{

    private ArrayLikjst set;

    public StringConverterSet() {
        set = new ArrayList();
    }

    @Override
    public Iterator iterator() {
        return null;
    }

    @Override
    public int size() {
        return 0;
    }
}
