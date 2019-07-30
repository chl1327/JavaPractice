package TkJava.TKU21.L8;

import java.util.ArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class MainThread {
    public static void main(String[] args){
        Fibonacci fib = new Fibonacci(3);

        try{
            for (int i = 0; i <10;i++){
                System.out.println("sum of first" + i + " Fibonacci num = ");
                System.out.println(fib.runTask(i).get());
            }
        }catch (InterruptedException e){
            System.out.println(e);
            return;
        }catch (ExecutionException e){
            System.out.println(e);
        }finally {
            fib.exec.shutdown();
        }

    }
}
