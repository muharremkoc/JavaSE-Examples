package com.ifthenelse.project;

import java.util.Locale;
import java.util.Scanner;

public class IfThenElse {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        keyboard.useLocale(Locale.US);

        int personNumber;

        char initial;

        String name;

        String title="Unauthorized";
        float workYear;

        System.out.println("Personnel Registration Started");
        System.out.print("Personnel Number:");

        personNumber= keyboard.nextInt();

        if (personNumber>0){
            System.out.print("First letter:");
            initial= keyboard.next().charAt(0);
            System.out.print("Name:");
            System.out.print(initial);
            name= keyboard.next();
            System.out.print("Work Year:");
            workYear= keyboard.nextFloat();
            if(workYear>=1){
                title="Working";
                if (workYear==3) {
                    title = "Authorized Personnel";
                }
                else if (workYear>3){
                    title="Manager";
                }
            }else if (workYear>0){
                title="New Personnel";
            }else {
                System.out.println("Working Year Cannot Be Negative");
            }
            System.out.println(personNumber);
            System.out.println(initial+name);
            System.out.println(workYear);
            System.out.print(title);
        }
        else {
            System.out.println("Invalid Personnel Number");
        }
    }
}
