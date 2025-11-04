package practica3.ejercicio5;
import java.util.Iterator;

public class Stack {
    private java.util.ArrayList<Object> items;

    public Stack(){
        items = new java.util.ArrayList<Object>();
    }


    public void push(Object item){
        items.add(item);
    }

    public Object pop(){
        return items.remove(items.size()-1);
    }

    public boolean isEmpty(){
        return items.isEmpty();
    }

    public Iterator getIterator(){
        return new Iterator<Object>(){
            private int index=0;

            @Override
            public boolean hasNext() {
                return index < items.size();
            }

            @Override
            public Object next() {
                return Stack.this.items.get(index++);
            }

        };
    }

    public static void main(String[] args){
        Stack stack = new Stack();

        stack.push("hola");
        stack.push("alo");
        stack.push("hello");
        Iterator iterador = stack.getIterator();

        while (iterador.hasNext()){
            System.out.println(iterador.next());
        }
        iterador = stack.getIterator();
        while (iterador.hasNext()){
            System.out.println(iterador.next());
        }


//        while  (!stack.isEmpty()){
//            System.out.println(stack.pop());
//        }
    }
}
