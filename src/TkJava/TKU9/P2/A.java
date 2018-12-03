package TkJava.TKU9.P2;


import static print.Print.println;

abstract class B{
    B(){
        println("class B");
    }
}

abstract class C{

}

class D extends B{
    D(){println("class D");}
}

public class A {
    public static void main(String[] args){
        //B b = new B();
        //C c= new C();
        D d = new D();
    }
}
