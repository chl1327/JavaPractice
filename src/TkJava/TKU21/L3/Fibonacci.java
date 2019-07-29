package TkJava.TKU21.L3;

import java.util.Iterator;
import java.util.concurrent.Callable;

import net.mindview.util.Generator;

public class Fibonacci implements Generator<Integer>,Callable<Integer>{
    private int count = 0;
    private int m;
    @Override
    public Integer next() {
        return fib(m);
    }
    private int fib(int n){
        if (n < 2) return 1;
        return fib(n-2) + fib(n-1);
    }
    public Fibonacci() {}
    public Fibonacci(int m) { this.m = m; }

    public Integer call(){
        Fibonacci gen = new Fibonacci(m);
        return gen.next();
    }
}
