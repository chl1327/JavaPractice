package TkJava.TKU15;


import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.HashMap;
import java.util.Map;

import static TkJava.TKU15.TwoTuple.tuple;
import static print.Print.print;


class TwoTuple<A, B>{
    public final A first;
    public final B second;

    public TwoTuple(A a, B b) {
        this.first = a;
        this.second = b;
    }

    public String toString() {
        return "(" + this.first + ", " + this.second + ")";
    }

    public static <A, B> TwoTuple<A, B> tuple(A a, B b) {
        return new TwoTuple(a, b);
    }
}

class MixinProxyy implements InvocationHandler{
    Map<String,Object> delegatesByMethod;
    public MixinProxyy(TwoTuple<Object,Class<?>>... pairs){
        delegatesByMethod = new HashMap<>();
        for(TwoTuple<Object,Class<?>> pair : pairs){
            for (Method method: pair.second.getMethods()){
                String methodName = method.getName();
                if (!delegatesByMethod.containsKey(methodName)){
                    delegatesByMethod.put(methodName,pair.first);
                }
            }
        }
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args)throws Throwable {
        String methodName = method.getName();
        Object delegate = delegatesByMethod.get(methodName);
        return method.invoke(delegate,args);
    }
    @SuppressWarnings("unchecked")
    public static Object newInstance(TwoTuple...paris){
        Class[] interfaces = new Class[paris.length];
        for(int i=0; i< paris.length; i++){
            interfaces[i] = (Class)paris[i].second;
        }
        ClassLoader cl = paris[0].first.getClass().getClassLoader();
        return Proxy.newProxyInstance(cl,interfaces,new MixinProxyy(paris));
    }
}

public class DynamicProxyMixin {
    public static void main(String[] args){
        Object mixin = MixinProxyy.newInstance(tuple(new BasicImp(),Basic.class),
                tuple(new TimeStampedImp(),TimeStamped.class),
               tuple(new SerialNumberedImp(),SerialNumbered.class),
                tuple(new Colored(),Color.class));
        Basic b = (Basic)mixin;
        TimeStamped t = (TimeStamped)mixin;
        SerialNumbered s = (SerialNumbered)mixin;
        b.set("Hello");
        Color c = (Color)mixin;
        print(b.get());
        print(t.getStamp());
        print(s.getSerialNumber());
        print(c.getColor());
    }
}
