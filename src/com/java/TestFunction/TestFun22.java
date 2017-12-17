package com.java.TestFunction;

import java.util.*;

/**
 * Created by 心痕 on 2017-11-30.
 */
public class TestFun22 {
    public void test(){
        Set<String> set = new LinkedHashSet<String>();
        set.add("London");
        set.add("Paris");
        set.add("New York");
        set.add("San Francisco");
        set.add("Beijing");
        set.add("New York");
        System.out.println(set);

        /*Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()){
            System.out.print(iterator.next().toUpperCase()+ " ");
        }*/
        for (Object element: set){
            System.out.print(element.toString().toLowerCase()+ " ");
        }
    }

    public void test1(){
        Set<String> set = new HashSet<String>();
        set.add("London");
        set.add("Paris");
        set.add("New York");
        set.add("San Francisco");
        set.add("Beijing");
        System.out.println("set is "+ set);
        System.out.println(set.size() + " elements in set");
        set.remove("London");
        System.out.println("\nset is " + set);
        System.out.println(set.size() + " elements in set");

        Set<String> set1 = new HashSet<String>();
        set1.add("London");
        set1.add("Paris");
        set1.add("Shanghai");

        System.out.println("set1 is "+ set1);
        System.out.println(set1.size() + " elements in set1");

        System.out.println("\nIs Taipei in set1?" + set1.contains("Taipei"));
        set.addAll(set1);
        System.out.println("\nAfter adding set1 to set, set is "+ set);

        set.removeAll(set1);
        System.out.println("\nAfter removing set1 from set, set is "+ set);

        set.retainAll(set1);
        System.out.println("\nAfter removing common elements in set1 " +  set1 + "from set, set is "+ set);
    }

    public void test2(){
        Set<String> set = new HashSet<String>();
        set.add("London");
        set.add("Paris");
        set.add("New York");
        set.add("San Francisco");
        set.add("Beijing");

        TreeSet<String> treeSet =  new TreeSet<>(set);
        System.out.println("Sorted tree set: " + treeSet);
        System.out.println("first(): " + treeSet.first());
        System.out.println("last(): " + treeSet.last());
        System.out.println("headSet(): " + treeSet.headSet("New York"));
        System.out.println("tailSet(): " + treeSet.tailSet("New York"));
        System.out.println("lower(\"P\"): " + treeSet.lower("P"));
        System.out.println("higher(\"P\"): " + treeSet.higher("P"));
        System.out.println("floor(\"P\"): " + treeSet.floor("P"));
        System.out.println("ceiling(\"P\"): " + treeSet.ceiling("P"));
        System.out.println("pollFirst(): " + treeSet.pollFirst());
        System.out.println("pollLast(): " + treeSet.pollLast());
        System.out.println("New tree set: " + treeSet);
    }

    public void test3(){
        List<Integer> arrayList = new ArrayList<Integer>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(1);
        arrayList.add(4);
        arrayList.add(0,10);
        arrayList.add(3,30);

        System.out.println("A list of integers in the array list:");
        System.out.println(arrayList);

        LinkedList<Object> linkedList = new LinkedList<Object>(arrayList);
        linkedList.add(1,"red");
        linkedList.removeLast();
        linkedList.addFirst("green");

        System.out.println("Display the linked forward:");
        ListIterator<Object> listIterator = linkedList.listIterator();
        while (listIterator.hasNext()){
            System.out.print(listIterator.next() + " ");
        }
        System.out.println();
        System.out.println("Display the linked list backward:");
        listIterator = linkedList.listIterator(linkedList.size());
        while (listIterator.hasPrevious()){
            System.out.print(listIterator.previous() + " ");
        }
    }
}
