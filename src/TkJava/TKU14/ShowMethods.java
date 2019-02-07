package TkJava.TKU14;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.regex.Pattern;

import static print.Print.print;

public class ShowMethods {
    private static String usage = "usage:\n" +
            "ShowMethods qualified.class.name\n" +
            "To show all methods in class or:\n" +
            "ShowMethods qualified.class.name word\n" +
            "To search for methods involving 'word'";
    private static Pattern p = Pattern.compile("(\\w+\\.)|\\s*final|\\s*native");
    private static String[] ss = {"TkJava.TKU14.ShowMethods","ShowMethods"};

    public native int hashCode();



    public static void main(String[] args){
        if (ss.length <1){
            print(usage);
            System.exit(0);
        }
        int lines = 0;
        try{
            Class<?> c = Class.forName(ss[0]);
            Method[] methods = c.getMethods();
            Constructor[] ctors = c.getConstructors();
            if (ss.length == 1) {
                for (Method method : methods)
                    print(p.matcher(method.toString()).replaceAll(""));
                for (Constructor ctor : ctors)
                    print(p.matcher(ctor.toString()).replaceAll(""));
                lines = methods.length + ctors.length;
            }else {
                for (Method method : methods)
                    if (method.toString().indexOf(ss[1]) != -1) {
                        print(p.matcher(method.toString()).replaceAll(""));
                        lines++;
                }
                for (Constructor ctor : ctors)
                    if (ctor.toString().indexOf(ss[1]) != -1) {
                        print(p.matcher(ctor.toString()).replaceAll(""));
                    lines++;
                }
            }
        }catch (ClassNotFoundException e){
            print("No such class: " + e);
        }
    }
}
