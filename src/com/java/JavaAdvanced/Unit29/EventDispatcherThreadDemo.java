package com.java.JavaAdvanced.Unit29;

import javax.swing.*;

/**
 * Created by chl1327 on 2018/4/6.
 */
public class EventDispatcherThreadDemo extends JApplet {
    public EventDispatcherThreadDemo(){
        add(new JLabel("Hi, it runs from an event dispatch thread"));
    }

    public static void main(String[] args){
        SwingUtilities.invokeLater(new Runnable(){
            public void run(){
                JFrame frame = new JFrame("EventDispatcherThreadDemo");
                frame.add(new EventDispatcherThreadDemo());
                frame.setSize(200,200);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setLocationRelativeTo(null);
                frame.setVisible(true);
            }
        });
    }
}
