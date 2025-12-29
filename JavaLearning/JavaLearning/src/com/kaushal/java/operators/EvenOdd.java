package com.kaushal.java.operators;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:: ");
        int num = sc.nextInt();

        if(num%2==0) {
            System.out.println("Given numbmer is EVEN");
        }
        else {
            System.out.println("Given nummber is ODD");
        }

        sc.close();
    }
}
