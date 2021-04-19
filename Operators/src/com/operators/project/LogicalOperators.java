package com.operators.project;

public class LogicalOperators {
    public static void main(String[] args) {
        float firstNumber=0.0f;
        float secondNumber = 0.0f;
        float result=0.0f;
        boolean answer=false;
        System.out.println("Logical Operators:&&,||,!");
        if ((firstNumber>30.2f)&&(secondNumber<29.20f)){
            //The && operator is also true if both conditions are true
            result=firstNumber+secondNumber;
            System.out.println("logicalResult:"+result);
        }
        if ((secondNumber<=23.4f)||(firstNumber>=26.2f)){
            //The  || true if one of the conditions in the operator is true
            answer=true;
            System.out.println("logicalAnswer:"+answer);
        }
        if (!(secondNumber==36.2f)){//// Used to reverse the result from Condition.
            secondNumber+=36.2f;
            System.out.println("LogicalSecond:"+secondNumber);

        }
    }
}
