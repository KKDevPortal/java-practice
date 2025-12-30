package com.kaushal.java.arrays;

public class ArrayDemo {
    public static void main(String[] args) {
        int [] numbers = {10,20,40,17,33,99, 81};

        System.out.println("First element of array: " + numbers[0]);
        System.out.println("Array length: " + numbers.length);

        for(int i=0; i<numbers.length; i++) {
            System.out.println("num at index " + i + " is " + numbers[i]);
        }
    }
}
