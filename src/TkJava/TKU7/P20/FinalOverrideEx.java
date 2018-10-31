package TkJava.TKU7.P20;

import static print.Print.println;

class WithFinal {
    final void f() { println("WithFinal.f()"); }
    void g() { println("WithFinal.g()"); }
    final void h() { println("WitFinal.h()"); }
}

class OverrideFinal extends WithFinal {
    // attempt to override:
    // public final void f() { print("OverrideFinal.f()"); } // no can do
    @Override public void g() { println("OverrideFinal.g()"); } // OK, not final
    // final void h(); { print("OVerrideFinal.h()"); } // cannot override final
}

public class FinalOverrideEx {
    public static void main(String[] args) {
        OverrideFinal of = new OverrideFinal();
        of.f();
        of.g();
        of.h();
        // Upcast:
        WithFinal wf = of;
        wf.f();
        wf.g();
        wf.h();
    }
}