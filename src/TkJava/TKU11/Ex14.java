package TkJava.TKU11;

import java.util.LinkedList;
import java.util.ListIterator;

public class Ex14 {
    static void addMiddle(LinkedList<Integer> l, Integer[] ia) {

        for(Integer i : ia) {
            ListIterator<Integer> it =
                    l.listIterator((l.size())/2);
            it.add(i);
            System.out.println(l);
        }
    }
    public static void main(String[] args) {
        LinkedList<Integer> li = new LinkedList<Integer>();
        Integer[] x = {0, 1, 2, 3, 4, 5, 6, 7};
        Ex14.addMiddle(li, x);
    }
}