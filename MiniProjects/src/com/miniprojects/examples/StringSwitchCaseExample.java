package com.miniprojects.examples;

import java.util.Arrays;

public class StringSwitchCaseExample {
    public static void main(String[] args) {
        String words="index = 3 * count + 20 ; ";
        String[] stringList = words.split(" ");
        int count=0;
        for (String word:stringList){

            System.out.print(word+"\t");
            switch (word){
                case "index":
                    word="variable";
                    stringList[count]=word;
                    break;
                case "=":
                    word="equal sign";
                    stringList[count]=word;
                    break;
                case "3":
                    word="literal";
                    stringList[count]=word;
                    break;
                case "*":
                    word="math op";
                    stringList[count]=word;
                    break;
                case "count":
                    word="variable";
                    stringList[count]=word;
                    break;
                case "+":
                    word="math op";
                    stringList[count]=word;
                    break;
                case "20":
                    word="variable";
                    stringList[count]=word;
                    break;
                case ";":
                    word="semicolon";
                    stringList[count]=word;
                    break;
                default:
                    break;
            }
            count++;
        }
        System.out.println(Arrays.toString(stringList));
    }
}
