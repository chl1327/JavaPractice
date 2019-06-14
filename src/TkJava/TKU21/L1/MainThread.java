package TkJava.TKU21.L1;

import TkJava.TKU21.L1.Fibonacci;

public class MainThread {
    public static void main(String[] args){
        Thread rd = new Thread(new RunDemo());
        rd.start();
        Thread fb = new Thread(new Fibonacci(18));
        fb.start();
    }
}
