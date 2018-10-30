package TkJava.TKU7.P9;

import static print.Print.println;

class Component1 {
    Component1() { println("Component1()"); }
    Component1(int i){ println("Component1("+ i + ")"); }
    void dispose(){ println("Component1.dispose");}
}

class Component2 {
    Component2() { println("Component2()"); }
    Component2(byte i){ println("Component1("+ i + ")"); }
    void dispose(){ println("Component2.dispose");}

}

class Component3 {
    Component3() { println("Component3()"); }
    Component3(long i){ println("Component1("+ i + ")"); }
    void dispose(){ println("Component3.dispose");}
}

class Root {
    Component1 c1root;
    Component2 c2root;
    Component3 c3root;
    Root() { println("Root()"); }
    Root(double f) {
        c1root = new Component1((int)1);
        c2root = new Component2((byte) 2);
        c3root = new Component3(3L);
        println("Root(foat)");
    }
    void dispose(){
        c1root.dispose();
        c2root.dispose();
        c3root.dispose();
        println("Root.dispose");
    }
}

class Stem extends Root {
    Component1 c1stem;
    Component2 c2stem;
    Component3 c3stem;
    Stem() { println("Stem()"); }
    Stem(boolean i){
        super(1.0);
        c1stem = new Component1( 1);
        c2stem = new Component2((byte) 2);
        c3stem = new Component3(3L);
    }
    void dispose(){
        super.dispose();
        println("Stem.dispose");
    }
    public static void main(String[] args) {
        Stem s = new Stem(true);
        try{

        }finally {
            s.dispose();
        }
    }
}