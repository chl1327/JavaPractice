package TkJava.TKU14.pets;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class LiteralPetCreator extends PetCreator {
    @SuppressWarnings("unchecked")
    public static final List<Class<? extends Pet>> allTypes =
            Collections.unmodifiableList(Arrays.asList(
                    Pet.class,Dog.class,Hamster.class,Mouse.class,
                    Pet.class,Pug.class,Rodent.class,Gerbil.class
            ));
    private static final List<Class<? extends Pet>> types =
            allTypes.subList(allTypes.indexOf(Mouse.class),allTypes.size());
    public List<Class<? extends Pet>> types(){
        return types;
    }
    public static void main(String[] args){
        System.out.println(types);
    }
}
