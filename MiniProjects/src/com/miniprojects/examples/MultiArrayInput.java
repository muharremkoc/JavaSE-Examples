package com.miniprojects.examples;

import java.util.Scanner;

public class MultiArrayInput {
    public static void main(String[] args) {
        Scanner keyboard=new Scanner(System.in);
        int[][] multiArray=new int[4][4];

        for (int i=0;i<4;i++){
            for (int j=0;j<4;j++){
                multiArray[i][j]=keyboard.nextInt();
            }
        }

        for (int i=0;i<4;i++){
            for (int j=0;j<4;j++){
                System.out.print(multiArray[i][j]+"\t");
            }
            System.out.println(" ");
        }
        for (int i=0;i<4;i++){
            for (int j=0;j<4;j++){
                System.out.println(i+".Row "+j+".Column:"+multiArray[i][j]);
            }
        }
        keyboard.close();
    }
}
