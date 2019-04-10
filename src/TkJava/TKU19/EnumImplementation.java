package TkJava.TKU19;

import net.mindview.util.Generator;

import java.util.Random;

enum CartoonCharacter{
    SLAPPY,SPANKY,PUNCHY,SILLY,BOUNCY,NUTTY,BOB;
    private static Random rand = new Random(47);
    public static CartoonCharacter next() {
        return values()[rand.nextInt(values().length)];
    }
}

public class EnumImplementation {
    public static <T> void printNext(Generator<T> rg){
        System.out.print(rg.next() + ", ");
    }
    public static void main(String[] args){
        CartoonCharacter cc = CartoonCharacter.BOB;
        for(int i = 0; i < 10; i++){
            System.out.print(cc.next() + " ");
        }
    }
}
