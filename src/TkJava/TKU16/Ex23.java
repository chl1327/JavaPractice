package TkJava.TKU16;

import net.mindview.util.Generated;
import net.mindview.util.RandomGenerator;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class Ex23 {
    private static Random r = new Random();
    public static void main(String[] args) {
        Integer[] ia = Generated.array(new Integer[20],
                new RandomGenerator.Integer(10));
        System.out.println(Arrays.toString(ia));
        System.out.println("sort");
        Arrays.sort(ia, Collections.reverseOrder());
        System.out.println(Arrays.toString(ia));
    }
}
