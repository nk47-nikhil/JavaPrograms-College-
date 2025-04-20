package Class_Problems;
import java.util.*;
public class FindMax {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first no : ");
        int a=sc.nextInt();
        System.out.println("Enter sec no: ");
        int b=sc.nextInt();
        System.out.println("Enter third no: ");
        int c=sc.nextInt();

        if(a>b){
            if(a>c){
                System.out.println(a+" is greater");
            }else{
                System.out.println(c+" is greater");
            }
        }else{
            if(b>c) System.out.println(b+" is greater");
            else System.out.println(c+" is greater");
        }
    }
}
