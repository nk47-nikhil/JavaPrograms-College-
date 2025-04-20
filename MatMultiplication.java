package com.NIkhil;
import java.util.Scanner;
public class MatMultiplication {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int[][] mat1={{1,2,3},{4,5,6},{7,8,2}};
        int[][] mat2={{1,3,5},{2,6,9},{1,5,4}};
        int[][] ans=new int[mat1.length][mat2[0].length];
        for(int i=0;i<mat1.length;i++){
            for(int j=0;j<mat2[0].length;j++){
                ans[i][j]=0;
                for(int k=0;k<ans.length;k++){
                    ans[i][j]+=mat1[i][k]*mat2[k][j];
                }
            }
        }

        for(int i=0;i<ans.length;i++){
            for(int j=0;j<ans[0].length;j++){
                System.out.print(ans[i][j]+" ");
            }
            System.out.println("\n");
        }


    }
}
