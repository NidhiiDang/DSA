package org.example;

public class SumOfDigits {
    public void sumOfDigits(int num){
        int sum = 0;
        int remainder ;
        int i = num;
        while(i!=0){
            remainder = i % 10;
            sum = sum + remainder;
            i = i/10;
        }
        System.out.println(sum);
    }

    public static void main(String[] args) {
        SumOfDigits s = new SumOfDigits();
        s.sumOfDigits(678);
    }
}
