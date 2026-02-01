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

    @Override
    public void updateDetails() {

        boolean flag = true;
        while (flag){
            System.out.println("\n");
            System.out.println("1.Update Course Details");
            System.out.println("2.Update Faculty Details");
            System.out.println("3.Update Batch Details");
            System.out.println("4.Update Student Details");
            System.out.println("5.Exit");
            System.out.println("\nEnter Your Choice:");

            int choice = sc.nextInt();
            switch(choice){
                case 1:
                    updateCourseDetails();
                    break;
                case 2:
                    updateFacultyDetails();
                    break;
                case 3:
                    updateBatchDetails();
                    break;
                case 4:
                    updateStudentDetails();
                    break;
                case 5:
                    flag = false;
                default:
                    System.out.println("Invalid choice");


            }
        }
    }

    public void updateCourseDetails(){
        Course course1 = new Course();
        System.out.println("Enter New Course ID : ");
        course1.setCourse_id(sc.nextInt());
        System.out.println("Enter New Course Name : ");
        course1.setCourse_name(sc.next());
        courseList.add(course1);
        System.out.println("Course Details Updated Successfully......!");
        System.out.println("-------------------------------------------------");
        System.out.println("New Course ID : "+course1.getCourse_id());
        System.out.println("New Course Name : "+course1.getCourse_name());
    }

    public void updateFacultyDetails(){
        Faculty faculty1 = new Faculty();
        System.out.println("Enter New Faculty ID :");
        faculty1.setFaculty_id(sc.nextInt());
        System.out.println("Enter New FAculty Name : ");
        faculty1.setFaculty_name(sc.next());
        facultyList.add(faculty1);
        System.out.println("Faculty Details Updated Successfully......!");
        System.out.println("-------------------------------------------------");
        System.out.println("New Faculty ID : "+faculty1.getFaculty_id());
        System.out.println("New FAculty Name : "+faculty1.getFaculty_name());

    }

    public void updateBatchDetails(){
        Batch batch1 = new Batch();
        System.out.println("Enter New Batch ID : ");
        batch1.setBatch_id(sc.nextInt());
        System.out.println("Enter New Batch Name : ");
        batch1.setBatch_name(sc.next());
        batchList.add(batch1);
        System.out.println("Batch Details Updated Successfully......!");
        System.out.println("-------------------------------------------------");
        System.out.println("New Batch ID : "+batch1.getBatch_id());
        System.out.println("New Batch Name : "+batch1.getBatch_name());

    }

    public void updateStudentDetails(){
        Student student1 = new Student();
        System.out.println("Enter New Student ID : ");
        student1.setStudent_id(sc.nextInt());
        System.out.println("Enter New Student Name : ");
        student1.setStudent_name(sc.next());
        studentList.add(student1);
        System.out.println("Student Details Updated Successfully........!");
        System.out.println("-------------------------------------------------");
        System.out.println("New Student ID : "+student1.getStudent_id());
        System.out.println("New Student Name : "+student1.getStudent_name());
    }


}
