package TkJava.TKU8.P3;


import java.util.Random;

import static print.Print.print;

class Instrument {
    void play(Note n) { print("Instrument.play() " + n); }
    public String toString() { return "Instrument"; }
    void adjust() { print("Adjusting Instrument"); }
}

class Wind extends Instrument {
    void play(Note n) { print("Wind.play() " + n); }
    public String toString() { return "Wind"; }
    void adjust() { print("Adjusting Wind"); }
}

class Percussion extends Instrument {
    void play(Note n) { print("Percussion.play() " + n); }
    public String toString() { return "Percussion"; }
    void adjust() { print("Adjusting Percussion"); }
}

class Stringed extends Instrument {
    void play(Note n) { print("Stringed.play() " + n); }
    public String toString() { return "Stringed"; }
    void adjust() { print("Adjusting Stringed"); }
}

class Brass extends Wind {
    void play(Note n) { print("Brass.play() " + n); }
    public String toString() { return "Brass"; }
    void adjust() { print("Adjusting Brass"); }
}

class Woodwind extends Wind {
    void play(Note n) { print("Woodwind.play() " + n); }
    public String toString() { return "Woodwind"; }
}

class Piano extends Instrument{
    void play(Note n) { print("Piano.play()" + n); }
    public String toString() { return "Piano"; }
    void adjust() { print("Adjusting Piano"); }
}

public class Music6 {
    // Doesn't care about type, so new types
    // added to the system still work right:
    public static void tune(Instrument i) {
        //...
        i.play(Note.MIDDLE_C);
    }
    public static void tuneAll(Instrument[] e) {
        for(Instrument i : e)
            tune(i);
    }
    public static Instrument RandomInstrument(){
        Random rand = new Random();
        switch(rand.nextInt(6)) {
            default:
            case 0: return new Piano();
            case 1: return new Woodwind();
            case 2: return new Brass();
            case 3: return new Stringed();
            case 4: return new Wind();
            case 5: return new Percussion();
        }
    }
    public static void main(String[] args) {
        // Upcasting during addition to the array:
        Instrument[] orchestra = {
                RandomInstrument(),
                RandomInstrument(),
                RandomInstrument(),
                RandomInstrument(),
                RandomInstrument(),
                RandomInstrument()
        };
        tuneAll(orchestra);
        for(Instrument i : orchestra)
            System.out.println(i);

    }
}
