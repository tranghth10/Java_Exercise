package com.example.helloworld;

import java.util.Scanner;

public class quadraticEquation {
    public void giaiPTb2() {
        // Nhap tu ban phim
        Scanner userInput = new Scanner(System.in);
        System.out.print("Nhập hệ số a: ");
        int a = userInput.nextInt();
        System.out.print("Nhập hệ số b: ");
        int b = userInput.nextInt();
        System.out.print("Nhập hệ số c: ");
        int c = userInput.nextInt();
        // giai phuong trinh bac 2
        if (a == 0) {
            if (b == 0) {
                if (c == 0) {
                    System.out.println("Phương trình vô số nghiệm");
                } else {
                    System.out.println("Phương trình vô nghiệm");
                }
            }
        } else {
            double x1;
            double x2;
            double delta = Math.pow(b, 2) - 4 * a * c;
            if (delta < 0) {
                System.out.println("Phương trình vô nghiệm");
            } else if (delta > 0) {
                x1 = -b + Math.sqrt(delta) / 2 * a;
                x2 = -b - Math.sqrt(delta) / 2 * a;
                System.out.println("Phương trình có nghiệm x1 = " + x1);
                System.out.println("Phương trình có nghiệm x2 = " + x2);
            } else {
                System.out.println("Phương trình có nghiệm x1 = x2 = " + (-b / (2 * a)));
            }
        }
    }
}

