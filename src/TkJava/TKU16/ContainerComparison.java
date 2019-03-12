package TkJava.TKU16;

import net.mindview.util.Generated;
import net.mindview.util.Generator;
import net.mindview.util.Print;

import java.util.Arrays;

import static print.Print.print;
import static print.Print.println;





public class ContainerComparison {
    public static class BerylliumSphere implements Generator<BerylliumSphere>{
        private static long counter;
        private final long id = counter++;
        public String toString(){
            return "Sphere "+ id ;
        }
        @Override
        public BerylliumSphere next() {
            return new BerylliumSphere();
        }
    }

    public static void ArrayDraw(BerylliumSphere[] berylliumSpheres){
        for (int i = 0; i< berylliumSpheres.length; i++) {
            print(berylliumSpheres[i] + " ");
        }
    }
    public static void test(BerylliumSphere[] a) {
        Print.print(Arrays.asList(a));
    }
    // Generic version:
    public static <T> void test(T[] t) {
        Print.print(Arrays.asList(t));
    }
    // int version:
    public static void test(int[] ia) {
        Print.print(Arrays.toString(ia));
    }

    public static BerylliumSphere[] test(int Size){
        BerylliumSphere[] result = new BerylliumSphere[Size];
        for(int i = 0; i < Size; i++)
            result[i] = new BerylliumSphere();
        return result;
    }

    public static void main(String[] args){

        BerylliumSphere[]  berylliumSpheres= new BerylliumSphere[5];
        berylliumSpheres = Generated.array(berylliumSpheres, new ContainerComparison.BerylliumSphere());
        ArrayDraw(berylliumSpheres);
        Print.print("For objects, e.g., BerylliumSpheres:");
        // Array is created and initialized (aggregate initialization)
        // but all elements are null, not BerylliumSpheres:
        test(new BerylliumSphere[3]);
        // Dynamic aggregate initialization works;
        // elements are now BerylliumSpheres:
        test(new BerylliumSphere[]{
                new BerylliumSphere(), new BerylliumSphere() });
        // Aggregate initialization this way works:
        BerylliumSphere[] a = { new BerylliumSphere(),
                new BerylliumSphere(), new BerylliumSphere() };
        test(a);
        // Elements initialized to null:
        BerylliumSphere[] bsa = new BerylliumSphere[2];
        test(bsa);
        bsa = a;
        test(bsa);
        Print.print("-------------");
        Print.print("For primitives, e.g., int:");
        // Dynamic aggregate initialization works:
        test(new int[]{ new Integer(0), new Integer(0) });
        // But may be considered redundant, since
        // aggregate initialization works:
        // elements initialized to zero (not null):
        test(new int[2]);
        // Ordinary aggregate initialization this way also works:
        int[] ia = { 1, 2, 3, };
        test(ia);
        println(Arrays.asList(test(3)));
    }
}
