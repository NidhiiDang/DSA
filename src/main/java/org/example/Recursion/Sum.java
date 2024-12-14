package org.example.Recursion;

import java.util.Scanner;

public class Sum {
    public static int printNum(int n){
        if(n==0 || n==1) {
            return n;
        }
        return n + printNum(n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int result = printNum(n);
        System.out.println(result);

    }
}
