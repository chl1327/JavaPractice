package TkJava.TKU7.P5;

import static print.Print.print;

class A{
    A(){
        print("A");
    }
    A(String a){
        print(a);
    }
}

class B{
    B(){
        print("B");
    }
    B(String b){
        print(b);
    }
}

public class C extends A{
    private B b;

    C(){
        super("a");
        B b = new B("b");
    }
    public static void main(String[] args){
        C c = new C();
    }
}
