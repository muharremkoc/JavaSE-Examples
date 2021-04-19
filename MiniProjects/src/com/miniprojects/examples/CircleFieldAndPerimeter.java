package com.miniprojects.examples;

import java.util.Locale;
import java.util.Scanner;

public class CircleFieldAndPerimeter {
    public static void main(String[] args) {
        Scanner newscan=new Scanner(System.in);
        newscan.useLocale(Locale.US);
        double PI;
        double radius;
        double circleField;
        double circlePerimeter;
        PI=3;
        radius= newscan.nextDouble();
        circleField=(PI*Math.pow(radius,2));
        circlePerimeter=2*PI*radius;
        System.out.println("Radius:"+radius);
        System.out.println("CircleField:"+circleField);
        System.out.println("CirclePerimeter:"+circlePerimeter);
    }
}
