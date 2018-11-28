package TkJava.TKU8.P9;

import java.util.Random;

public class RandomRodentGenerator {
    private Random rand = new Random();
    protected Shared shared = new Shared();
    public Rodent next() {
        switch(rand.nextInt(3)) {
            default:
            case 0: return new Mouse(shared);
            case 1: return new Rat(shared);
            case 2: return new Squirrel(shared);
        }
    }
}
