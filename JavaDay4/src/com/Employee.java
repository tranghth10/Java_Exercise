package com;


import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Employee{
    int id;
    String name, description;
    int departmentId;

    List<String> arrEmployee = new LinkedList<>();
    public void showEmployee () {
        if(arrEmployee.size()<1){
            System.out.println("Array empty");
        } else {
            System.out.println("Show all employee in company: ");
            for (String d : arrEmployee){
                System.out.println(d);
            }
        }
    }
    public void addEmployee(){
        if (arrEmployee.size()<1){
            System.out.println("Array empty");
        } else {
            Scanner userInput = new Scanner(System.in);
            System.out.print("Please add employee: ");
            String departmentName = userInput.nextLine();
            arrEmployee.add(departmentName);
            System.out.println("Add employee success!");
        }
    }

    public void deleteEmployee(){
        if (arrEmployee.size()<1){
            System.out.println("Array empty");
        } else {
            Scanner userInput = new Scanner(System.in);
            System.out.print("Please enter employee which you want to delete: ");
            String departmentName = userInput.nextLine();
            if (arrEmployee.contains(departmentName)) {
                arrEmployee.remove(departmentName);
                System.out.println("Delete employee success!");
            } else {
                System.out.println("Can not found element!");
            }
        }
    }
}
