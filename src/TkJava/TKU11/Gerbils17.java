package TkJava.TKU11;

import java.util.*;

public class Gerbils17 {
    public static void main(String[] args) {
        Map<String, Gerbil> gerbils = new HashMap<String, Gerbil>();
        gerbils.put("Fuzzy", new Gerbil(0));
        gerbils.put("Spot", new Gerbil(1));
        gerbils.put("Speedy", new Gerbil(2));
        gerbils.put("Dopey", new Gerbil(3));
        gerbils.put("Sleepy", new Gerbil(4));
        gerbils.put("Happy", new Gerbil(5));
        Iterator<String> it = gerbils.keySet().iterator();
        while(it.hasNext()) {
            String s = it.next();
            System.out.print(s + ": ");
            gerbils.get(s).hop();
        }
        Set<String> sortedKeys =
                new LinkedHashSet<>(gerbils.keySet());
        System.out.println(sortedKeys);
        System.out.println();
        Map<String, Gerbil> sortedGerbils =
                new LinkedHashMap<String, Gerbil>();
        for(String s : sortedKeys) {
            System.out.print("Adding " + s + ", ");
            sortedGerbils.put(s, gerbils.get(s));
        }
        System.out.println();
        System.out.println();
        System.out.println(sortedGerbils);
        System.out.println();
        // or, just:
        Map<String, Gerbil> sortedGerbils2 =
                new TreeMap<String, Gerbil>(gerbils);
        System.out.println(sortedGerbils2);
    }
}