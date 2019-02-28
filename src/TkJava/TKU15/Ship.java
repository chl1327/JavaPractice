package TkJava.TKU15;

import net.mindview.util.Generator;

import java.util.ArrayList;
import java.util.Random;

class Product{
    private final int id;
    private String description;
    private double price;
    public Product(int IDnumber, String descr, double price){
        id =IDnumber;
        description = descr;
        this.price = price;
        System.out.println(toString());
    }
    public String toString(){
        return id + ": " + description + ", price: $" + price;
    }
    public void priceChange(double change){
        price += change;
    }
    public static Generator<Product> generator =
            new Generator<Product>() {
                private Random rand = new Random(47);
                @Override
                public Product next() {
                    return new Product(rand.nextInt(1000), "Test",
                            Math.round(rand.nextDouble() * 1000.0)+ 0.99);
                }
            };
}

class Box extends ArrayList<Product>{
    public Box(int nProducts){
        Generators.fill(this,Product.generator,nProducts);
    }
}
class StorageArea extends ArrayList<Box> {
    public StorageArea(int nBoxes, int nItems) {
        for(int i = 0; i < nBoxes; i++)
            add(new Box(nItems));
    }
}
class Deck extends ArrayList<StorageArea> {
    public Deck(int nStorageAreas, int nBoxes, int nItems) {
        for(int i = 0; i < nStorageAreas; i++)
            add(new StorageArea(nBoxes, nItems));
    }
}

class Office {}


public class Ship extends ArrayList<Deck> {
    private Office office;
    public Ship(int nDecks, int nStorageAreas, int nShelves, int nItems) {
        for(int i = 0; i < nDecks; i++)
            add(new Deck(nStorageAreas, nShelves, nItems));
    }
    public String toString() {
        StringBuilder result = new StringBuilder();
        for(Deck d : this)
            for(StorageArea sa : d)
                for(Box s : sa)
                    for(Product i : s) {
                        result.append(i);
                        result.append('\n');
                    }
        return result.toString();
    }
    public static void main(String[] args) {
        System.out.println(new Ship(3, 4, 3, 10));
    }
}
