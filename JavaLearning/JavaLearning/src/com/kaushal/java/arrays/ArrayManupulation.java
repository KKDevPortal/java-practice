package com.kaushal.java.arrays;

public class ArrayManupulation {
    public static void main(String[] args) {
        int arr[] = {10,20,40,67,12,98,5,8,0,87, -123};

        System.out.println("Sum of array is: " + sumOfArr(arr));

        System.out.println("Max element in the array: " + findMaxElement(arr));

        System.out.println("Mni element in the array: " + findMinElement(arr));
    }

    static int sumOfArr(int [] x) {
        int total = 0;
        for(int i=0; i<x.length; i++) {
            total += x[i];
        }
        return total;
    }

    static int findMaxElement(int arr[]) {
        int max = arr[0]; // initilize assume array index 0 is max
        for(int i =0; i< arr.length; i++) {
            if(arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    static int findMinElement(int arr[]) {
        int min = arr[0]; // initilize assume array index 0 is max
        for(int i =0; i< arr.length; i++) {
            if(arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }
}
