package org.example;

class ArmStrongNumber {
    public void isArmStrong(int num){

        int count = 0;
        int reverse = 0;
        int remainder ;
        int i = num;

        while(i!=0){
            remainder = i%10;
            reverse = reverse*10+remainder;
            i = i/10;
            count++;
        }
       int j=num;

        double an = 0;

        while(j!=0){
           remainder = j%10;
           an = an + Math.pow(remainder,count);
           j=j/10;
        }
        if(num==an){
            System.out.println("ArmStrong");
        }
        else{
            System.out.println("Not ArmStrong");
        }
    }

}
