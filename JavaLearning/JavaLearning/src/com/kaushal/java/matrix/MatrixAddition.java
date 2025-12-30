package com.kaushal.java.matrix;

public class MatrixAddition {
   public static void main(String[] args) {


       int[][] matrix1 = {
               {1,1,1},
               {2,2,2}
       };

       int[][] matrix2 = {
               {5,5,5},
               {6,6,6}
       };

       int matrixSize = 3;
       int [][]sum = new int[3][3];

       for(int i=0;i<2;i++) {
           for(int j=0;j<matrixSize;j++) {
               sum[i][j] = matrix1[i][j] +matrix2[i][j];
           }

       }

       // print
       for(int i=0;i<2;i++) {
           for(int j=0;j<matrixSize;j++) {
               System.out.print(sum[i][j] + " ");
           }
           System.out.println();
       }
   }
}
