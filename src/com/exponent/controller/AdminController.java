package com.exponent.controller;

import com.exponent.service.University;
import com.exponent.serviceimpl.CMSimpl;

import java.util.Scanner;

public class AdminController {
    public static void main(String[] args) {
        System.out.println("\n");
        System.out.println("********************** Welcome to Class Management System **********************");
        Scanner sc = new Scanner(System.in);
        University university = new CMSimpl();

        boolean flag = true;
        while (flag){

            System.out.println("1. Add Course");
            System.out.println("2. Display Course Details");
            System.out.println("3. Add Faculty");
            System.out.println("4. Display Faculty Details");
            System.out.println("5. Add Batch");
            System.out.println("6. Display Batch Details");
            System.out.println("7. Add Student");
            System.out.println("8. Display Student Details");
            System.out.println("\n");


            System.out.println("Enter Your Choice:");
            int choice = sc.nextInt();
            switch (choice){
                case 1:
                    university.addCourse();
                    break;
                case 2:
                    university.displayCourseDetails();
                    break;
                case 3:
                    university.addFaculty();
                    break;
                case 4:
                    university.displayFacultyDetails();
                    break;
                case 5:
                    university.addBatch();
                    break;
                case 6:
                    university.displayBatchDetails();
                    break;
                case 7:
                    university.addStudent();
                    break;
                case 8:
                    university.displayStudentDetails();
                    break;
                case 9:
                    flag = false;
                    break;
                default:
                    System.out.println("Invalid Choice");
            }


        }
    }
}
