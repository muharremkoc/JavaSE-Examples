package com.operators.project;

import java.util.Scanner;

public class TernaryOperator {
    public static void main(String[] args) {
        Scanner keyboard=new Scanner(System.in);
        System.out.println("Ternary Operator");
        float numberOne;
        float numberTwo;
        float result;
        System.out.print("NumberOne:");

        numberOne=keyboard.nextFloat();

        System.out.print("NumberTwo:");

        numberTwo=keyboard.nextFloat();

        result=numberOne>=numberTwo ? numberOne/numberTwo : numberTwo/numberOne;

        System.out.println("Result:"+result);
        keyboard.close();
    }
}
