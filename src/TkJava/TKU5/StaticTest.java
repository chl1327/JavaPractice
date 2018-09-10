package TkJava.TKU5;

public class StaticTest {
    static String sat;
    static String sat0 = "123";

    static {
        sat="321";
    }

    static void print(){
        System.out.println(sat);
        System.out.println(sat0);
    }

    public static void main(String[]args){
        print();
    }

}
