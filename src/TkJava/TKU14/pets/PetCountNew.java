package TkJava.TKU14.pets;

import net.mindview.util.TypeCounter;

import static print.Print.*;

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
