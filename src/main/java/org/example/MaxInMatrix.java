package org.example;

public class MaxInMatrix {
    public int max(int[][] grid){
        int m = grid.length;
        int n = grid[0].length;
        int max = -1;
        for(int i = 0; i<m; i++){
            for(int j = 0; j<n;j++){
                if(grid[i][j]>max){
                    max=grid[i][j];
                }
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int[][] grid= {{1,20,3},{4,5,6}};

        MaxInMatrix m = new MaxInMatrix();
        int result = m.max(grid);
        System.out.println(result);
    }
}
