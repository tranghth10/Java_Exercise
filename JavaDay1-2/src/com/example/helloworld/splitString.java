package com.example.helloworld;

import java.util.Scanner;

public class splitString {
    public void splitString (){
       String str = "Saturday, 26 November 27$ | Marina Sand Bay, Singapore";
       System.out.println("String :" + str);
       String strSplit1[] = str.split(",\\s", 0);

        for (String element1 : strSplit1) {
            if (element1.contains(strSplit1[0])) {
                System.out.println("String a = " + strSplit1[0]);
            } else if (element1.contains(strSplit1[1])) {
                String strSplit2[] = strSplit1[1].split("\\s\\W\\s");
                for (String element2 : strSplit2) {
                    if (element2.contains(strSplit2[0])) {
                        System.out.println("String b = " + strSplit2[0]);
                    } else {
                        System.out.println("String c = " + strSplit2[1]);
                    }
                }
            } else {
                System.out.println("String d = " + strSplit1[2]);
            }
        }
    }
}
