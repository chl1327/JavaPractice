package TkJava.TKU15;

import TkJava.TKU15.pets.Pet;
import TkJava.TKU15.pets.Pets;

import java.util.ArrayList;
import java.util.Random;

public class RandomList<T> {
    private ArrayList<T> storage = new ArrayList<T>();
    private Random rand = new Random(47);
    public void add(T item) { storage.add(item); }
    public T select() {
        return storage.get(rand.nextInt(storage.size()));
    }
    public static void main(String[] args) {
        RandomList<String> rs = new RandomList<String>();
        for(String s : ("The quick brown fox jumped over " +
                "the lazy brown dog").split(" "))
            rs.add(s);
        for(int i = 0; i < 11; i++)
            System.out.print(rs.select() + " ");
        System.out.println();
        RandomList<Integer> ri = new RandomList<Integer>();
        for(int i = 0; i < 11; i++)
            ri.add(i); // autboxing
        for(int i = 0; i < 11; i++)
            System.out.print(ri.select() + " ");
        System.out.println();
        RandomList<Pet> rp = new RandomList<Pet>();
        for(Pet p : Pets.arrayList(10))
            rp.add(p);
        for(int i = 0; i < 11; i++)
            System.out.print(rp.select() + " ");
    }
}