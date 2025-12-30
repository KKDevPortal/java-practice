package com.kaushal.java.arrays;

import java.util.Arrays;

public class arrayReversal {
    public static void main(String[] args) {
        int[] arr = {1,3,5,11,17,19,22,33,44,55};

        // reversing an array
        int[] rev = new int[arr.length];

        for(int i=0;i<arr.length;i++) {
            System.out.println("Inserting at index position " + i + " in reverse array value: " + arr[(arr.length-(i+1))]);
            rev[i] = arr[(arr.length-(i+1))];
        }

        System.out.println("Original array: " + Arrays.toString(arr));
        System.out.println("Reversed array: " + Arrays.toString(rev));
    }
}
