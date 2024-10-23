package org.example;

import java.util.ArrayList;

public class PerfectNumber {
    ArrayList<Integer> arr = new ArrayList<>();

    public void checkPerfect(int num){
        int sum = 0;
        for(int i=1;i<=num/2;i++){
            if(num%i==0){
               arr.add(i);
            }
        }

        for(int x : arr){
            sum = sum + x;
        }

        if(sum==num){
            System.out.println("Number is perfect");
        }
        else{
            System.out.println("number is not perfect");
        }

    }

    public static void main(String[] args) {
        PerfectNumber p = new PerfectNumber();
        p.checkPerfect(8);
    }
}
