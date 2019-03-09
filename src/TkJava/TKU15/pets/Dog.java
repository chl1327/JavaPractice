package TkJava.TKU15.pets;

import static print.Print.print;

public class Dog extends Pet {
    public Dog(String name){ super(name);}
    public Dog(){super();}

    @Override
    public void speak() {
        print(new Dog()+" speak");
    }

    @Override
    public String toString() {
        return "Dog";
    }
}
