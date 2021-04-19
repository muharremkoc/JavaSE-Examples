package com.arrayexamples.project;

public class MultiArrayExample {
    public static void main(String[] args) {
        //MultiArray
        System.out.println("MultiArray:");
        double[][] matrix = {{1.2, 4.3, 4.0},
                {4.1, -1.1}
        };

        System.out.println("0.Rows 0.Column:" + matrix[0][0]);
        System.out.println("0.Rows 1.Column:" + matrix[0][1]);
        System.out.println("0.Rows 2.Column:" + matrix[0][2]);
        System.out.println("1.Rows 0.Column:" + matrix[1][0]);
        System.out.println("1.Rows 1.Column:" + matrix[1][1]);

        int[][] a = {
                {1, 2, 3},
                {4, 5, 6, 9},
                {7},
        };



        //Döngü ile çok boyutlu dizileri gösterme
        System.out.println("MultiArray with For-Loop");
        for (int i = 0; i < a.length; ++i) {
            for (int j = 0; j < a[i].length; ++j) {
                System.out.println(a[i][j]);
            }
        }
        int[][] numArray = {
                {1, 2, 3},
                {4, 5, 6, 9},
                {7},
        };

        System.out.println("MultiArray with ForEach");
        //We are transferring the table with the first Foreach
        for (int[] innerArray: numArray) {
            // We pass the elements in the row with the second foreach
            for(int data: innerArray) {
                System.out.println(data);
            }
        }
    }
}
