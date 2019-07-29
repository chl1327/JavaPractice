package TkJava.TKU21.L4;

import java.util.Date;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class SleepDemo implements Runnable{

    Random rand = new Random();
    public void run(){
        try {
            int t = 1000 * rand.nextInt(10);
            TimeUnit.MICROSECONDS.sleep(t);
            System.out.println("Slept " + t/1000 + "seconds");
            return;
        }catch (InterruptedException e){
            System.err.println("Interrupted");
        }
    }

    public static void main(String[] args){
        ExecutorService exec = Executors.newCachedThreadPool();
        for (int i=0; i < 5; i++){
            exec.execute(new SleepDemo());
        }
        exec.shutdown();
    }
}
