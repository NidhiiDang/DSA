package org.example;

import java.util.Scanner;

public class MatrixMultiplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First matrix dimensions: ");

        int m = sc.nextInt();
        int n = sc.nextInt();

        int[][] A = new int[m][n];
        for(int i = 0; i<m; i++){
            for(int j=0;j<n;j++){
                A[i][j]=sc.nextInt();
            }
        }
        for(int i = 0; i<m; i++){
            for(int j=0;j<n;j++){
                System.out.print(A[i][j]+" ");
            }
            System.out.println();
        }


        System.out.println("Enter Second matrix dimensions: ");

        int p = sc.nextInt();
        int q = sc.nextInt();

        int[][] B = new int[p][q];
        for(int i = 0; i<p; i++){
            for(int j=0;j<q;j++){
                B[i][j]=sc.nextInt();
            }
        }

        for(int i = 0; i<p; i++){
            for(int j=0;j<q;j++){
                System.out.print(B[i][j]+" ");
            }
            System.out.println();
        }

        int [][] C = new int[m][p];
        for(int i=0;i<m;i++){
            for(int j=0;j<p;j++){
                C[i][j]=0;
                for(int k =0; k<n;k++){
                    C[i][j]=A[i][k]*B[k][j];
                }
            }
        }

        System.out.println("multiplication matrix: ");
        for(int i = 0; i<p; i++){
            for(int j=0;j<q;j++){
                System.out.print(C[i][j]+" ");
            }
            System.out.println();
        }
    }
}
