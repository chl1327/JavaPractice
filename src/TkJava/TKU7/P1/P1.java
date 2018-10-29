package TkJava.TKU7.P1;

public class P1 {
    private P2 p2;
    public P1(){
        P2 p2 = new P2();
        p2.test = "22";
        System.out.print(p2.test.toString());
    }
}

class P2{
    String test;
}
