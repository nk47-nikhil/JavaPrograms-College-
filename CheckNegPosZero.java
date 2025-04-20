package Class_Problems;

import java.util.Scanner;

public class CheckNegPosZero {
    public static void  main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a no:");
        double n=sc.nextDouble();

        if(n>0) System.out.println("Positive");
        else if(n<0) System.out.println("Negative");
        else System.out.println("Zero");
    }
}
