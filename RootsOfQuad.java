package Class_Problems;

import java.util.Scanner;

public class RootsOfQuad {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a eq of form 'ax^2 + bx + c'");
        System.out.println("Enter a: ");
        float a=sc.nextFloat();

        System.out.println("Enter b: ");
        float b=sc.nextFloat();

        System.out.println("Enter c: ");
        float c=sc.nextFloat();

        double D=b*b-(4*a*c);

        if(D>0){
            double root1=b+(Math.sqrt(-D))/2*a;
            double root2=b-(Math.sqrt(-D))/2*a;
            System.out.println("First root= "+ root1+"\n Sec Root= "+root2);
        }else if(D==0){
            double root=(-b)/(2*a);
            System.out.println("Equal roots are "+root);
        }else{
            double real=(-b)/(2*a);
            double imagP1=Math.sqrt(-D)/(2*a);
            double imagP2=(Math.sqrt(-D))/(2*a);

            System.out.println("Root 1= "+real+" + "+imagP1+"\n Sec Root= "+real+" + "+imagP2);
        }


    }
}
