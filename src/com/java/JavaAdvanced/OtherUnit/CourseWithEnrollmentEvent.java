package com.java.JavaAdvanced.OtherUnit;

import java.util.ArrayList;

/**
 * Created by chl1327 on 2018/6/24.
 */
public class CourseWithEnrollmentEvent {
    private String name = "default name";
    private ArrayList<String> students = new ArrayList<>();
    private int enrollmentCap = 10;

    private ArrayList<EnrollmentListener> enrollmentListenerList;

    public CourseWithEnrollmentEvent(){}

    public CourseWithEnrollmentEvent(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }

    public void addStudent(String student){
        students.add(student);
        if (students.size() > enrollmentCap){
            processEvent(new EnrollmentEvent(this,student,
                    getEnrollmentCap()));
        }
    }

    public String[] getStudents(){
        return (String[]) students.toArray();
    }

    public int getNumberOfStudents(){
        return students.size();
    }
    public int getEnrollmentCap(){
        return enrollmentCap;
    }

    public void setEnrollmentCap(int enrollmentCap){
        this.enrollmentCap = enrollmentCap;
    }

    public synchronized void addEnrollmentListener(EnrollmentListener listener){
        if (enrollmentListenerList == null){
            enrollmentListenerList = new ArrayList<EnrollmentListener>(2);
        }
        if (!enrollmentListenerList.contains(listener)){
            enrollmentListenerList.add(listener);
        }
    }

    public synchronized void removeActionListener(EnrollmentListener listener){
        if (enrollmentListenerList != null && enrollmentListenerList.contains(listener)){
            enrollmentListenerList.remove(listener);
        }
    }

    private void processEvent(EnrollmentEvent e){
        ArrayList list;
        synchronized (this){
            if (enrollmentListenerList == null) return;
            list = (ArrayList)enrollmentListenerList.clone();
        }
        for(int i = 0; i < list.size(); i++){
            EnrollmentListener listener = (EnrollmentListener) list.get(i);
            listener.enrollmentExceeded(e);
        }
    }

}
