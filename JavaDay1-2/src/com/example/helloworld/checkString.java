package com.example.helloworld;

import java.util.Scanner;
import java.lang.String;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class checkString {
    public void inputString() {
        Scanner userInput = new Scanner(System.in);
        System.out.print("Please enter your string: ");
        String str = userInput.nextLine();

        String upperCase = "(\\p{Lu})";
        String digit = "\\d+";
        String specialChar = "[!@#$%^&*()_+=|<>?{}\\[\\]~-]";

        String strSplit[] = str.split("");

        Pattern p = Pattern.compile(upperCase);
        Matcher m = p.matcher(strSplit[0]);
        if (m.find()){
//            System.out.println("found");
            for (int i=1; i<strSplit.length;i++){
                 if (strSplit[i].matches(digit) || strSplit[i].matches(specialChar)) {
                    System.out.println("Wrong format, please type again");
                    break;
                }
            }
        } else {System.out.println("Wrong format, please type again");}
    }
}
