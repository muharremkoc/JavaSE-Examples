package com.arrayexamples.project;

public class FirstArrayExample {
    public static void main(String[] args) {

           //Single or double control of array elements
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
        for (int number : numbers
        ) {
            if (number % 2 == 0) {
                System.out.println("This Number is double:"+number);
            }
            if(number %2==1){
                System.out.println("This Number is single:"+number);
            }
        }
    }
}
