package TkJava.TKU15;

abstract class SelfA<T extends SelfA<T>>{
    abstract T setItem(T item);
    T settle (T item){
        System.out.println("settle(T item)");
        return setItem(item);
    }
}

class SelfB extends SelfA<SelfB>{
    @Override
    SelfB setItem(SelfB item) {
        System.out.println("setItem(SelfB item)");
        return item;
    }
}
public class SelfGeneric {
    public static void main(String[] args){
        SelfB selfB = new SelfB();
        selfB.setItem(selfB).settle(selfB);
    }
}
