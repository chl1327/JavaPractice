package TkJava.TKU14;

import net.mindview.util.Print;

import java.util.Date;

import static print.Print.print;

interface Interface{
    void doSomething();
    void somethingElse(String arg);
}

class RealObject implements Interface{
    public void doSomething() { print("doSomething"); }
    public void somethingElse(String arg){
        print("somethingElse " + arg);
    }
}

class SimpleProxy implements Interface{
    private Interface proxied;
    private static int doCount = 0;
    private static int sECount = 0;
    public SimpleProxy(Interface proxied){
        this.proxied = proxied;
    }
    public void doSomething() {
        long timeIn = new Date().getTime();
        Print.print("Time called doSomething() " + doCount + ": " + timeIn + " msecs");
        Print.print("on " + new Date());
        doCount++;
        proxied.doSomething();
        Print.print("Call-return time = " + ((new Date().getTime()) - timeIn) + " msecs");
    }
    public void somethingElse(String arg){
        long timeIn = new Date().getTime();
        Print.print("Time called somethingElse() " + sECount + ": " + timeIn + " msecs");
        Print.print("on " + new Date());
        sECount++;
        proxied.somethingElse(arg);
        Print.print("Call-return time = " + ((new Date().getTime()) - timeIn) + " msecs");
    }
}

public class SimpleProxyDemo {
    public static void consumer(Interface iface){
        iface.doSomething();
        iface.somethingElse("bonobo");
    }
    public static void main(String[] args){
        consumer(new RealObject());
        Print.print();
        consumer(new SimpleProxy(new RealObject()));
        Print.print();
        consumer(new SimpleProxy(new RealObject()));
        Print.print();
        consumer(new SimpleProxy(new RealObject()));
    }
}
