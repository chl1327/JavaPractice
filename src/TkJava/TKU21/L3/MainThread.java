package TkJava.TKU21.L3;

import java.util.ArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import TkJava.TKU21.L1.Fibonacci;
import TkJava.TKU21.L1.RunDemo;

public class MainThread {
    public static void main(String[] args){
        ExecutorService exec = Executors.newCachedThreadPool();
        ArrayList<Future<Integer>> results = new ArrayList<>();
        for (int i = 0; i <10;i++){
            results.add(exec.submit(new TkJava.TKU21.L8.Fibonacci(i)));
        }
        for(Future<Integer> fi : results){
            try{
                System.out.println(fi.get());
            }catch (InterruptedException e){
                System.out.println(e);
                return;
            }catch (ExecutionException e){
                System.out.println(e);
            }finally {
                exec.shutdown();
            }
        }
    }
}
