package TkJava;

import TkJava.TkU2.Practise;

/**
 * Created by chl1327 on 2018/8/8.
 */
public class Test {

    public static void main(String[] args){
        Practise practise = new Practise();
        Practise practise1 = new Practise();
        System.out.println(practise1.toString());
        System.out.println(practise.toString());
        practise.increment();
        System.out.println(practise1.toString());
        System.out.println(practise.toString());
    }
}
