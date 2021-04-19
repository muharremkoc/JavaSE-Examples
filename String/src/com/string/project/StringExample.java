package com.string.project;

public class StringExample {
    public static void main(String[] args) {
        System.out.println("Comparison in Strings");
        String wordOne = " ";
        String wordTwo = "Muharrem Koç";
        System.out.println(wordOne.equals(wordTwo));
        System.out.println(wordOne.compareTo(wordTwo));
        System.out.println(wordOne.isBlank());
        System.out.println(wordOne.isEmpty());
    }
}
