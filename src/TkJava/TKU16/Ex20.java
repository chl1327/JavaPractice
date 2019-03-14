package TkJava.TKU16;

import java.util.Arrays;

import static net.mindview.util.Print.print;

public class Ex20 {
    public static void main(String[] args) {
        int[][][] a1 = new int[4][3][2];
        int[][][] a2 = new int[4][3][2];
        print(Arrays.deepToString(a1));
        print(Arrays.deepEquals(a1, a2));
        A[][][] aa1 = new A[4][3][2];
        A[][][] aa2 = new A[4][3][2];
        print(Arrays.deepToString(aa1));
        print(Arrays.deepEquals(aa1, aa2));
        print(Arrays.deepEquals(a1, aa1));
    }
}
