package com.NIkhil;
import java.util.Scanner;
public class Fibonacci {
    public static int fibo(int n){
       if(n==1) return 0;
       if(n==2) return 1;

       return (fibo(n-1)+fibo(n-2));
    }
    public static void main(String[] args){
        int n=5;
        for(int i=1;i<=n;i++){
            System.out.print(fibo(i)+" ");
        }
    }
}
