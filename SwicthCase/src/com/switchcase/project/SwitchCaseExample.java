package com.switchcase.project;

import java.util.Locale;
import java.util.Scanner;

public class SwitchCaseExample {
    public static void main(String[] args) {
        System.out.println("Switch-Case using:");
        Scanner keyboard;
        keyboard = new Scanner(System.in);
        int choose;
        choose = keyboard.nextInt();
        switch (choose) {
            case 1:
                System.out.println(1);
                break;
            case 2:
                System.out.println(2);
                break;
            default:
                System.out.println(choose);
        }
    }
}
