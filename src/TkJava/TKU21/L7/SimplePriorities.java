package TkJava.TKU21.L7;

import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

class ThreadFactory9 implements ThreadFactory{
    Random rand = new Random();

    @Override
    public Thread newThread(Runnable r) {
        Thread t = new Thread(r);
        int i = rand.nextInt(3);
        switch (i){
            case 0:
                t.setPriority(Thread.MIN_PRIORITY);
                break;
            case 1:
                t.setPriority(Thread.NORM_PRIORITY);
                break;
            case 2:
                t.setPriority(Thread.MAX_PRIORITY);
                break;
                default:
        }
        return t;
    }
}

public class SimplePriorities implements Runnable{
    private int countDown = 5;
    private volatile double d;
    public String toString(){
        return Thread.currentThread() + ": " + countDown;
    }
    public void run(){
        while (true){
            for (int i=1; i< 100000; i++){
                d += (Math.PI + Math.E)/(double)i;
                if (i %1000 == 0)
                    Thread.yield();
            }
            System.out.println(this);
            if (--countDown == 0) return;
        }
    }

    public static void main(String[] args){
        ExecutorService exec = Executors.newCachedThreadPool(new ThreadFactory9());
        for (int i=0; i<5; i++){
            exec.execute(new SimplePriorities());
        }
        exec.execute(new SimplePriorities());
        exec.shutdown();
    }
}
