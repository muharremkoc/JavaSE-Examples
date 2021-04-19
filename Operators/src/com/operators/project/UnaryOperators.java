package com.operators.project;

import java.util.Locale;
import java.util.Scanner;

public class UnaryOperators {
    public static void main(String[] args) {
        Scanner keyboard;
        keyboard=new Scanner(System.in);
        System.out.println("UnaryOperators= variable++ or variable--");
        int thisDay;
        int nextDay;
        int tomorrow=1;
        int yesterday=2;
        thisDay=keyboard.nextInt();
        nextDay=keyboard.nextInt();
        thisDay*=++nextDay;
        System.out.println(thisDay);
        thisDay+=tomorrow++;
        System.out.println(thisDay);
        thisDay/=--yesterday;
        System.out.println(thisDay);
        thisDay-=yesterday--;
        System.out.println(thisDay);
    }
}
