package TkJava.TKU16;

import java.util.Arrays;

import static print.Print.print;

class C implements Comparable<C>{
    int c;
    public C(int c){
        this.c = c;
    }

    @Override
    public int compareTo(C o) {
        return (this.c < o.c ? -1 : (this.c == o.c ? 0 : 1));
    }

    @Override
    public boolean equals(Object obj) {
        return (obj.getClass().getSimpleName() == "A"
                && this.c == ((C)obj).c) ? true : false;
    }
}


public class Ex19 {
    public static void main(String[] args){
        C[] cs = {new C(1),new C(2),new C(3)};
        C[] cs1 = {new C(1)};
        Arrays.sort(cs);
        int index = Arrays.binarySearch(cs, new C(3));
        System.out.println("Index: " + index + ", " + cs[index]);
        //print(Arrays.equals(cs,cs1));
    }
}
