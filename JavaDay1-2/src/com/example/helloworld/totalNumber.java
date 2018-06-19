package com.example.helloworld;

import java.util.Scanner;

public class totalNumber {
    public void totalNumber (){
        try {
            Scanner userInput = new Scanner(System.in);
            System.out.print("Please enter the first number: ");
            int firstNum = userInput.nextInt();
            System.out.print("Please enter the second number: ");
            int secondNum = userInput.nextInt();
            System.out.print("Total inputted number: " + (firstNum+secondNum));
        } catch (NumberFormatException err){
            System.out.println("You must input numeric type!");
            err.printStackTrace();
        }
    }
}
