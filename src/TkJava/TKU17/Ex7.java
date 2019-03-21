package TkJava.TKU17;

import net.mindview.util.Countries;
import net.mindview.util.Print;

import java.util.*;

import static net.mindview.util.Print.printnb;
import static print.Print.print;

public class Ex7 {
    public static void main(String[] args){
        List<String> al = new ArrayList<String>();
        List<String> ll = new LinkedList<String>();
        al.addAll(Countries.names(5));
        ll.addAll(Countries.names(6));
        print(al);
        print(ll);
        Iterator alit = al.iterator();
        Iterator llit = ll.iterator();
        while(alit.hasNext()) {
            printnb(alit.next() + (alit.hasNext() ? ", " : ""));
        }
        Print.print();
        while(llit.hasNext()) {
            printnb(llit.next() + (llit.hasNext() ? ", " : ""));
        }
        Print.print();
        ListIterator allit = al.listIterator();
        ListIterator lllit = ll.listIterator();
        while(lllit.hasNext()) {
            allit.add((String)lllit.next());
            if (allit.hasNext()) {
                allit.next();
            }
        }
        Print.print(al);
        Print.print();
        List<String> al2 = new ArrayList<String>(Countries.names(5));
        ListIterator allit2 = al2.listIterator();
        while(lllit.hasPrevious()) lllit.previous();
        while(allit2.hasNext()) allit2.next();
        while(lllit.hasNext()) {
            allit2.add((String)lllit.next());
            if (allit2.hasPrevious()) {
                allit2.previous();
            }
        }
        Print.print(al2);

    }
}
