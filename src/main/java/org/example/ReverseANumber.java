package org.example;

public class ReverseANumber {
    public void findReverse(int num){
        int reverse = 0;
        int remainder;
        int i = num;
        while(i!=0){
            remainder = i%10;
            reverse = reverse * 10 + remainder;
            i = i/10;
        }
        System.out.println(reverse);
    }

    public static void main(String[] args) {
        ReverseANumber r  = new ReverseANumber();
        r.findReverse(1234);
    }
}
