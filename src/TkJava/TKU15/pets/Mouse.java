package TkJava.TKU15.pets;

import static print.Print.print;

public class Mouse extends Rodent {
    public Mouse(String name){super(name);}
    public Mouse(){super();}

    @Override
    public void speak() {
        print(new Mouse()+" speak");
    }
    @Override
    public String toString() {
        return "Mouse";
    }
}
