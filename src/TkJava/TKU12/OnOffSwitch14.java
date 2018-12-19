package TkJava.TKU12;

public class OnOffSwitch14 {
    private static Switch sw = new Switch();
    static Integer[] x = new Integer[1];
    public static void f(int i)
            throws OnOffException1, OnOffException2 {}
    public static void main(String[] args) {
        try {
            sw.on();
            // Code that can throw RuntimeException
            // and leave Switch on:
            f(x[0]);
            sw.off();
        } catch(OnOffException1 e) {
            System.out.println("OnOffException1");
            sw.off();
        } catch(OnOffException2 e) {
            System.out.println("OnOffException2");
            sw.off();
        }
    }
}
