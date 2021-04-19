package com.localglobalvariable.project;

public class LocalAndGlobalVariables {
    public static void main(String[] args) {
//If not defined in any loop, it is a global variable.
        int a=5;
        int b=10;
        for (int i=0;i<=1;i++){
            //If  defined in any loop, it is a local variable.
            System.out.println(i);
        }
        System.out.println(a);
        System.out.println(b);
    }
}
