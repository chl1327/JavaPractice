package TkJava.TKU10.P5;

interface Ex9Interface {
    void say(String s);
}

public class Ex9 {
    Ex9Interface f(Boolean b) {
        if (b) {
            class Inner implements Ex9Interface {
                public void say(String s) {
                    System.out.println(s);
                }
            }
            return new Inner();
        }
        return null;
    }
    public static void main(String[] args) {
        Ex9 x = new Ex9();
        x.f(true).say("hi");
    }
}