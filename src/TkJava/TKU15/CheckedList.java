package TkJava.TKU15;

import TkJava.TKU12.Ex2;
import TkJava.TKU15.coffee.Coffee;
import TkJava.TKU15.coffee.Latte;
import TkJava.TKU15.coffee.Mocha;
import TkJava.TKU15.pets.Dog;
import TkJava.TKU15.pets.Pet;
import TkJava.TKU15.pets.Pug;
import TkJava.TKU15.pets.Rodent;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CheckedList {
    @SuppressWarnings("unchecked")
    static void oldStyleMethod(List probablyLatte){
        probablyLatte.add(new Mocha());
    }
    public static void main(String[] args){
        List<Latte> lattes1 = new ArrayList<>();
        //oldStyleMethod(lattes1);
        List<Latte> lattes2 = Collections.checkedList(new ArrayList<Latte>(),Latte.class);
        try{
            oldStyleMethod(lattes2);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        List<Coffee> coffees = Collections.checkedList(new ArrayList<>(),Coffee.class);
        coffees.add(new Latte());
        coffees.add(new Mocha());
    }
}
