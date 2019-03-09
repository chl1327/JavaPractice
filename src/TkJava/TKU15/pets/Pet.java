package TkJava.TKU15.pets;

import static print.Print.print;

public class Pet {
    public Pet(String name){super();}
    public Pet(){super();}
    public void speak(){
        print(new Pet()+" speak");
    }
    public String toString(){
        return "Pet";
    }
}
