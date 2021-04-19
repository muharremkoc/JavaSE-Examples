package com.forloop.project;

import java.util.Scanner;

public class DayMonthYearExample {
    public static void main(String[] args) {
        System.out.println("For-Loop Example:");

        Scanner newscan;

        newscan=new Scanner(System.in);

        int days;

        int month;

        int variable=1;

        month=1;

        days=newscan.nextInt();

        if (variable==1){

            System.out.println("MONTH:"+month);
            for (int i=days;i<=31;i++){
                System.out.println("Days:"+i);
            }
        }

        variable++;
        if (variable!=1){
            month++;
            for (month=month;month<=12;month++){
                System.out.println("MONTH:"+month);
                for (days=1;days<=31;days++){
                    System.out.println("Days:"+days);
                }
                if (month==12){
                    System.out.println("You have completed 1 year");
                }
            }
        }
    }
}
