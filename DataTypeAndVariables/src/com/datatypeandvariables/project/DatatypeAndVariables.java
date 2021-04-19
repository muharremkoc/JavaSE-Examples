package com.datatypeandvariables.project;

public class DatatypeAndVariables {
    public static void main(String[] args) {

        byte byteNumberMin=Byte.MIN_VALUE;
        byte byteNumber=-126;
        byte byteNumberMax=Byte.MAX_VALUE;

        short shortNumberMin=Short.MIN_VALUE;
        short shortNumber=12313;
        short shortNumberMax=Short.MAX_VALUE;

        int numberMin=Integer.MIN_VALUE;
        int number=123232;
        int numberMax=Integer.MAX_VALUE;


        long longNumberMin=Long.MIN_VALUE;
        long longNumber=1321312133;
        long longNumberMax=Long.MAX_VALUE;

        float floatNumberMin=Float.MIN_VALUE;
        float floatNumber=3.14f;
        float floatNumberMax=Float.MAX_VALUE;

        double doubleNumberMin=Double.MIN_VALUE;
        double doubleNumber=0.02;
        double doubleNumberMax=Double.MAX_VALUE;

        char character='a';

        boolean trueBool=Boolean.TRUE;
        boolean falseBool=Boolean.FALSE;

        System.out.println("Byte MİN VALUE:"+byteNumberMin);
        System.out.println(" Our Byte:"+byteNumber);
        System.out.println("Byte MAX VALUE:"+byteNumberMax);


        System.out.println("Integer MİN VALUE:"+numberMin);
        System.out.println(" Our Int:"+number);
        System.out.println("Integer MAX VALUE:"+numberMax);

        System.out.println("Short MİN VALUE:"+shortNumberMin);
        System.out.println(" Our Short:"+shortNumber);
        System.out.println("Short MAX VALUE:"+shortNumberMax);

        System.out.println("Long MİN VALUE: "+longNumberMin);
        System.out.println(" Our Long:"+longNumber);
        System.out.println("Long MAX VALUE:"+longNumberMax);

        System.out.println("Float MİN VALUE:"+floatNumberMin);
        System.out.println("Our Float VALUE:"+floatNumber);
        System.out.println("Float VALUE MAX:"+floatNumberMax);

        System.out.println("Double MİN VALUE:"+doubleNumberMin);
        System.out.println("Our Double:"+doubleNumber);
        System.out.println("Double MAX VALUE:"+doubleNumberMax);


        System.out.println("Character is ASCII :"+(int)character);
        System.out.println("Character :"+character);

        System.out.println("Boolean is True:"+trueBool);
        System.out.println("Boolean is False:"+falseBool);
    }
}
