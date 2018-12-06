package TkJava.TKU10.P4.P42;

import TkJava.TKU10.P4.Ex6Interface;
import TkJava.TKU10.P4.P41.Ex6Base;

public class Ex6 extends Ex6Base {
    Ex6Interface getBaseInner() {
        return this.new Ex6BaseInner();
    }
    public static void main(String[] args) {
        Ex6 ex = new Ex6();
        System.out.println(ex.getBaseInner().say());
    }
}