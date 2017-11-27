package com.java.app;

import com.java.BaseMode.GenericStack;
import com.java.BaseMode.Max;


public class GenericMethodDemo {

    public static void main(String[] args) {
        GenericMethodDemo m = new GenericMethodDemo();
        //m.test1();
        //m.test2();
        //m.test3();
        //Max.max("sdf","132");
        m.test4();
        System.out.println("Hello World!");
    }

    /*泛型类调用*/
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
        //print(stack);
        //System.out.println("max number is " + max(stack));
        stack.print();
    }


    /*调用泛型方法*/
    public void test3(){
        Integer[] integers = {1,2,3,4,5};
        String[] strings = {"London","Paris","New York","Austin"};
        GenericMethodDemo.<Integer>print(integers);
        GenericMethodDemo.<String>print(strings);
    }

    public void test4(){
        GenericStack<String> stack1 = new GenericStack<String>();
        GenericStack<Object> stack2 = new GenericStack<Object>();
        stack2.push("Java");
        stack2.push(2);
        stack1.push("Sun");
        add(stack1,stack2);
        print(stack2);
    }

    /*泛型方法*/
    public static <E> void print(E[] list){
        for(E item: list){
            System.out.print(item + " ");
        }
    }

    /*通配泛型*/
    public static double max(GenericStack<? extends Number> stack){
        double max = stack.pop().doubleValue();

        while (!stack.isEmpty()){
            double value = stack.pop().doubleValue();
            if(value > max) max = value;
        }
        return max;
    }

    public static void print(GenericStack<?> stack){
        while (!stack.isEmpty()){
            System.out.print(stack.pop() + " ");
        }
    }

    public static <T> void add(GenericStack<T> stack1, GenericStack<? super T> stack2){
        while (!stack1.isEmpty()){
            stack2.push(stack1.pop());
        }
    }
}
