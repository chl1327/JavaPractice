package TkJava.TKU7.P23;

import static print.Print.println;

class Insect {
    private int i = 9;
    protected int j;
    Insect() {
        println("i = " + i + ", j = " + j);
        j = 39;
    }
    private static int x1 = printInit("static Insect.x1 initialized");
    static int printInit(String s) {
        println(s);
        return 47;
    }
}

class Beetle extends Insect {
    private int k = printInit("Beetle.k initialized");
    public Beetle() {
        println("k = " + k);
        println("j = " + j);
    }
    private static int x2 = printInit("static Beetle.x2 initialized");
}

public class Scarab extends Beetle {
    private int n = printInit("Scarab.n initialized");
    public Scarab() {
        println("n = " + n);
        println("j = " + j);
    }
    private static int x3 = printInit("static Scarab.x3 initialized");
    public static void main(String[] args) {
        println("Scarab constructor");
        Scarab sc = new Scarab();
    }
}