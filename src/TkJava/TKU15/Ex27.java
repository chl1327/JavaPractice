package TkJava.TKU15;

import java.util.ArrayList;
import java.util.List;

import static print.Print.println;

public class Ex27 {
    public static void main(String[] args){
        List<? extends Number> list = new ArrayList<Integer>();
        //list.add(new Integer(1));
        list.add(null); // can add null
        Number x = list.get(0); // can get Number (null)
        println(list);

    }
}
