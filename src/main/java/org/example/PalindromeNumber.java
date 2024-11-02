package org.example;

public class PalindromeNumber {
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
    public static void main(String[] args) {
        PalindromeNumber p = new PalindromeNumber();
        p.isPalindrome(2332);
    }
}

//two pointer approach in strings

//public boolean isPalindrome(String s){
//    int i=0,j=s.length()-1;
//
//    while(i<j){
//        if(s.charAt(i)==s.charAt(j)){
//            i++;
//            j--;
//        }
//        else{
//            return false;
//        }
//    }
//    return true;
//}

