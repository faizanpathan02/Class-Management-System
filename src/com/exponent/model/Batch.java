package com.exponent.model;

public class Batch {

    private int batch_id;
    private String batch_name;
    private Faculty faculty;

    public String getBatch_name() {
        return batch_name;
    }

    public void setBatch_name(String batch_name) {
        this.batch_name = batch_name;
    }

    public int getBatch_id() {
        return batch_id;
    }

    public void setBatch_id(int batch_id) {
        this.batch_id = batch_id;
    }

    public Faculty getFaculty() {
        return faculty;
    }

    public void setFaculty(Faculty faculty) {
        this.faculty = faculty;
    }

    @Override
    public String toString() {
        return   "Batch ID    : " + batch_id + "\n"
                +"Batch Name     : " + batch_name + "\n"
                +"Faculty        : " + faculty + "\n";

    }
}
