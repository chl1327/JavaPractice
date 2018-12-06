package TkJava.TKU10.P6;

import static print.Print.print;

class Test{
    private class Ex11inner implements Ex11Interface{
        public void say(String s){
            print(s);
        }
    }
    Ex11Interface f() {
        return new Ex11inner();
    }
}

public class Ex11 {
    public static void main(String[] args) {
        Test t = new Test();
        t.f().say("hi");
        // Error: cannot find symbol: class Inner:
        // ((Ex11inner)t.f()).say("hello");
    }
}
