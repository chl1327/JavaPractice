package TkJava.TKU15;

public class Tuple extends net.mindview.util.Tuple {
    public static <A, B, C, D, E, F> SixTuple<A, B, C, D, E, F> tuple(A a, B b, C c, D d, E e, F f) {
        return new SixTuple(a, b, c, d, e,f);
    }
}
