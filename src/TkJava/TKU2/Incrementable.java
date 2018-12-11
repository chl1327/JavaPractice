package TkJava.TKU2;

/**
 * Created by chl1327 on 2018/8/15.
 */
public class Incrementable {
    static void increment() {StaticTest.i++;}

    public static void main(String[] args){
        Incrementable incrementable = new Incrementable();
        incrementable.increment();
        System.out.print(StaticTest.i);
    }
}
