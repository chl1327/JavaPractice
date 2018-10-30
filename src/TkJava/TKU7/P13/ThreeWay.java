package TkJava.TKU7.P13;

import static print.Print.println;

class ThreeWay {
    void number(byte b) { println(b); }
    void number(short s) { println(s); }
    void number(int i) { println(i); }
}

class Overload extends ThreeWay {
    void number(float f) { println(f); }
    public static void main(String[] args) {
        Overload ov = new Overload();
        ov.number((byte)0);
        ov.number((short)1);
        ov.number(2);
        ov.number(3.0f);
    }
}