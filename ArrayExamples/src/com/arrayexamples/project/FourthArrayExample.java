package com.arrayexamples.project;

public class FourthArrayExample {
    public static void main(String[] args) {
        int[] numbers = {2, -9, 0, 5, 12, 14, 22, 9, 8, 12};
        int sum = 0;
        Double average;

        // Create an Array
        // We add the variable number to the sum
        for (int number : numbers) {
            sum += number;
        }

        // We pass the total number of elements to a variable
        int arrayLength = numbers.length;

        // We calculate the average
        //We convert the received int variables to double by casting.
        average = ((double) sum / (double) arrayLength);

        System.out.println("Sum = " + sum);
        System.out.println("Average = " + average);
    }
}
