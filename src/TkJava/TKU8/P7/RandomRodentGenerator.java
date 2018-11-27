package TkJava.TKU8.P7;

import java.util.Random;

public class RandomRodentGenerator {
    private Random rand = new Random();
    public Rodent next() {
        switch(rand.nextInt(3)) {
            default:
            case 0: return new Mouse();
            case 1: return new Rat();
            case 2: return new Squirrel();
        }
    }
}
