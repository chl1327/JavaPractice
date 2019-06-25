package TkJava.TKU21.L2;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MainThread {
    public static void main(String[] args){
        /*ExecutorService exec = Executors.newCachedThreadPool();
        exec.execute(new RunDemo());
        exec.execute(new Fibonacci(18));
        exec.shutdown();*/
        /*ExecutorService exec = Executors.newFixedThreadPool(5);
        for (int i=0; i < 5; i++){
            exec.execute(new RunDemo());
            exec.execute(new Fibonacci(18));
        }
        exec.shutdown();*/
        ExecutorService exec = Executors.newSingleThreadExecutor();
        for (int i=0; i<3;i++){
            exec.execute(new RunDemo());
            exec.execute(new Fibonacci(10));
        }
        exec.shutdown();
    }
}
