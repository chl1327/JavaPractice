package TkJava.TKU11;

import java.util.LinkedList;
import java.util.ListIterator;

public class Controller13 {
    // A class from java.util to hold Event objects:
    private LinkedList<Event> eventList = new LinkedList<Event>();
    public void addEvent(Event c) { eventList.add(c); }
    public void run() {
        LinkedList<Event> eventListCopy =
                new LinkedList<Event>(eventList);
        ListIterator<Event> it
                = eventListCopy.listIterator();
        while(it.hasNext()) {
            it.next().action();
            it.previous();
            System.out.println(it.next());
        }
    }
}