package com.java.JavaAdvanced.OtherUnit;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by chl1327 on 2018/6/24.
 */
public class TestCourseWithActionEvent {
    CourseWithActionEvent course =
            new CourseWithActionEvent("Java Programming");
    public TestCourseWithActionEvent(){
        course.setEnrollmentCap(2);
        ActionListener listener = new Listener();
        course.addActionListener(listener);
        course.addStudent("John");
        course.addStudent("Jim");
        course.addStudent("Tim");
    }

    public static void main(String[] args){
        new TestCourseWithActionEvent();
    }
    private class Listener implements  ActionListener{
        public void actionPerformed(ActionEvent e){
            System.out.println("Enrollment cap exceeded");
        }
    }
}
