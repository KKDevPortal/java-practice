package com.kaushal.java.methods;

public class MethodDemo {
    public static void main(String[] args) {
        greet();

        System.out.println("Sum is " + add(123,43));
    }

    static void greet() {
        System.out.println("Hello Everyone");
    }

    static int add(int a, int b) {
        return a+b;
    }
}
