package Class_Problems;
import java.util.Scanner;
public class CalcExpenses {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enetr the quantity :");
        int n=sc.nextInt();

        System.out.println("Enter price for per item: ");
        float price=sc.nextFloat();

        float totalExp=price*n;

        if(n>100){
            totalExp-=(totalExp*0.1);
        }

        System.out.println("Total expenses= "+totalExp);
    }
}
