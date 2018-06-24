package com.java.OtherUnit;

/**
 * Created by chl1327 on 2018/6/24.
 */
public class EnrollmentEvent extends java.util.EventObject {
    private String studentToEnroll;
    private int enrollmentCap;

    public EnrollmentEvent(Object source, String studentToEnroll,
                           int enrollmentCap){
        super(source);
        this.studentToEnroll = studentToEnroll;
        this.enrollmentCap = enrollmentCap;
    }

    public String getStudentToEnroll(){
        return studentToEnroll;
    }

    public int getEnrollmentCap(){
        return enrollmentCap;
    }
}
