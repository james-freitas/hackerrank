package com.codeonblue.algorithms.java;

import java.util.Scanner;

/**
 * Created by XM0V on 30/05/16.
 */
public class SimpleArraySum {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int numbersArray[] = new int[n];
        for(int i=0; i < n; i++){
            numbersArray[i] = scan.nextInt();
        }


        printSum(numbersArray);
    }

    private static void printSum(int[] numbers) {
        int sum = 0;
        for (Integer number : numbers){
            sum += number;
        }
        System.out.println(sum);
    }


}
