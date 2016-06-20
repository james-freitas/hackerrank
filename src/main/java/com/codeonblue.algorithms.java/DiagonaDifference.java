package com.codeonblue.algorithms.java;

import java.util.Scanner;

public class DiagonaDifference {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[][] = new int[n][n];

        int primaryDiagonalSum = 0;
        int secondaryDiagonalSum = 0;

        for(int i=0; i < n; i++){
            for(int j=0; j < n; j++){
                a[i][j] = in.nextInt();
                if (i == j) {
                    primaryDiagonalSum += a[i][j];
                }
                if ( i + j == n - 1 ) {
                    secondaryDiagonalSum += a[i][j];
                }
            }
        }

        System.out.println( Math.abs( primaryDiagonalSum - secondaryDiagonalSum ) );





    }

}
