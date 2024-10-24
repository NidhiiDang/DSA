package org.example;

//Binary Search Approach to find missing element in sorted array form 1 to n
// note* there is only one missing element in the given array

public class Approach2MissingElement {

    public int findMissing(int[] arr, int size){
        if(arr[0] != 1){
            return 1;
        }
        if(arr[size-1]  != (size+1)){
            return size+1;
        }

        int start = 0;
        int end = size-1;

        while(end-start>1){
            int mid = (start +end)/2;
            if(arr[start]-start != arr[mid]-mid){
                end = mid;
            }
            if(arr[end]-end != arr[mid]-mid){
                start = mid;
            }
        }
        return arr[start]+1;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 5, 6, 7, 8};
        int size = arr.length ;
        Approach2MissingElement m = new Approach2MissingElement();
        int result = m.findMissing(arr,size);
        System.out.println(result);
    }
}
