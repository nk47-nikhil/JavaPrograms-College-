package Class_Problems;
import java.util.*;
public class DivByFiveAndEl {
    public static  void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a no:");
        double n=sc.nextDouble();

        if(n%5==0 && n%11==0) System.out.println("Yes");
        else System.out.println("No");
    }
}
