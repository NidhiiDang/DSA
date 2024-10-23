package org.example;

class PalindromeNumber {
    public void isPalindrome(int num){

        int reverse=0;
        int original= num;
        int remainder;

        while(num!=0){
            remainder = num%10;
            reverse = reverse *10 +remainder;
            num=num/10;
        }

        if(original==reverse){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not Palindrome");
        }

    }
}
