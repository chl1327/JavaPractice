package TkJava.TKU7.P16;

import static print.Print.println;

class Amphibian {
    protected void swim() {
        println("Amphibian swim");
    }
    protected void speak() {
        println("Amphibian speak");
    }
    void eat() {
        println("Amphibian eat");
    }
    static void grow(Amphibian a) {
        println("Amphibian grow");
        a.eat();
    }
}

public class Frog extends Amphibian {
    @Override protected void swim() {
        println("Frog swim");
    }
    @Override protected void speak() {
        println("Frog speak");
    }
    @Override void eat() {
        println("Frog eat");
    }
    static void grow(Amphibian a) {
        println("Frog grow");
        a.eat();
    }
    public static void main(String[] args) {
        Frog f = new Frog();
        // call base-class methods:
        f.swim();
        f.speak();
        f.eat();
        f.grow(f);
        // upcast Frog to Amphibian argument:
        Amphibian.grow(f);
    }
}