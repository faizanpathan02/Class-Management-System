package com.exponent.model;

public class Faculty {

    private int faculty_id;
    private String faculty_name;
    private Course course;

    public String getFaculty_name() {
        return faculty_name;
    }

    public void setFaculty_name(String faculty_name) {
        this.faculty_name = faculty_name;
    }

    public int getFaculty_id() {
        return faculty_id;
    }

    public void setFaculty_id(int faculty_id) {
        this.faculty_id = faculty_id;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    @Override
    public String toString() {
        return    "Faculty ID   : " + faculty_id + "\n"
                + "Faculty Name   : " + faculty_name + "\n"
                + "Course       : " + course ;
    }
}
