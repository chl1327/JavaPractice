package TkJava.TKU14;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Date;

import static print.Print.println;

class DynamicProxyHandle implements InvocationHandler{
    private Object proxied;
    public DynamicProxyHandle(Object proxied){
        this.proxied = proxied;
    }
    public Object invoke(Object proxy, Method method, Object[] args)throws Throwable{
        long timeIn = new Date().getTime();
        System.out.println("**** proxy: " + proxy.getClass() +
                ", method: " + method + ", args: " + args +
                ", invoked at " + timeIn + " on " + (new Date()));
        if(args != null)
            for(Object arg : args)
                System.out.println("  " + args);
        long timeOut = new Date().getTime();
        //System.out.println("proxy: " + proxy);
        System.out.println("Method call-return time: " + (timeOut - timeIn) + " msecs");
        return method.invoke(proxied, args);
    }
}


public class SimpleDynamicProxy {
    public static void consumer(Interface iface){
        iface.doSomething();
        iface.somethingElse("bonobo");
    }
    public static void main(String[] args){
        RealObject real = new RealObject();
        consumer(real);
        Interface proxy = (Interface) Proxy.newProxyInstance(
                Interface.class.getClassLoader(),
                new Class[]{ Interface.class},
                new DynamicProxyHandle(real)
        );
        consumer(proxy);
    }
}
