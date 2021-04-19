package com.arrayexamples.project;

public class ThirdArrayExample {
    public static void main(String[] args) {
        //Arrays with For-Loop
        int[] ages = {12, 4, 5, 2, 5};
        System.out.println("For using:");
        for (int i = 0; i < ages.length; i++) {
            //length:The number of elements of the array
            System.out.println(i + ".element:" + ages[i]);
        }
        //Arrays with ForEach-Loop
        System.out.println("Foreach using:");
        for (int age : ages) {
                /*
                1.We created a variable named age.
                2.This variable moves on the ages array and accesses the elements.
                 */

            System.out.println(age);
        }
    }
}
