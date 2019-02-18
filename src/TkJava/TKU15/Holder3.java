package TkJava.TKU15;

import TkJava.TKU15.pets.Dog;
import TkJava.TKU15.pets.Pet;

public class Holder3<T> {
    private T a;
    public Holder3(T a){
        this.a = a;
    }

    public void set(T a){
        this.a = a;
    }

    public T get(){
        return a;
    }

    public static void main(String[] args){
        Holder3<Pet> h3 = new Holder3<>(new Pet());
        Pet p = h3.get();
        Holder3<Dog> holder3 = new Holder3<>(new Dog());
        Dog d = holder3.get();
    }
}
