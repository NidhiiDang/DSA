package org.example;

class FactorialOfNumber {
    public void findFactorial(int num){
        int fact = 1;
        int i = num;

        while(i!=0){
            fact=fact*i;
            i--;
        }
        System.out.println(fact);

    }
}
