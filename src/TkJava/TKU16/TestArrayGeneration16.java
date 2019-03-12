package TkJava.TKU16;

import net.mindview.util.ConvertTo;

import java.util.Arrays;

import static net.mindview.util.Print.print;

public class TestArrayGeneration16 {
    public static void main(String[] args) {
        int size = 6;
        int skip = 7;
        boolean[] a1 = ConvertTo.primitive(Generated16.array(
                new Boolean[size], new SkipGenerator16.Boolean(skip), skip));
        print("a1 = " + Arrays.toString(a1));
        byte[] a2 = ConvertTo.primitive(Generated16.array(
                new Byte[size], new SkipGenerator16.Byte(skip), skip));
        print("a2 = " + Arrays.toString(a2));
        char[] a3 = ConvertTo.primitive(Generated16.array(
                new Character[size], new SkipGenerator16.Character(skip), skip));
        print("a3 = " + Arrays.toString(a3));
        short[] a4 = ConvertTo.primitive(Generated16.array(
                new Short[size], new SkipGenerator16.Short(skip), skip));
        print("a4 = " + Arrays.toString(a4));
        int[] a5 = ConvertTo.primitive(Generated16.array(
                new Integer[size], new SkipGenerator16.Integer(skip), skip));
        print("a5 = " + Arrays.toString(a5));
        long[] a6 = ConvertTo.primitive(Generated16.array(
                new Long[size], new SkipGenerator16.Long(skip), skip));
        print("a6 = " + Arrays.toString(a6));
        float[] a7 = ConvertTo.primitive(Generated16.array(
                new Float[size], new SkipGenerator16.Float(skip), skip));
        print("a7 = " + Arrays.toString(a7));
        double[] a8 = ConvertTo.primitive(Generated16.array(
                new Double[size], new SkipGenerator16.Double(skip), skip));
        print("a8 = " + Arrays.toString(a8));
    }
}

