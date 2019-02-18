package TkJava.TKU15;

interface Selector<T> {
    boolean end();
    T current();
    void next();
}

public class Sequence<T> {
    private T[] items;
    private int next = 0;
    // to test SequenceSelector sequence4() in main():
    public void test() { System.out.println("Sequence.test()"); }
    public Sequence(T[] a) { this.items = a; }
    public void add(T x) {
        if(next < items.length)
            items[next++] = x;
    }
    private class SequenceSelector implements Selector {
        private int i = 0;
        public boolean end() { return i == items.length; }
        public T current() { return items[i]; }
        public void next() { if(i < items.length) i++; }
        // method to produce outer class reference:
        public Sequence sequence() { return Sequence.this; }
    }
    public Selector selector() {
        return new SequenceSelector();
    }
    public static void main(String[] args) {
        String [] a = new String[10];
        Sequence<String> sequence = new Sequence<>(a);
        for(int i = 0; i < 10; i++)
            sequence.add(Integer.toString(i));
        Selector selector = sequence.selector();
        while(!selector.end()) {
            System.out.print(selector.current() + " ");
            selector.next();
        }
        // cast and test:
        //((SequenceSelector)selector).sequence().test();
    }
}
