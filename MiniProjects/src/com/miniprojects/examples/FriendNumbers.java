package com.miniprojects.examples;

import java.util.Scanner;

public class FriendNumbers {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        int numberOne;

        int numberTwo;

        int sumOne=0;

        int sumTwo=0;

        numberOne=keyboard.nextInt();
        numberTwo=keyboard.nextInt();

        for (int i=1;i<numberOne;i++){
            if (numberOne% i==0){
                sumOne+=i;
            }
        }
        for (int j=1;j<numberTwo;j++){
            if (numberTwo%j==0){
                sumTwo+=j;
            }
        }
        if ((sumOne==numberTwo)&&(sumTwo==numberOne)){
            System.out.println("This Numbers is Friends:");
            System.out.println(sumOne+"-");
            System.out.print(sumTwo);
        }else{
            System.out.println("This Numbers is not Friends");
        }
    }
}
