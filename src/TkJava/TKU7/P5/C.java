package TkJava.TKU7.P5;

import static print.Print.print;

class A{
    A(){
        print("A");
    }
}

class B{
    B(){
        print("B");
    }
}

public class C extends A{
    private B b;
    public static void main(String[] args){
        C c = new C();
    }
}
