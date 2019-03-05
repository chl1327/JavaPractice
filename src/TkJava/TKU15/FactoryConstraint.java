package TkJava.TKU15;

interface FactoryI<T>{
    T create(String s);
}

class Foo2<T>{
    private T x;
    public void get() { System.out.println(x); }
    public <F extends FactoryI<T>> Foo2(F factory,String s){
        x = factory.create(s);
    }
}

class IntegerFactory implements FactoryI<Integer>{
    @Override
    public Integer create(String s) {
        return new Integer(Integer.valueOf(s));
    }
}

class Widget{
    String s;
    public static class Factory implements FactoryI<Widget>{
        @Override
        public Widget create(String s) {
            Widget w = new Widget();
            w.s = s;
            return w;
        }
    }
    public String toString() {
        return "Widget " + s;
    }
}

public class FactoryConstraint {
    public static void main(String[] args){
        Foo2 f1 =new Foo2<Integer>(new IntegerFactory(),"1");
        Foo2 f2 =new Foo2<Widget>(new Widget.Factory(),"2");
        f1.get();
        f2.get();
    }
}
