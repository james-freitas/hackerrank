package com.codeonblue.algorithms.java;

import java.util.Scanner;

/**
 * Created by XM0V on 30/05/16.
 */
public class VeryBigSum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int arr[] = new int[n];
        for(int i=0; i < n; i++){
            arr[i] = scanner.nextInt();
        }

        printSum(arr);
    }

    private static void printSum(int[] numbers) {
        long bigSum = 0;

        for (int number : numbers){
            bigSum += number;
        }

        System.out.println(bigSum);
    }
}
