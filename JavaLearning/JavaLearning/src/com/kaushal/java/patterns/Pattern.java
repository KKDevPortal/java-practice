package com.kaushal.java.patterns;

public class Pattern {
    public static void main(String[] args) {
        //  Problem 1: Print Square Star Pattern
//        squarePattern(5);

        // Problem 2: Right Triangle Star Pattern
//        rightTrianglePattern(5);

        // Problem 3: Inverted Triangle
//        invertedTriangle(5);

        // Problem 4: Number Pattern
        nuberPattern(5);

    }

    //  Problem 1: Print Square Star Pattern
    /*
     *****
     *****
     *****
     *****
     *****
     */
    static void squarePattern(int row) {
        for(int i=0; i<row;i++) {
            for(int j=0; j<row;j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // Problem 2: Right Triangle Star Pattern
    /*
     *
     **
     ***
     ****
     *****
     */
    static void rightTrianglePattern(int row) {
        for(int i=0; i<row; i++) {
            for(int j=0;j<i+1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // Problem 3: Inverted Triangle
    /*
     *****
     ****
     ***
     **
     *
     */
    static  void invertedTriangle(int row) {
        for (int i = 0; i < row; i++) {
            for (int j = row-i; j > 0; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // Problem 4: Number Pattern
    /*
    1
    12
    123
    1234
    12345
     */
    static void nuberPattern(int row) {
        for(int i=0;i<row;i++) {
            for(int j=1; j<=i+1; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
