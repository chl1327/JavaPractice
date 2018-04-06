package com.java.Unit29;

/**
 * Created by 心痕 on 2018-4-3.
 */
public class PrintChar implements Runnable {
    private char charToPrint;
    private int times;

    public PrintChar(char c,int t){
        charToPrint = c;
        times = t;
    }

    public void run(){

        //try {
            for (int i = 0; i < times; i++) {
                System.out.print(charToPrint);
                //if (i >= 50) Thread.sleep(1);
            }
        /*}catch (InterruptedException ex){

        }*/
    }
}
