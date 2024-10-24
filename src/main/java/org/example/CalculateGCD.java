package org.example;

import java.util.ArrayList;

public class CalculateGCD {
    public void gcdCalculator(int n,int m){
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        int i=1,j=1;
        while(i<=n/2){
            if(n%i==0){
                list1.add(i);
            }
            i++;
        }
        while(j<=m/2){
            if(m%j==0){
                list2.add(j);
            }
            j++;
        }
        int gcd = 1;
        for(int factor : list1){
            if(list2.contains(factor)){
                gcd = factor;
            }
        }
        System.out.println(gcd);

    }

    public static void main(String[] args) {
        CalculateGCD c = new CalculateGCD();
        c.gcdCalculator(4,1);
    }
}
