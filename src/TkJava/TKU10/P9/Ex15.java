package TkJava.TKU10.P9;

import static print.Print.print;

class A{
    public A(String a){
        print("A :" + a);
    }
}

public class Ex15 {
    A makerA(String s){
        return new A(s){};
    }
    public static void main(String[] args){
        Ex15 x = new Ex15();
        System.out.println(x.makerA("hi"));
    }
}
