package TkJava.TKU19;

import java.util.Arrays;
import java.util.Random;

import static print.Print.print;
import static print.Print.printnb;

public enum VowelsAndConsonants5 {
    VOWEL('a', 'e', 'i', 'o', 'u'),
    SOMETIMES_A_VOWEL('w', 'y'),
    CONSONANT('b', 'c', 'd', 'f', 'g', 'h', 'j', 'k', 'l', 'm',
            'n', 'p', 'q', 'r', 's', 't', 'v', 'x', 'z');
    private Character[] letters;
    private VowelsAndConsonants5(Character... letters) {
        this.letters = letters;
    }
    public static VowelsAndConsonants5 LetterType(Character c) {
        if(Arrays.asList(VOWEL.letters).contains(c)) return VOWEL;
        if(Arrays.asList(SOMETIMES_A_VOWEL.letters).contains(c))
            return SOMETIMES_A_VOWEL;
        return CONSONANT;
    }
    public static void main(String[] args) {
        Random rand = new Random();
        for(int i = 0; i < 100; i++) {
            int c = rand.nextInt(26) + 'a';
            printnb((char)c + ", " + c + ": ");
            print(LetterType((char)c));
        }
    }
}