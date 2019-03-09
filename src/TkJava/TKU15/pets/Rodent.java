package TkJava.TKU15.pets;

import static print.Print.print;

public class Rodent extends Pet {
    public Rodent(String name){super(name);}
    public Rodent(){super();}

    @Override
    public void speak() {
        print(new Rodent()+" speak");
    }
    @Override
    public String toString() {
        return "Rodent";
    }
}
