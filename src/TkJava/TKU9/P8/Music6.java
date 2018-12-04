package TkJava.TKU9.P8;


import TkJava.TKU8.P3.Note;

import java.util.Random;

import static print.Print.print;

interface Playable{
    void play(Note n);
}


abstract class Instrument {
    private int i;
    public String toString() { return "Instrument"; }
    public abstract void adjust();
}

class Wind extends Instrument implements Playable {
    public void play(Note n) { print("Wind.play() " + n); }
    public String toString() { return "Wind"; }
    public void adjust() { print("Adjusting Wind"); }
}

class Percussion extends Instrument implements Playable {
    public void play(Note n) { print("Percussion.play() " + n); }
    public String toString() { return "Percussion"; }
    public void adjust() { print("Adjusting Percussion"); }
}

class Stringed extends Instrument implements Playable {
    public void play(Note n) { print("Stringed.play() " + n); }
    public String toString() { return "Stringed"; }
    public void adjust() { print("Adjusting Stringed"); }
}

class Brass extends Wind {
    public void play(Note n) { print("Brass.play() " + n); }
    public String toString() { return "Brass"; }
    public void adjust() { print("Adjusting Brass"); }
}

class Woodwind extends Wind {
    public void play(Note n) { print("Woodwind.play() " + n); }
    public String toString() { return "Woodwind"; }
}

class Piano extends Instrument {
    public void play(Note n) { print("Piano.play()" + n); }
    public String toString() { return "Piano"; }
    public void adjust() { print("Adjusting Piano"); }
}

public class Music6 {
    // Doesn't care about type, so new types
    // added to the system still work right:
    public static void tune(Playable i) {
        //...
        i.play(Note.MIDDLE_C);
    }
    public static void tuneAll(Playable[] e) {
        for(Playable i : e)
            tune(i);
    }
    /*public static Playable RandomInstrument(){
        Random rand = new Random();
        switch(rand.nextInt(4)) {
            default:
            case 0: return new Piano();
            case 1: return new Woodwind();
            case 2: return new Brass();
            case 3: return new Stringed();
        }
    }*/
    public static void main(String[] args) {
        // Upcasting during addition to the array:
        Playable[] orchestra = {
                new Wind(),
                new Percussion(),
                new Stringed(),
                new Brass(),
                new Woodwind()
        };
        tuneAll(orchestra);

    }
}
