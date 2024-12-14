package org.example;

import java.util.Scanner;

import static java.lang.Integer.MIN_VALUE;
import static java.lang.Integer.max;

public class PrintSubArray {
    public static int  subArraySum(int[] arr, int size){

        int maxSum = MIN_VALUE;

        for(int i = 0; i<size; i++){
            int currentSum = 0;
            for(int j = i; j<size; j++){
//                for(int k = i; k <= j;k++){
//                    System.out.print(arr[k]);
//                }
                currentSum = currentSum + arr[j];
                maxSum = Math.max(currentSum,maxSum);
            }
        }
        return maxSum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(subArraySum(arr, n));
    }
}
