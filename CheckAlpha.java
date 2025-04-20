package Class_Problems;
import java.util.*;
public class CheckAlpha {
    public  static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a character:");
        char ch=sc.next().charAt(0);   //If user enters more than one character

        if(ch>='a'&& ch<='z' ||ch>='A'&&ch<='Z') System.out.println("Yes");
        else System.out.println("NO");
    }
}
