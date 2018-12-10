package TkJava.TKU10.P14;

interface Selector {
    boolean end();
    Object current();
    void next();
}

public class Sequence4 {
    private Object[] items;
    private int next = 0;
    // to test SequenceSelector sequence4() in main():
    public void test() { System.out.println("Sequence4.test()"); }
    public Sequence4(int size) { items = new Object[size]; }
    public void add(Object x) {
        if(next < items.length)
            items[next++] = x;
    }
    private class SequenceSelector implements Selector {
        private int i = 0;
        public boolean end() { return i == items.length; }
        public Object current() { return items[i]; }
        public void next() { if(i < items.length) i++; }
        // method to produce outer class reference:
        public Sequence4 sequence4() { return Sequence4.this; }
        private SequenceSelector reverseSelect(int size){
            return new SequenceSelector(){
                private int j = size-1;
                public boolean end() { return j == 0; }
                public Object current() { return items[j]; }
                public void next() { if(j > 0) j--; }

            };
        }
    }
    public Selector selector() {
        return new SequenceSelector();
    }
    public Selector selector(int size) { return new SequenceSelector().reverseSelect(size); }
    public static void main(String[] args) {
        Sequence4 sequence = new Sequence4(10);
        for(int i = 0; i < 10; i++)
            sequence.add(Integer.toString(i));
        Selector selector = sequence.selector();
        Selector selector1 = sequence.selector(10);
        while(!selector.end()) {
            System.out.print(selector.current() + " ");
            selector.next();
        }
        while(!selector1.end()) {
            System.out.print(selector1.current() + " ");
            selector1.next();
        }
        // cast and test:
        ((SequenceSelector)selector).sequence4().test();

    }
}