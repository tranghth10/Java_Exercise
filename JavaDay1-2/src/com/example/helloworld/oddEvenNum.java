package com.example.helloworld;

import java.util.Scanner;

public class oddEvenNum {
    public void typeNum () {
        try {
            Scanner userInput = new Scanner(System.in);
            System.out.print("Please enter any number: ");
            int num = userInput.nextInt();
            if( num%2==0 ) System.out.println("Inputted number is even number");
            else System.out.println("Inputted number is odd number");
        } catch (NumberFormatException err) {
            System.out.println("You must input numeric type");
        }
    }
 }
