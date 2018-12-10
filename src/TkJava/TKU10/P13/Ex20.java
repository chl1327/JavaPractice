package TkJava.TKU10.P13;

import static print.Print.print;

interface In {
    void g ();
    class Nested {
        static void test(In in){
            in.g();
        }
        Nested() { System.out.println("Nested()"); }
        public void hi() { System.out.println("hi"); }
    }
}

public class Ex20 implements In {
    public void g(){ print("g()");}
    public static void main(String[] args) {
        Ex20 ex20 = new Ex20();
        In.Nested in = new In.Nested();
        in.hi();
        In.Nested.test(ex20);
    }
}