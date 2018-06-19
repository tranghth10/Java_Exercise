package com;

public class oddNumber {
    public void showOddNum(){
        System.out.print("List odd number from 1 to 100: ");
        for (int i=0; i<100; i++){
            if (i%2 != 0){
                System.out.println(i);
            }
        }
    }
}
