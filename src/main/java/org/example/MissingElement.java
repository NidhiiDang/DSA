package org.example;

//Find Missing Element in a sorted Array from 1 to n Note* there is only one missing element....

public class MissingElement {
    public int missingElementOfSortedArray(int[] arr,int n){
        int TotalSum = n * (n+1)/2;
        int sum = 0;
        for(int x : arr){
            sum = sum + x;
        }

        return TotalSum - sum;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 5, 6, 7, 8};
        int n = arr.length +1;
        MissingElement m = new MissingElement();
        int result = m.missingElementOfSortedArray(arr,n);
        System.out.println(result);
    }
}
