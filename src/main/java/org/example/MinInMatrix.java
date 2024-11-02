package org.example;

import static java.lang.Integer.MAX_VALUE;

public class MinInMatrix {
    public int min(int[][] grid){
        int m = grid.length;
        int n = grid[0].length;
        int min = MAX_VALUE;
        for(int i = 0; i<m; i++){
            for(int j = 0; j<n;j++){
                if(grid[i][j]<min){
                    min=grid[i][j];
                }
            }
        }
        return min;
    }
    public static void main(String[] args) {
        int[][] grid= {{10,60,3},{4,5,6}};

        MinInMatrix m = new MinInMatrix();
        int result = m.min(grid);
        System.out.println(result);
    }
}
