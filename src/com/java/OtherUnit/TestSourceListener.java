package com.java.OtherUnit;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by chl1327 on 2018/6/24.
 */
public class TestSourceListener {
    public static void main(String[] args){
        JFrame frame = new JFrame("TestSourceListener");
        JButton jbt = new JButton("OK");
        frame.add(jbt);
        frame.setSize(200,200);
        frame.setVisible(true);

        MyListener listener = new MyListener();
        jbt.addActionListener(listener);
    }

    static class MyListener implements ActionListener{
        public void actionPerformed(ActionEvent e){
            System.out.println("I will process it!");
        }
    }
}
