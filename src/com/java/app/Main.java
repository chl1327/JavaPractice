package com.java.app;

import com.java.BaseMode.GenericStack;


public class Main {

    public static void main(String[] args) {
        test1();
        System.out.println("Hello World!");
    }
    public static void test1(){
        GenericStack<String> stack = new GenericStack<String>();
        stack.push("London");
        stack.push("Paris");
        stack.push("Berlin");
        System.out.println("stack:" + stack);
    }

    public void test2(){
        GenericStack<Integer> stack = new GenericStack<Integer>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
    }
}
