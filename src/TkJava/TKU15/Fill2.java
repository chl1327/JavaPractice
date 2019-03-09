package TkJava.TKU15;

import TkJava.TKU11.Queue27;
import TkJava.TKU15.pets.Dog;
import TkJava.TKU15.pets.Gerbil;
import TkJava.TKU15.pets.Pet;
import TkJava.TKU15.pets.Pug;
import TkJava.TKU5.Doc;
import net.mindview.util.Generator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Queue;

import static net.mindview.util.Print.print;

interface Addable<T>{
    void add(T t);
}

class SimpleQueue<T>{
    public void add(T item){

    }
}

public class Fill2 {
    public static <T> void fill(Addable<T> addable, Class<? extends T> classToken, int size){
        for (int i=0; i< size; i++) {
            try {
                addable.add(classToken.newInstance());
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }
    public static <T> void fill(Addable<T> addable, Generator<T> generator, int size){
        for(int i = 0; i<size; i++){
            addable.add(generator.next());
        }
    }
}

class AddableCollectionAdapter<T> implements Addable<T>{
    private Collection<T> c;
    public AddableCollectionAdapter(Collection<T> c){
        this.c = c;
    }
    public void add(T item){c.add(item);}
}

class Adapter{
    public static <T> Addable<T> collectionAdapter(Collection<T> c){
        return new AddableCollectionAdapter<>(c);
    }
}

class AddableSimpleQueue<T> extends SimpleQueue<T> implements Addable<T>{
    public void add(T item){ super.add(item);}
}

class Fill2Test{
    public static void main(String[] args) {
        // Adapt a collection:
        List<Pet> pets = new ArrayList<Pet>();
        Fill2.fill(
                new AddableCollectionAdapter<Pet>(pets),
                Pet.class, 3);
        // Helper method captures the type:
        Fill2.fill(Adapter.collectionAdapter(pets), Dog.class, 2);
        for(Pet p : pets) print(p);
        print("---------------");
        // Use an adapted class:
        AddableSimpleQueue<Pet> petQueue =
                new AddableSimpleQueue<Pet>();
        Fill2.fill(petQueue, Pug.class, 4);
        Fill2.fill(petQueue, Gerbil.class, 1);
        //for(Pet p : petQueue) print(p);
    }
}