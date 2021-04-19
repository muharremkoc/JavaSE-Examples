package com.methods.project;


import java.util.Scanner;

public class VariableArgumentMethod {
    public static void main(String[] args) {
        Scanner keyboard=new Scanner(System.in);

        int result[] = new int[9]={1,2,3,4,5,6,7,8,9,10}

        int resultArray = 0;


        for (int i=0;i<result.length;i++){
            result[i]=keyboard.nextInt();
            resultArray+=numbersAdd(result[i]);

        }
        System.out.println("ResultArray:"+resultArray);
    }
    public static  int numbersAdd(int... numbers){
        int sums=0;
        for (int number:numbers) {
            sums+=number;
        }
        return  sums;
    }
}
