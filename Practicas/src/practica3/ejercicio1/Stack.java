package practica3.ejercicio1;

public class Stack {
    private java.util.ArrayList<Object> items;

    public Stack(){
        items = new java.util.ArrayList<Object>();
    }

    private class StackIterator implements java.util.Iterator<Object> {
        private int index;
        public StackIterator(){

            this.index = 0;
        }

        @Override
        public boolean hasNext() {
            return index < items.size();
        }

        @Override
        public Object next() {
            return Stack.this.items.get(index++);
        }
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

    public StackIterator getIterator(){
        return new StackIterator();
    }

    public static void main(String[] args){
        Stack stack = new Stack();

        stack.push("hola");
        stack.push("alo");
        stack.push("hello");
        java.util.Iterator iterador = stack.getIterator();

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
