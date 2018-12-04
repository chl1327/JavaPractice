package TkJava.TKU9.P6;

import static print.Print.println;

interface Rodent {
    String name = "Rodent";
    void eat();
    void run();
    void sleep();
    String toString();
}

class Mouse implements Rodent {
    private String name = "Mouse";
    public void eat() { println("Mouse.eat()"); }
    public void run() { println("Mouse.run()"); }
    public void sleep() { println("Mouse.sleep()"); }
    public String toString() { return name; }
}

class Rat implements Rodent {
    private String name = "Rat";
    public void eat() { println("Rat.eat()"); }
    public void run() { println("Rat.run()"); }
    public void sleep() { println("Rat.sleep()"); }
    public String toString() { return name; }
}

class Squirrel implements Rodent {
    private String name = "Squirrel";
    public void eat() { println("Squirrel.eat()"); }
    public void run() { println("Squirrel.run()"); }
    public void sleep() { println("Squirrel.sleep()"); }
    public String toString() { return name; }
}

public class Rodent1 {
    private static RandomRodentGenerator1 gen = new RandomRodentGenerator1();
    public static void main(String[] args) {
        // Error: cannot instantiate abstract class:
        // Rodent x = new Rodent();
        // But OK to create array to be downcast to derived objects:
        Rodent[] rodents = new Rodent[10];
        for(Rodent r : rodents) {
            r = gen.next();
            println(r + ": ");
            r.eat();
            r.run();
            r.sleep();
        }
    }
}