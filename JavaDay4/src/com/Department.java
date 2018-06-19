package com;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Department{
    int id;
    String name, description;
    List<String> arrDepartment = new LinkedList<>();
    public void showDepartment(){
        if (arrDepartment.size()<1){
            System.out.println("Array empty");
        } else {
            System.out.println("Show all department in company: ");
            for (String d : arrDepartment){
                System.out.println(d);
            }
        }
    }
    public void showEmployeeInArray(){
        Scanner userInput = new Scanner(System.in);
        System.out.println("Please enter department name which you want to show all employee: ");
        String departmentName = userInput.nextLine();
        if (arrDepartment.contains(departmentName)){
            System.out.println("List employee in department " +departmentName+ " : ");
        }
    }
}