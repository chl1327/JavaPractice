package com.java.app;

import com.java.BaseMode.GenericStack;


public class GenericMethodDemo {

    public static void main(String[] args) {
        GenericMethodDemo m = new GenericMethodDemo();
        //m.test1();
        //m.test2();
        m.test3();
        System.out.println("Hello World!");
    }
    public void test1(){
        GenericStack<String> stack = new GenericStack<String>();
        stack.push("London");
        stack.push("Paris");
        stack.push("Berlin");
        stack.print();
    }

    public void test2(){
        GenericStack<Integer> stack = new GenericStack<Integer>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.print();
    }

    public void test3(){
        Integer[] integers = {1,2,3,4,5};
        String[] strings = {"London","Paris","New York","Austin"};
        GenericMethodDemo.<Integer>print(integers);
        GenericMethodDemo.<String>print(strings);
    }

    public static <E> void print(E[] list){
        for(E item: list){
            System.out.print(item + " ");
        }
    }

}
