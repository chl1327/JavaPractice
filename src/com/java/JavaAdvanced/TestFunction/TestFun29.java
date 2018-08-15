package com.java.JavaAdvanced.TestFunction;

import com.java.JavaAdvanced.Unit29.PrintChar;
import com.java.JavaAdvanced.Unit29.PrintNum;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

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

    public void test2(){
        ExecutorService executor = Executors.newCachedThreadPool();
        executor.execute(new PrintChar('a',100));
        executor.execute(new PrintChar('b',100));
        executor.execute(new PrintNum(100));

        executor.shutdown();
    }
}
