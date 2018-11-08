package TkJava.TKU8.P1;

import static print.Print.println;

public class Cycle {
    public Cycle ride(){
        println("ride Cycle");
        return new Cycle();
    }
    public static void main(String[] args){
        Unicycle unicycle = new Unicycle();
        unicycle.ride();
    }
}

class Unicycle extends Cycle{
    public Cycle ride(){
        return new Unicycle();
    }
}

class Bicycle extends Cycle{
    public Cycle ride(){
        return new Bicycle();
    }
}

class Tricycle extends Cycle{
    public Cycle ride(){
        return new Tricycle();
    }
}