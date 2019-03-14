package TkJava.TKU16;

import java.util.Arrays;
import java.util.Comparator;

import static net.mindview.util.Print.print;

class CompBerylliumSphere
        implements Comparable<CompBerylliumSphere> {
    private static long count;
    protected final long id = count++;
    public int compareTo(CompBerylliumSphere c2) {
        return (this.id < c2.id ? -1 : (this.id == c2.id ? 0 : 1));
    }

    public String toString() {
        return "BerylliumSphere " + id;
    }
}

class CompBerylliumSphereComparator
        implements Comparator<CompBerylliumSphere> {
    public int compare(CompBerylliumSphere c1, CompBerylliumSphere c2) {
        return (c1.id > c2.id ? -1 : (c1.id == c2.id ? 0 : 1));
    }
}

public class Ex21 {
    public static void main(String[] args) {
        ContainerComparison.BerylliumSphere[] bsa = new ContainerComparison.BerylliumSphere[5];
        for(int i = 0; i < bsa.length; i++)
            bsa[i] = new ContainerComparison.BerylliumSphere();
        // Arrays.sort(bsa); // runtime ClassCastException
        CompBerylliumSphere[] cbsa = new CompBerylliumSphere[5];
        for(int i = 0; i < cbsa.length; i++)
            cbsa[i] = new CompBerylliumSphere();
        print("unsorted:");
        print(Arrays.toString(cbsa));
        Arrays.sort(cbsa);
        print("sorted:");
        print(Arrays.toString(cbsa));
        Arrays.sort(cbsa, new CompBerylliumSphereComparator());
        print("reverse sorted:");
        print(Arrays.toString(cbsa));
    }
}
