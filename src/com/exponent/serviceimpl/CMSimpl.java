package com.exponent.serviceimpl;

import com.exponent.model.Batch;
import com.exponent.model.Course;
import com.exponent.model.Faculty;
import com.exponent.model.Student;
import com.exponent.service.University;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CMSimpl implements University {

    Scanner sc = new Scanner(System.in);

    List<Student> studentList = new ArrayList<Student>();
    List<Faculty> facultyList = new ArrayList<Faculty>();
    List<Course> courseList = new ArrayList<Course>();
    List<Batch> batchList = new ArrayList<Batch>();

    @Override
    public void addCourse() {
        System.out.println("Enter how many Courses you want to add : ");
        int n = sc.nextInt();
        for (int i=0; i<n; i++){
            Course course = new Course();
            System.out.println("Enter Course ID : ");
            course.setCourse_id(sc.nextInt());
            System.out.println("Enter Course Name : ");
            course.setCourse_name(sc.next());
            courseList.add(course);
        }
        System.out.println("Course added Successfully......!");
    }

    @Override
    public void displayCourseDetails() {
//        System.out.println("Enter the ID of course you want to display : ");
//        Course course = new Course();
//        int course_id_in = sc.nextInt();
//        if (course_id_in == course.getCourse_id()){
//            System.out.println("Course Details : ");
//            for (Course course1:courseList){
//                System.out.println(course1);
//            }
//        }

        System.out.println("-------Course details-------");
        for (Course course : courseList){
            System.out.println(course + "\n");
        }


    }

    @Override
    public void addFaculty() {
        System.out.println("Enter how many Faculties you want to add : ");
        int n = sc.nextInt();
        for (int i=1; i<=n; i++){
            Faculty faculty = new Faculty();
            System.out.println("Enter Faculty ID : ");
            faculty.setFaculty_id(sc.nextInt());
            System.out.println("Enter Faculty Name : ");
            faculty.setFaculty_name(sc.next());
            System.out.println("Enter the course ID from below mentioned courses to add to Faculty : ");
            displayCourseDetails();
            int cidin =  sc.nextInt();
            for (Course course : courseList){
                if (course.getCourse_id() == cidin){
                    faculty.setCourse(course);
                    facultyList.add(faculty);
                    break;
                }else {
                    continue;
                }
            }
        }
        System.out.println("Faculty added Successfully......!");

    }

    @Override
    public void displayFacultyDetails() {
        for (Faculty faculty : facultyList){
            System.out.println(faculty);
        }
    }

    @Override
    public void addBatch() {
        System.out.println("Enter how many Batches you want to add : ");
        int n = sc.nextInt();
        for (int i=1; i<=n; i++){
            Batch batch = new Batch();
            System.out.println("Enter Batch ID : ");
            batch.setBatch_id(sc.nextInt());
            System.out.println("Enter Batch Name : ");
            batch.setBatch_name(sc.next());
            System.out.println("Enter Faculty ID from below to add in Batch : ");
            displayFacultyDetails();
            int fidin =  sc.nextInt();
            for (Faculty faculty : facultyList){
                if (faculty.getFaculty_id() == fidin){
                    batch.setFaculty(faculty);
                    batchList.add(batch);
                    break;
                }else {
                    continue;
                }
            }
        }
        System.out.println("Batch added Successfully......!");
    }

    @Override
    public void displayBatchDetails() {

        for (Batch batch : batchList){
            System.out.println(batch);
        }
    }

    @Override
    public void addStudent() {
        System.out.println("Enter how many Students you want to add : ");
        int n = sc.nextInt();
        for (int i=1; i<=n; i++){
            Student student = new Student();
            System.out.println("Enter Student ID : ");
            student.setStudent_id(sc.nextInt());
            System.out.println("Enter Student Name : ");
            student.setStudent_name(sc.next());
            System.out.println("Enter the Batch ID from below to add in Student : ");
            displayBatchDetails();
            int bidin = sc.nextInt();
            for (Batch batch : batchList){
                if (batch.getBatch_id() == bidin){
                    student.setBatch(batch);
                    studentList.add(student);
                    break;
                }else{
                    continue;
                }
            }
        }
        System.out.println("Student added Successfully......!");


    }

    @Override
    public void displayStudentDetails() {

        for (Student student : studentList){
            System.out.println(student);
        }

    }
}
