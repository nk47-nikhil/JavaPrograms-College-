package Class_Problems;

import java.util.Scanner;

public class BasicToGrossSal {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter Your basic pay: ");
        double n=sc.nextDouble();

        if(n<=10000){
            double gs=n+(n*0.2)+(n*0.8);
            System.out.println("Gross= "+gs);
        }

       else if(n>10000 && n<=20000){
            double gs=n+(n*0.25)+(n*0.9);
            System.out.println("Gross= "+gs);
        }

        else{
            double gs=n+(n*0.3)+(n*0.95);
            System.out.println("Gross= "+gs);
        }
    }
}
