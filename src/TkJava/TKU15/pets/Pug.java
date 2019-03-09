package TkJava.TKU15.pets;

import static print.Print.print;

public class Pug extends Dog {
    public Pug(String name){super(name);}
    public Pug(){super();}

    @Override
    public void speak() {
        print(new Pug()+" speak");
    }
    @Override
    public String toString() {
        return "Pug";
    }
}
