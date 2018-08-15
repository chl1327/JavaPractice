package com.java.JavaAdvanced.TestFunction;

import com.java.JavaAdvanced.BaseMode.GenericStack;

import java.util.ArrayList;
import java.util.Date;

/**
 * Created by 心痕 on 2017-11-30.
 */
public class TestFun21 {
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
        TestFun21.<Integer>print(integers);
        TestFun21.<String>print(strings);
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

    public void test5(){
        ArrayList<Date> dates = new ArrayList<Date>();
        dates.add(new Date());
        Date date = dates.get(0);
        System.out.println(date);
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

    public static <T> void add(GenericStack<? extends T> stack1, GenericStack<T> stack2){
        while (!stack1.isEmpty()){
            stack2.push(stack1.pop());
        }
    }
}


