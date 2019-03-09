package TkJava.TKU15;

import TkJava.TKU15.pets.Dog;
import TkJava.TKU15.pets.Pet;
import TkJava.TKU15.pets.Pets;
import net.mindview.util.Print;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

import static print.Print.print;

public class Apply {
    public static <T, S extends Iterable<? extends T>> void apply(S seq, Method f,Object... args){
        try{
            for (T t: seq)
                f.invoke(t,args);
        }catch (Exception e){
            throw new RuntimeException(e);
        }
    }
}

class Shape{
    public void rotate(){ print(this + " rotate"); }
    public void resize(int newSize){
        print(this + " resize " + newSize);
    }
}

class Square extends Shape{}

class FilledList<T> extends ArrayList<T>{
    public FilledList(Class<? extends T> type,int size){
        try{
            for (int i=0; i<size; i++)
                add(type.newInstance());
        }catch (Exception e){
            throw new RuntimeException(e);
        }
    }
}

class ApplyTest{
    public static void main(String[] args)throws Exception{
        List<Pet> pets = Pets.arrayList(2);
        Print.print("Random pets: " + pets);
        // Applies the overridden methods:
        Apply.apply(pets, Pet.class.getMethod("speak"));
        // FilledList contains only one type:
        //Apply.apply(new FilledList<Pet>(Dog.class, 5), Pet.class.getMethod("speak"));
    }
}