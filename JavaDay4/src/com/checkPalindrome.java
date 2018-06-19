package com;

import java.util.Scanner;

public class checkPalindrome {
    public void checkPalindrome(){
        Scanner userInput = new Scanner(System.in);
        System.out.print("Please enter string: ");
        String string = userInput.nextLine();

        StringBuilder beforString = new StringBuilder(string);

        StringBuilder afterString = new StringBuilder(beforString);
        afterString.reverse();
//        System.out.print(string);

        if (beforString.toString().equals(afterString.toString())){
            System.out.print("Inputted string is Palindrome");
        } else {
            System.out.print("Inputted string is not Palindrome");
        }
    }
}
