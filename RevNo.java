package Class_Problems;
import java.util.*;
public class RevNo {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a 5 digit no :");
        int n=sc.nextInt();
        int orgN=n;
        int ans=0;
        while(n>0){
            int rem=n%10;
            ans=ans*10+rem;
            n=n/10;
        }

        System.out.println("Reversed= "+ans);
        if(ans==orgN) System.out.println("Both are equal");
    }
}
