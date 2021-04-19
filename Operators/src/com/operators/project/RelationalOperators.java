package com.operators.project;

import java.util.Locale;
import java.util.Scanner;

public class RelationalOperators {
    public static void main(String[] args) {
        Scanner keyboard;
        keyboard=new Scanner(System.in);
        keyboard.useLocale(Locale.US);
        float firstNumber=keyboard.nextFloat();
        float secondNumber=keyboard.nextFloat();
        System.out.println("Relational Operators:==,!=,>,<,>=,<=");
        boolean answer=false;
        if(firstNumber>secondNumber){
            answer=true;
            System.out.println("RelationalAnswer:"+answer);
        }
        if(firstNumber<secondNumber){
            answer=false;
            System.out.println("RelationalAnswer:"+answer);
        }
        if (firstNumber==secondNumber){
            answer=true;
            System.out.println("RelationalAnswer:"+answer);
        }
        if (firstNumber!=secondNumber){
            answer=false;
            System.out.println("RelationalAnswer:"+answer);
        }
    }
}
