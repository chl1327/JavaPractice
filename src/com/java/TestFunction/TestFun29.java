package com.java.TestFunction;

import com.java.Unit29.PrintChar;
import com.java.Unit29.PrintNum;

/**
 * Created by 心痕 on 2018-4-3.
 */
public class TestFun29 {
    public void test1(){
        Runnable printA = new PrintChar('a',100);
        Runnable printB = new PrintChar('b',100);
        Runnable print100 = new PrintNum(100);

        Thread thread1 = new Thread(printA);
        Thread thread2 = new Thread(printB);
        Thread thread3 = new Thread(print100);

        thread1.start();
        thread2.start();
        thread3.start();
    }
}
