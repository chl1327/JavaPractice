package TkJava.TKU11;

import java.util.ArrayList;
import java.util.List;

import static print.Print.print;

class Tester {
    public static int counter = 0;
    private int id = counter++;
    public String toString() { return String.valueOf(id); }
}

public class Ex7 {
    public static void main(String[] args) {
        Tester[] t = new Tester[10];
        for(int i = 0; i < t.length; i++)
            t[i] = new Tester();
        List<Tester> lt = new ArrayList<Tester>();
        for(Tester x : t) lt.add(x);
        print("list of Tester: " + lt);
        List<Tester> sub = lt.subList(2, 6);
        print("subList: " + sub);
        // produces run time ConcurrentModificationException:
        // lt.removeAll(sub);
        // so, first make copy, remove sub, re-assign lt:
        List<Tester> copy = new ArrayList<Tester>(lt);
        copy.removeAll(sub);
        print("copy: " + copy);
        lt = copy;
        print("list of Tester: " + lt);
    }
}
