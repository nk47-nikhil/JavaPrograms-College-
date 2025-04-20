package Class_Problems;
import java.util.*;
public class AbsoluteVal {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter a integer no: ");
        int n= sc.nextInt();

        if(n>=0) System.out.println(n);
        else System.out.println(-1*n);
    }
}
