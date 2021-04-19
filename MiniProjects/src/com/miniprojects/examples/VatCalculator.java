package com.miniprojects.examples;

import java.util.Scanner;

public class VatCalculator {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int price;
        int kdvPrice;
        price=keyboard.nextInt();
        System.out.println("FirstPrice:"+price);
        kdvPrice=((price*18)/100);
        System.out.println("kdvPrice:"+kdvPrice);
        price+=kdvPrice;
        System.out.println("LastPrice:"+price);
    }
}
