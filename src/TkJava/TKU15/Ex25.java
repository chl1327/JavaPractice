package TkJava.TKU15;

import static print.Print.println;

interface Z{

}
interface V{

}

class S implements Z,V{
    public String toString() { return "S"; }
}

public class Ex25 {
    <T extends Z> void z(T t) { System.out.println("z(" + t + ")"); }
    <T extends V> void v(T t) { System.out.println("v(" + t + ")"); }
    public static void main(String[] args){
        S s = new S();
        Ex25 ex = new Ex25();
        ex.z(s);
        ex.v(s);
    }
}
