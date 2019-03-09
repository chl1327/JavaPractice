package TkJava.TKU15.pets;

import static print.Print.print;

public class Hamster extends Rodent {
    public Hamster(String name){super(name);}
    public Hamster(){super();}

    @Override
    public void speak() {
        print(new Hamster()+" speak");
    }

    @Override
    public String toString() {
        return "Hamster";
    }
}
