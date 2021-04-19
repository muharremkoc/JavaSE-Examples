package com.whileloop.example;

import java.util.Scanner;

public class WhileLoopExample {
    public static void main(String[] args) {
        Scanner value;
        int years;
        int count;
        int century;
        value=new Scanner(System.in);
        System.out.print("Write the Current Year:");
        years=value.nextInt();
        count=0;
        century=(years/100)+1;
        if (years>=0){
            System.out.println("Current Century:"+century);
            while (count<=100){
                System.out.println("Year:"+years);
                years++;
                count++;
                if (count>100){
                    century+=1;
                    System.out.println("This Century:"+century);
                }
            }
        }
        else{
            System.out.println("Invalid Year Attempt");
        }
    }
}
