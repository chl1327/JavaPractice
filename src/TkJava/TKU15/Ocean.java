package TkJava.TKU15;

import net.mindview.util.Generator;

import java.util.*;

class BigFish{
    private static long counter = 1;
    private final long id = counter++;
    private BigFish(){}
    public String toString(){
        return "BigFish "+ id;
    }
    public static Generator<BigFish> generator(){
        return new Generator<BigFish>() {
            @Override
            public BigFish next() {
                return new BigFish();
            }
        };
    }
}

class LittleFish{
    private static long counter = 1;
    private final long id = counter++;
    private LittleFish(){}
    public String toString(){
        return "LittleFish "+ id;
    }
    public static Generator<LittleFish> generator(){
        return new Generator<LittleFish>() {
            @Override
            public LittleFish next() {
                return new LittleFish();
            }
        };
    }
}

public class Ocean {
    public static void eat(BigFish b, LittleFish l){
        System.out.println(b + " eat " + l);
    }
    public static void main(String[] args){
        Random rand = new Random(47);
        Queue<LittleFish> line = new LinkedList<>();
        Generators.fill(line, LittleFish.generator(), 15);
        List<BigFish> bigFishs = new ArrayList<>();
        Generators.fill(bigFishs,BigFish.generator(),4);
        for(LittleFish l:line){
            eat(bigFishs.get(rand.nextInt(bigFishs.size())),l);
        }
    }
}
