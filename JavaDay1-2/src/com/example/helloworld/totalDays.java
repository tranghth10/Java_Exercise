package com.example.helloworld;

import java.util.Scanner;

public class totalDays {
    public void totalDaysInMonth() {
        try {
            Scanner userInput = new Scanner(System.in);
            System.out.print("Please enter any month: ");
            int month = userInput.nextInt();
            if (month == 2) {
                System.out.println("Month" + " " + month + " " + "has total 28 or 29 days");
            } else {
                switch (month) {
                    case 1:
                    case 3:
                    case 5:
                    case 7:
                    case 8:
                    case 10:
                    case 12:
                        System.out.println("Month" + " " + month + " " + "has total 31 days");
                        break;
                    case 4:
                    case 6:
                    case 9:
                    case 11:
                        System.out.println("Month" + " " + month + " " + "has total 30 days");
                        break;
                    default:
                        System.out.println("Please input valid month");
                        break;
                }
            }
        } catch (NumberFormatException err) {
            System.out.println("You must input numeric type");
        }
    }
}
