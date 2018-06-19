package com.example.helloworld;

import java.util.Scanner;

public class countNum {
    public void countNum () {
        Scanner userInput = new Scanner(System.in);
        System.out.print("Please enter the first number: ");
        int a = userInput.nextInt();
        System.out.print("Please enter the second number: ");
        int b = userInput.nextInt();
        if (a<b) {
            for (int i=a; i<b; i++) {
                System.out.println(i);
            }
        }
        else if (a==b) {System.out.println(a);}
        else {
            for (int i=a; i>b; i--) {
                System.out.println(i);
            }
        }
    }
}
