package TkJava.TKU14;

import net.mindview.util.Print;

import java.lang.reflect.InvocationTargetException;

import static print.Print.print;
import static print.Print.println;

interface HasBatteries{}
interface Waterproof{}
interface Shoots{}
interface Gans{}
class Toy{
    Toy() {
        Print.print("Creating Toy() object");
    }
    Toy(int i) {
        Print.print("Creating Toy(" + i + ") object");
    }
}

class FancyToy extends Toy implements HasBatteries,Waterproof,Shoots,Gans{
    FancyToy() {super(1);}
}

public class ToyTest {
    static void printInfo(Class cc){
        print("Class name: " + cc.getName() +
        " is interface? [" + cc.isInterface() + "]");
        print("Simple name: " + cc.getSimpleName());
        print("Canonical nanme: "+ cc.getCanonicalName());
    }

    public static void main (String[] args){
        Class c = null;
        try{
            c = Class.forName("TkJava.TKU14.FancyToy");
        }catch (ClassNotFoundException e){
            print("Can't find FancyToy");
            System.exit(1);
        }
        printInfo(c);
        for(Class face: c.getInterfaces())
            printInfo(face);
        Class up = c.getSuperclass();
        Object obj = null;
        try{
            obj = up.newInstance();
        }catch (InstantiationException e){
            print("Cannot instantiate");
            System.exit(1);
        }catch (IllegalAccessException e){
            print("Cannot access");
            System.exit(1);
        }
        printInfo(obj.getClass());
        try {
            Toy.class.getDeclaredConstructor(int.class).newInstance(1);
            // catch four exceptions:
        } catch(NoSuchMethodException e) {
            Print.print("No such method: " + e);
        } catch(InstantiationException e) {
            Print.print("Unable make Toy: " + e);
        } catch(IllegalAccessException e) {
            Print.print("Unable access: " + e);
        } catch(InvocationTargetException e) {
            Print.print("Target invocation problem: " + e);
        }
    }
}
