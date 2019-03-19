package TkJava.TKU17;

import net.mindview.util.Countries;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import static print.Print.println;

public class Ex1 {

    public static void main(String[] args) {
        List<String> al = new ArrayList<String>();
        List<String> ll = new LinkedList<String>();
        for(int i = 0; i < Countries.DATA.length; i++) {
            al.add(Countries.DATA[i][0]);
            ll.add(Countries.DATA[i][1]);
        }
        Collections.sort(al);
        Collections.sort(ll);
        println("Countries: " + al);
        println("Capitals: " + ll);
        for(int i = 0; i < 2; i++) {
            Collections.shuffle(al);
            Collections.shuffle(ll);
            println("Countries " + i + ": " + al);
            println("Capitals " + i + ": " + ll);
        }
        List<String> al2 = new ArrayList<String>();
        List<String> ll2 = new LinkedList<String>();
        for(int i = 0; i < 10; i++) {
            al2.add(Countries.DATA[i][0]);
            ll2.add(Countries.DATA[i][1]);
        }
        for(int i = 0; i < 5; i++) {
            Collections.shuffle(al2);
            Collections.shuffle(ll2);
            println("Countries " + i + ": " + al2);
            println("Capitals " + i + ": " + ll2);
            Collections.sort(al2);
            Collections.sort(ll2);
        }
    }
}
