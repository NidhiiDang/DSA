package org.example;

public class SumOfAllElementsInMatrix {
    public static void main(String[] args) {
        int sum = 0;
        int[][] grid= {{1,2,3},{4,5,6}};
        int m = grid.length;
        int n = grid[0].length;

        for(int i = 0; i<m; i++){
            for(int j = 0; j<n;j++){
                sum = sum + grid[i][j];
            }
        }

        System.out.println(sum);
    }
}
