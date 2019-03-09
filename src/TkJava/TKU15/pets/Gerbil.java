package TkJava.TKU15.pets;

import static print.Print.print;

public class Gerbil extends Rodent {
    public Gerbil(String name){ super(name);}
    public Gerbil(){super();}

    @Override
    public void speak() {
        print(new Gerbil()+" speak");
    }
    @Override
    public String toString() {
        return "Gerbil";
    }
}
