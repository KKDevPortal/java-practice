package com.kaushal.java.operators;

public class OperatorsDemo {
    public static void main(String[] args) {
        int a = 203;
        int b = 12;

        // Arithematic operator
        System.out.println("------------------------Arithematic Operator--------------");
        System.out.println("Addition: " + (a+b));
        System.out.println("Substraction: " + (a-b));
        System.out.println("Multiplication: "+(a*b));
        System.out.println("Division: " + (a/b));
        System.out.println("Modulus: " + (a%b));

        // Relational operator
        System.out.println("------------------------Relational Operator--------------");
        System.out.println("a > b: " + (a > b));
        System.out.println("a < b: " + (a < b));
        System.out.println("a == b: " + (a == b));
        System.out.println("a != b: " + (a != b));

        // Logical Operator
        boolean x = true;
        boolean y = false;
        System.out.println("------------------------Logical Operator--------------");
        System.out.println("x && y: (AND) " + (x && y));  // AND
        System.out.println("x || y: (OR) " + (x || y));  // OR
        System.out.println("!x: (NOT) " + (!x));          // NOT
    }
}
