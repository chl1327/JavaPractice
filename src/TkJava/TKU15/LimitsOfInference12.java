package TkJava.TKU15;

import TkJava.TKU14.pets.Person;
import TkJava.TKU15.pets.Pet;
import net.mindview.util.New;

import java.util.List;
import java.util.Map;

public class LimitsOfInference12 {
    static void f(Map<Person, List<? extends Pet>> petPeople) {}
    public static void main(String[] args) {
        f(New.<Person, List<? extends Pet>>map());
    }

}
