package TkJava.TKU21.L8;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import net.mindview.util.Generator;

public class Fibonacci implements Generator<Integer>,Callable<Integer>{
    private int count = 0;
    ExecutorService exec = Executors.newSingleThreadExecutor();
    private int m;
    private Integer n = 0;
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
    public Future<Integer> runTask(Integer n){
        this.n = n;
        return exec.submit(this);
    }
}
