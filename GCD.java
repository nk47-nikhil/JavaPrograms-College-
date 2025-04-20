package com.NIkhil;
import java.util.Scanner;
public class GCD {

  public static   int gcd(int a,int b){

        if(a==0) return b;
        if(b==0) return a;

        if(a<b){
            b=b%a;
            return (gcd(a,b));
        }else{
            a=a%b;
            return (gcd(a,b));
        }
    }
    public static void main(String[]args){
        int a=16;
        int b=4;
        System.out.println("HCF= "+gcd(a,b));
    }
}
