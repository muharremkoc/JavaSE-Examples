package com.arrayexamples.project;

public class StringArrayExample {
    public static void main(String[] args) {
        //Create an array using a string
        String[] words={"S","E","L","A","M"};
        for (int i=0;i<words.length;i++){
            System.out.print(words[i]);
        }
        int index = -1;
        for (int i=0;i<words.length;i++) {
            //We Are Looking For An Element In The Array
            if (words[i].equals("E")) {
                index = i;
                System.out.println("\n"+index);
                break;
            }
        }
    }
}
