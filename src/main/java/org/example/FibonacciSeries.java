package org.example;

public class FibonacciSeries {
   public static void series(int num){
       int a = 0,b = 1, c ,i = 0;
       System.out.println(a);
       System.out.println(b);
       while(i<=num) {
           c= a + b;
           System.out.println(c);
           a = b;
           b = c;
           i++;

       }
   }
    public static void main(String[] args) {
        series(10);
    }



}
