package com.exponent.model;

public class Student {

    private int student_id;
    private String student_name;
    private Batch batch;

    public int getStudent_id() {
        return student_id;
    }

    public void setStudent_id(int student_id) {
        this.student_id = student_id;
    }

    public String getStudent_name() {
        return student_name;
    }

    public void setStudent_name(String student_name) {
        this.student_name = student_name;
    }

    public Batch getBatch() {
        return batch;
    }

    public void setBatch(Batch batch) {
        this.batch = batch;
    }

    @Override
    public String toString() {
        return " Student details :" + "\n" +
                "-------------------------------" + "\n"+
                "student ID      :" + student_id + "\n"+
                "Student Name    :" + student_name + "\n" +
                "Batch           :" + batch ;
    }
}
