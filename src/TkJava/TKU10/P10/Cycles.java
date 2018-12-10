package TkJava.TKU10.P10;

import static print.Print.println;

interface Cycle {
    void ride();
}

interface CycleFactory {
    Cycle getCycle();
}

class Unicycle implements Cycle {
    private Unicycle() { println("Unicycle()"); }
    public void ride() { println("Ride Unicycle"); }
    public static CycleFactory factory =
            new CycleFactory() {
                public Cycle getCycle() { return new Unicycle(); }
            };
}

class Bicycle implements Cycle {
    private Bicycle() { println("Bicycle()"); }
    public void ride() { println("Ride Bicycle"); }
    public static CycleFactory factory =
            new CycleFactory() {
                public Cycle getCycle() { return new Bicycle(); }
            };
}

class Tricycle implements Cycle {
    private Tricycle() { println("Tricycle()"); }
    public void ride() { println("Ride Tricycle"); }
    public static CycleFactory factory =
            new CycleFactory() {
                public Cycle getCycle() { return new Tricycle(); }
            };
}

public class Cycles {
    public static void rideCycle(CycleFactory factory) {
        Cycle c = factory.getCycle();
        c.ride();
    }
    public static void main(String [] args) {
        rideCycle(Unicycle.factory);
        rideCycle(Bicycle.factory);
        rideCycle(Tricycle.factory);
    }
}
