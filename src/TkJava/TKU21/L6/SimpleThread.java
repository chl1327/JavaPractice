package TkJava.TKU21.L6;

import TkJava.TKU21.L1.RunDemo;

public class SimpleThread extends Thread{
    private int countDown = 5;
    private static int threadCount = 0;
    public SimpleThread(){
        super(Integer.toString(++threadCount));
    }

    @Override
    public String toString() {
        return "#" + getName() + "(" + countDown +"), ";
    }
    public void run(){
        while (true){
            System.out.print(this);
            if (--countDown == 0)
                return;
        }
    }

    public static void main(String[] args){
        try{
            for (int i=0; i < 5; i++){
                Thread t = new Thread(new SimpleThread());
                t.setDaemon(true);
                t.start();
            }
            System.out.println("Waiting for RunDemo");
        }finally {
            System.out.println("Finally out of main");
        }
    }

}
