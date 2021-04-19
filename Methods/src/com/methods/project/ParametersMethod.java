package com.methods.project;

import java.util.Scanner;

public class ParametersMethod {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int numberOne;
        int numberTwo;

        System.out.println("NumberOne:");numberOne=keyboard.nextInt();
        System.out.println("NumberTwo:"); numberTwo=keyboard.nextInt();
        String wordOne;

        String wordTwo;

        String concatWord;

        int result[] = new int[9];

        int resultArray = 0;

        int resultAddition;

        int resultSubtraction;

        int resultMultiplaction;

        int resultDivision;

        System.out.println("WordOne:"); wordOne= keyboard.next();
        System.out.println("WordTwo:");wordTwo=keyboard.next();

        concatWord=concMethod(wordOne,wordTwo);
        resultAddition=sum(numberOne,numberTwo);
        resultSubtraction=subtract(numberOne,numberTwo);
        resultMultiplaction=multiplact(numberOne,numberTwo);
        resultDivision=division(numberOne,numberTwo);

        System.out.println("ResultArray:"+resultArray);
        System.out.println("Sum:"+resultAddition);
        System.out.println("Sub:"+resultSubtraction);
        System.out.println("MultiPlact:"+resultMultiplaction);
        System.out.println("Division:"+resultDivision);
        System.out.println("ConcatString:"+concatWord);
    }
    public static int sum(int number1,int number2){
        return number1+number2;
    }
    public static int subtract(int number1,int number2){
        int subResult=number1>=number2 ? number1-number2:number2-number1;
        return subResult;
    }
    public static int multiplact(int number1,int number2){
        return number1*number2;
    }
    public static int division(int number1,int number2){
        return number1/number2;
    }
            //String Method
    public static String concMethod(String word1,String word2){
        String newWord=word1.concat(word2);
        return newWord;
    }
}
