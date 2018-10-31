package TkJava.TKU7.P21;

import static print.Print.println;

class WithFinals {
    // Identical to private alone:
    private final void f() { println("WithFinals.f()"); }
    // Also automatically "final":
    private void g() { println("WithFinals.g()"); }
}

class OverridingPrivate extends WithFinals {
    // attempt to override:
    private final void f() { println("OverridingPrivate.f()"); }
    private void g() { println("OverridingPrivate.g()"); }
    // @Override: compiler finds error - does NOT override
    // @Override private final void f() { print("OverridingPrivate.f()"); }
    // @Override private void g() { print("OverridingPrivate.g()"); }
}

class OverridingPrivate2 extends OverridingPrivate {
    // attempt to override:
    public final void f() { println("OverridingPrivate2.f()"); }
    public void g() { println("OverridingPrivate2.g()"); }
    // use @Override so compiler with say "does NOT override or implement"
    // @Override public final void f() { print("OverridingPrivate2.f()"); }
    // @Override public void g() { print("OverridingPrivate2.g()"); }
}

public class FinalOverridingIllusionEx {
    public static void main(String[] args) {
        OverridingPrivate2 op2 = new OverridingPrivate2();
        op2.f();
        op2.g();
        // You can upcast:
        OverridingPrivate op = op2;
        // But you can't call the methods:
        //! op.f(); // f() has private access in OverridingPrivate
        //! op.f();
        // Same here:
        WithFinals wf = op2;
        //! wf.f(); // f() has private access in WithFinals
        //! wf.g();
    }
}