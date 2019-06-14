package TkJava.TKU21.L1;

public class RunDemo implements Runnable {

    private static int taskCount = 0;
    private final int id = taskCount++;
    public RunDemo(){
        System.out.println("RunDemo.RunDemo.start...");
    }


    public void run(){
        for(int i =3 ;i > 0; i--) {
            System.out.println("RunDemo.run" + i);
            Thread.yield();
        }
        System.out.println("RunDemo.RunDemo.end...");
    }
}
