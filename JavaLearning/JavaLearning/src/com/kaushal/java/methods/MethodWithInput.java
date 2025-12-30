package com.kaushal.java.methods;

import java.util.Scanner;

public class MethodWithInput {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int x = sc.nextInt();

        System.out.print("Enter second number: ");
        int y = sc.nextInt();

        int result = multiply(x, y);
        System.out.println("Multiplication: " + result);

        sc.close();
    }
    static int multiply(int a, int b) {
        return a * b;
    }

}
