package com.forloop.project;

import java.util.Scanner;

public class StringForLoop {
    public static void main(String[] args) {
        System.out.println("For-Loop Example:");

        Scanner newscan;

        newscan=new Scanner(System.in);

        String name;
        name=newscan.next();
        for (int i=name.length()-1;i>=0;i--){
            String word= String.valueOf(name.charAt(i));
            name+=String.valueOf(word);
            System.out.println(name);
        }
    }
}
