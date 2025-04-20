package Class_Problems;
import java.util.*;
public class CheckOrder {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter first no.: ");
        int a=sc.nextInt();
        System.out.println("Enter second no.: ");
        int b= sc.nextInt();
        System.out.println("Enter third no.: ");
        int c=sc.nextInt();

        if(b>=a){
            if(c>=b){
                System.out.println("No. are in increasing order");
            }else{
                System.out.println("No. are in random fashion");
            }
        }else{
            if(b>=c){
                System.out.println("No. are in descending oredr");
            }else{
                System.out.println("The no. are in random fashion");
            }
        }

    }
}
