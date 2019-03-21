package TkJava.TKU17;

import net.mindview.util.RandomGenerator;

import java.util.TreeSet;

import static net.mindview.util.Print.print;

public class Ex9 {
    public static void main(String[] args) {
        TreeSet<String> ts =
                new TreeSet<String>(String.CASE_INSENSITIVE_ORDER);
        RandomGenerator.String rgs =
                new RandomGenerator.String(5);
        for(int i = 0; i < 20; i++) {
            ts.add(rgs.next());
        }
        print(ts);
    }

}
