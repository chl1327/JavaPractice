package TkJava;

class A{
    public A (){
        System.out.println("A");
    }
}

class B extends A{
    public B(){
        System.out.println("B");
    }
}

public class Interview {
public static void main (String[] args){
    A a= new B();
}

}
