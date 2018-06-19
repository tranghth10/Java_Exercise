package com.example.helloworld;

import java.util.Scanner;

public class squareRoot {
    public void squareRoot (){
        try {
            Scanner userInput = new Scanner(System.in);
            System.out.print("Please enter number: ");
            double number = userInput.nextDouble();
            System.out.print("Square of " + number + " is: " + Math.sqrt(number));
        } catch (NumberFormatException err){
            System.out.println("You must input numeric type!");
            err.printStackTrace();
        }
    }
}
