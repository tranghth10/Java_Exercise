package com.example.helloworld;

import java.util.Scanner;

public class NePosNum {
    public void typeNumber () {
        try {
            Scanner userInput = new Scanner(System.in);
            System.out.print("Please enter any number: ");
            int num = userInput.nextInt();
            if(num<0) System.out.println("Inputted number is negative number");
            else System.out.println("Inputted number is positive number");
        } catch (NumberFormatException err) {
            System.out.println("You must input numeric type");
        }
    }
}
