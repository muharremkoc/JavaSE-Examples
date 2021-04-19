package com.miniprojects.examples;

import java.util.Scanner;

public class StringMethods {
    public static void main(String[] args) {
        Scanner keyboard=new Scanner(System.in);

        //String.split(); and equals() method.
        String email;
        String nickName;
        String serverName;
        String[] newEmail;
        System.out.println("Please,Write email:");email=keyboard.next();
        newEmail=email.split("@");
        int count=0;
        if (!email.equals("")){
            nickName=newEmail[count];
            count++;
            serverName=newEmail[count];
            System.out.println("nickName:"+nickName);
            System.out.println("serverName:"+serverName);
        } else
        {
            System.out.println("Email is not empty!!!");
        }
        //String.length();,String.substring(),String.replace() Methods
        String word;
        String newWord = " ";
        System.out.println("String.Replace() Method using");
        System.out.print("First String:");
        word=keyboard.next();
        for (int i=0;i<word.length()-1;i++){
            int k=i+1;
            String newChar=word.substring(i,k);
            if (newChar.equals("a")) {
                newWord = word.replace("a", "e");
            }
        }
        System.out.println("New String:"+newWord);
    }
}
