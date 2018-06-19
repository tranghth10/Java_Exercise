package com;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayEx {
    public void ArrayEx(){
        Scanner userInput = new Scanner(System.in);
        System.out.print("Please enter array size: ");
        int arrSize = userInput.nextInt();
        ArrayList<Integer> arrList = new ArrayList<>();
        for (int i=0; i<arrSize; i++){
            Scanner element = new Scanner(System.in);
            System.out.print("Please enter element in array: ");
            int number = element.nextInt();
            arrList.add(number);
        }
        System.out.print("Element on array: ");
        for (int s:arrList){
            System.out.print(s + "\t");
        }
    }
}
