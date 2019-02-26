package TkJava.TKU15;

import net.mindview.util.BasicGenerator;
import net.mindview.util.Generator;

public class BasicGeneratorDemo {
    public static void main(String[] args){
        Generator<CountedObject> gen = new BasicGenerator<CountedObject>(CountedObject.class);
                //BasicGenerator.create(CountedObject.class);
        for (int i=0;i<5;i++)
            System.out.println(gen.next());
    }
}
