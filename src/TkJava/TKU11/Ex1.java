package TkJava.TKU11;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import static print.Print.print;

class Gerbil {
    private int gerbilNumber;
    public Gerbil(int i) {
        gerbilNumber = i;
    }
    public void hop() {
        System.out.println("Gerbil " + gerbilNumber + " hops");
    }
}

public class Ex1 {
    public static void main(String[] args) {
        ArrayList<Gerbil> gerbils = new ArrayList<Gerbil>();
        for(int i = 0; i < 10; i++)
            gerbils.add(new Gerbil(i));
        for(int i = 0; i < 10; i++)
            gerbils.get(i).hop();
        // or, alternatively, using foreach syntax:
        /*for(Gerbil g : gerbils)
            g.hop();*/
        Iterator<Gerbil> it = gerbils.iterator();
        while(it.hasNext())
            it.next().hop();
        Set<Integer> c = new HashSet<Integer>();
        for (int i = 0; i<10; i++){
            c.add(i);
        }
        for (Integer i:c){
            print(i + ", ");
        }
    }
}