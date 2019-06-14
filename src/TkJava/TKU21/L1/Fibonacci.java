package TkJava.TKU21.L1;

import java.util.Iterator;

import net.mindview.util.Generator;

public class Fibonacci implements Generator<Integer>, Iterable<Integer>,Runnable{
    private int count = 0;
    private int m;
    @Override
    public Integer next() {
        return fib(count++);
    }
    private int fib(int n){
        if (n < 2) return 1;
        return fib(n-2) + fib(n-1);
    }
    public Fibonacci() {}
    public Fibonacci(int m) { this.m = m; }
    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {
            @Override
            public boolean hasNext() { return m > 0; }
            @Override
            public Integer next() {
                m--;
                return Fibonacci.this.next();
            }
            @Override
            public void remove() { // Not implemented
                throw new UnsupportedOperationException();
            }
        };
    }
    public void run(){
        Fibonacci gen = new Fibonacci();
        for(int i = 0; i < this.m; i++) {
            System.out.print(gen.next() + " ");
        }
        System.out.println();
        Iterator it = new Fibonacci( this.m).iterator();
        while(it.hasNext())
            System.out.print(it.next() + " ");
    }
}
