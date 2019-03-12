package TkJava.TKU16;

import static print.Print.println;

public class Ex11 {
    public static void main(String[] args) {
        int[] ia = new int[2];
        ia[0] = new Integer(1); // will be autoboxed to int
        ia[0] = new Integer(2); // autoboxing does work here
        println(ia.getClass().getName());
        Integer[] Ia = new Integer[2];
        Ia[0] = (int)1; // will be autoboxed to Integer
        Ia[1] = (int)2; // autoboxing works here
        // an array of Integer:
        println(Ia.getClass().getName());
        println(Ia[0] instanceof Integer);
        for(int i = 0; i < Ia.length; i++)
            System.out.println(Ia[i].getClass().getName());
        // Integer[] cannot be assigned to int[]:
        // ia = Ia; // error: incompatible types
        Ia[0] = (int)ia[0]; // more autoboxing
        println(Ia[0].getClass().getName());
    }
}
