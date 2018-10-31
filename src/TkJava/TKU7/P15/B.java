package TkJava.TKU7.P15;

import static print.Print.println;

public class B extends A {
    public static void main(String[] args){
        B b = new B();
        b.a();
    }
}

class A{
    protected void a(){
        println("A");
    }
}
