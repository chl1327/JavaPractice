package TkJava.TKU10.P1;

import static print.Print.print;
import static print.Print.println;

public class Outer {
    private String word;
    class Inner{
        private int ii1 = 1;
        private int ii2 = 2;
        private void showIi2() { System.out.println(ii2); }
        private void hi() { System.out.println("Inner hi"); }
        Inner() { System.out.println("Inner()"); }
        @Override
        public String toString() { return word; }
        void modifyOuter(){
            word = "321";
            test();
        }
    }
    void showIi2() { new Inner().showIi2(); }
    void outerHi() { new Inner().hi(); }
    void testInner() {
        Inner in = new Inner();
        in.modifyOuter();
    }
    private void test(){print("testOuter");}
    protected void show(){println(word);}
    Outer(String word) {
        this.word = word;
        System.out.println("Outer()"); }
    // make an Inner from within a non-static method of outer class:
    Inner makeInner() {
        return new Inner();
    }
    public static void main(String[] args) {
        Outer o = new Outer("123");
        Inner i = o.makeInner();
        System.out.println(i.toString());

        o.show();
        o.testInner();
        o.show();

        o.showIi2();
        o.outerHi();

    }
}
