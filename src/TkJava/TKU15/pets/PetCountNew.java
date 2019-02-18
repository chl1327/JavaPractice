package TkJava.TKU15.pets;

import net.mindview.util.TypeCounter;

import static print.Print.print;
import static print.Print.printnb;

public class PetCountNew {
    public static void main(String[] args){
        TypeCounter counter = new TypeCounter(Pet.class);
        for(Pet pet: Pets.createArray(20)){
            printnb(pet.getClass().getSimpleName() + " ");
            counter.count(pet);
        }
        print();
        print(counter);
    }
}
