package com;

import java.util.Scanner;

public class javaDay4 {
    public static void main(String[] args) {
        subDog d = new subDog();
        d.bark();

        ArrayEx a = new ArrayEx();
        a.ArrayEx();

        checkPalindrome palindrome = new checkPalindrome();
        palindrome.checkPalindrome();

        oddNumber showNum1 = new oddNumber();
        showNum1.showOddNum();

        EvenNumber showNum2 = new EvenNumber();
        showNum2.showEvenNum();

        listStudent student = new listStudent();
        while (true) {
            Scanner userInput = new Scanner(System.in);
            System.out.print("Please choose function: 1-Add student, 2-Show student, 3-Delete Student: ");
            Integer userChoose = userInput.nextInt();
            switch (userChoose) {
                case 1:
                    student.addStudent();
                    break;
                case 2:
                    student.showStudent();
                    break;
                case 3:
                    student.deleteStudent();
                    break;
            }
        }

    }
}
