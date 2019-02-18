package TkJava.TKU15.pets;

import java.util.ArrayList;
import java.util.List;

public class ForNameCreator extends PetCreator {
    private static List<Class<? extends Pet>> types =
            new ArrayList<Class<? extends Pet>>();
    private static String[] typeNames = {
            "TkJava.TKU14.pes.Pug",
            "TkJava.TKU14.pes.Hamster",
            "TkJava.TKU14.pes.Mouse"
    };
    @SuppressWarnings("unchecked")
    private static void loader(){
        try{
            for(String name: typeNames)
                types.add((Class<? extends Pet>)Class.forName(name));
        }catch (ClassNotFoundException e){
            throw new RuntimeException(e);
        }
    }
    static { loader();}
    public List<Class<? extends Pet>> types() { return types; }
}
