package Class_Problems;

import java.util.Scanner;

public class NoOfNotes {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the amount");
        double amount=sc.nextDouble();
        System.out.println("What amount of notes do u want:");
        int noteAm=sc.nextInt();

        System.out.println("Total no. of notes for given amount =");
        System.out.println((int)amount/noteAm);

        if(amount%noteAm!=0){
            double rem=amount%noteAm;
            System.out.println("For "+rem+" rupees ,you will need coins");
        }
    }
}
