package TkJava.TKU14;

import TkJava.TKU14.secret.*;
import java.lang.reflect.Method;
import static print.Print.println;

public class Finder {
    public static void main(String[] args) throws Exception {
        TkJava.TKU14.secret.A a = SecretMaker.makeSecret();
        println("a is of class type: " + a.getClass().getName());
        for(Method m : a.getClass().getDeclaredMethods()) {
            m.setAccessible(true);
            m.invoke(a);
        }
    }
}
