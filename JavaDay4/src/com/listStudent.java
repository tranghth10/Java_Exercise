package com;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class listStudent {
    List<String> arrStudent = new LinkedList<>();
    Scanner userInput = new Scanner(System.in);

    public void showStudent() {
        if (arrStudent.size()<1){
            System.out.println("Array empty");
        } else {
            System.out.println("Show all student in list: ");
            for (String hs : arrStudent){
                System.out.println(hs);
            }
        }
    }

    public void addStudent(){
        System.out.print("Please add student name: ");
        String studentName = userInput.nextLine();
        arrStudent.add(studentName);
        System.out.println("Add new student in array success!");
    }

    public void deleteStudent(){
        if (arrStudent.size()<1){
            System.out.println("Array empty");
        } else {
            System.out.print("Please enter student name who you want to delete: ");
            String studentName = userInput.nextLine();
            if (arrStudent.contains(studentName)) {
                arrStudent.remove(studentName);
                System.out.println("Delete new student in array success!");
            } else {
                System.out.println("Can not found element");
            }
        }
    }
}
