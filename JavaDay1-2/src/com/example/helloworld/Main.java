package com.example.helloworld;

public class Main {
    public static void main (String[] args){
       totalNumber calculateTotal = new totalNumber();
       calculateTotal.totalNumber();

       squareRoot calculateSquare = new squareRoot();
       calculateSquare.squareRoot();

        quadraticEquation calculateQuadratic = new quadraticEquation();
        calculateQuadratic.giaiPTb2();

        oddEvenNum checkNumType = new oddEvenNum();
        checkNumType.typeNum();

        NePosNum checkNumber = new NePosNum();
        checkNumber.typeNumber();

        totalDays checkMonth = new totalDays();
        checkMonth.totalDaysInMonth();

        countNum checkCount = new countNum();
        checkCount.countNum();

        checkString checkStr = new checkString();
        checkStr.inputString();

        splitString splitStr = new splitString();
        splitStr.splitString();
    }
}
