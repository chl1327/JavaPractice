package TkJava.TKU9.P9;

import static print.Print.print;

public class Apply {
    public static void process(Processor p, Object s){
        print("Using Processor " + p.name());
        print(p.process(s));
    }
}
