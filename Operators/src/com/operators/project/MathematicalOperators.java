package com.operators.project;

import java.util.Scanner;

public class MathematicalOperators {
    public static void main(String[] args) {
        Scanner keyboard;
        keyboard=new Scanner(System.in);
        float firstNumber;
        float secondNumber;
        float result;
        char arithmetic;
        System.out.println("Operators");
        //Used in mathematical operations
        System.out.println("Arithmetic Operators:+,-,*,/,%");
        System.out.print("FirstNumber=");firstNumber=keyboard.nextFloat();
        System.out.print("SecondNumber=");secondNumber=keyboard.nextFloat();
        System.out.println("Arithmetic operation:");
        arithmetic=keyboard.next().charAt(0);
        if (arithmetic=='+'){
            result=firstNumber+secondNumber;
            System.out.println("ArithmeticResult="+result);
        }
        else if (arithmetic=='-'){
            result=firstNumber-secondNumber;
            System.out.println("ArithmeticResult="+result);
        }
        else if (arithmetic=='*'){
            result=firstNumber*secondNumber;
            System.out.println("ArithmeticResult="+result);
        }
        else if (arithmetic=='/') {
            result = firstNumber / secondNumber;
            System.out.println("ArithmeticResult=" + result);
        }
        else if (arithmetic=='%'){
            result=firstNumber%secondNumber;
            System.out.println("ArithmeticResult="+result);
        }
        keyboard.close();
    }
}
