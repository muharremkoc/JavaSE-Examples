package com.miniprojects.examples;

import java.util.Scanner;

public class SearchNumber {
    public static void main(String[] args) {
        Scanner keyboard=new Scanner(System.in);
        int[] numbers=new int[10];
        int searchNumber;

        boolean isActive=false;
        for (int i=0;i<numbers.length;i++){
            numbers[i]=keyboard.nextInt();
        }
        System.out.println("Aranacak Sayiyi Giriniz:");
        searchNumber=keyboard.nextInt();
        for (int number:numbers) {
            if (searchNumber==number){
                isActive=true;
            }
        }
        if (isActive){
            System.out.println("Number is Active!!!!");
        }
        else {
            System.out.println("Number is InActive!!!");
        }
        keyboard.close();
    }
}
