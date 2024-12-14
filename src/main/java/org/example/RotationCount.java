package org.example;

public class RotationCount {
    public int findMin(int[] arr){
        int start = 0;
        int end = arr.length-1;
        int ans = -1;
        while(start<=end){
            int mid = start + (end -start)/2;
            if(arr[mid]<=arr[end]){
                ans = mid;
                end = mid -1;
            }
            else{
                start = mid + 1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {11,13,15,17};
        RotationCount r = new RotationCount();
        int result = r.findMin(arr);
        System.out.println("Number of rotations : " +result);
    }
}
