package TkJava.TKU15;

interface A1 {
    void f();
    void g();
}

class A3 implements A1{
    public void f() { System.out.println("A3.f()"); }
    public void g() { System.out.println("A3.g()"); }
    public void h() { System.out.println("A3.h()"); }
}

class G {
    public static <T extends A1> void j(T x) {
        x.f();
        x.g();
    }
}

public class Ex20 {
    public static void main(String[] args) {
        A3 a3 = new A3();
        G.j(a3);
    }
}
