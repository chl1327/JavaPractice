package com.java.TestFunction;

import java.lang.reflect.Array;
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

    public void test4(){
        List<String> list = Arrays.asList("yellow","red", "green", "blue");
        List<String> list0 = Arrays.asList("yellow","red", "green", "blue");
        List<String> list3 = Arrays.asList("white","black");
        /*Collections.sort(list,Collections.reverseOrder());
        System.out.println(list);*/

        List<Integer> list1 = Arrays.asList(2,4,7,10,11,45,50,59,60,66);
        System.out.println("(1) Index:" + Collections.binarySearch(list1,7));
        System.out.println("(2) Index:" + Collections.binarySearch(list1,9));

        List<String> list2 = Arrays.asList("blue", "green", "red");
        System.out.println("(3) Index:" + Collections.binarySearch(list2,"red"));
        System.out.println("(4) Index:" + Collections.binarySearch(list2,"cyan"));

        /*Collections.reverse(list);
        System.out.println(list);

        Collections.shuffle(list);
        System.out.println(list);*/

        Collections.shuffle(list, new Random(20));
        Collections.shuffle(list0, new Random(20));
        System.out.println(list);
        System.out.println(list0);


        Collections.copy(list,list3);
        System.out.println(list);

        Collections.fill(list,"black");
        System.out.println(list);
    }

    public void test5(){
        Collection<String> collection = Arrays.asList("red","green","red");
        System.out.println(Collections.max(collection));
        System.out.println(Collections.min(collection));

        Collection<String> collection1 = Arrays.asList("red","cyan");
        Collection<String> collection2 = Arrays.asList("red","blue");
        Collection<String> collection3 = Arrays.asList("pink","tan");
        System.out.println(Collections.disjoint(collection1,collection2));
        System.out.println(Collections.disjoint(collection1,collection3));
        System.out.println(Collections.frequency(collection,"red"));
    }


    public void test6(){
        Collection<Integer> set1 = new HashSet<Integer>();
        System.out.println("Time for hash set is "+ getTestTime(set1,500000) + " milliseconds");

        Collection<Integer> set2 = new LinkedHashSet<Integer>();
        System.out.println("Time for linked hash set is "+ getTestTime(set2,500000) + " milliseconds");

        Collection<Integer> set3 = new TreeSet<Integer>();
        System.out.println("Time for tree set is "+ getTestTime(set3,500000) + " milliseconds");

        Collection<Integer> list1 = new ArrayList<Integer>();
        System.out.println("Time for array list is "+ getTestTime(list1,60000) + " milliseconds");

        Collection<Integer> list2 = new LinkedList<Integer>();
        System.out.println("Time for linked list is "+ getTestTime(list2,60000) + " milliseconds");
    }

    public static long getTestTime(Collection<Integer> c, int size){
        long startTime = System.currentTimeMillis();

        List<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < size; i++) list.add(i);
        Collections.shuffle(list);

        for(int element: list) c.add(element);

        Collections.shuffle(list);

        for(int element: list) c.remove(element);

        long endTime = System.currentTimeMillis();
        return endTime-startTime;
    }
}
