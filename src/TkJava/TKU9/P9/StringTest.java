package TkJava.TKU9.P9;


class A implements Processor{
    public String name() { return "StringMixerAdapter"; }
    StringMixer stringMixer;
    public A(StringMixer stringMixer) {
        this.stringMixer = stringMixer;
    }
    public String process(Object input) {
        return stringMixer.process((String)input);
    }
}

public class StringTest {
    public static void main(String[] args) {
        String s = new String(args[0]);
        Apply.process(new A(new StringMixer()), s);
    }
}
