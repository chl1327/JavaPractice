package TkJava.TKU9.P5.ext5;

import TkJava.TKU9.P5.Ex5;

public class TestEx5 implements Ex5 {
    public void sayOne() {
        System.out.println("one");
    }

    public void sayTwo() {
        System.out.println("two");
    }

    public void sayThree() {
        System.out.println("three");
    }

    public static void main(String[] args) {
        TestEx5 x = new TestEx5();
        x.sayOne();
        x.sayTwo();
        x.sayThree();
    }
}