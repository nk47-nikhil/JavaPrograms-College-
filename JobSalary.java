package Class_Problems;
import java.util.*;
public class JobSalary {
    public static void main(String[] args){
        Scanner sc=new Scanner((System.in));

        System.out.println("Enter Gender  :\n 1. M\n 2. F");
       // char g=sc.next().charAt(0);
        int g=sc.nextInt();
        System.out.println("Enter your Qualifications :\n 1.Graduate\n2.Post Graduate");
        int q=sc.nextInt();

        if(g==1){
            if(q==1) System.out.println("You will be serving for 10 yrs \n Salary= 50000");
            else if(q==2) System.out.println("You will be serving for more than 10 yrs \n Salary= 55000");
            else System.out.println("Enter valid option");
        }else if(g==2){
            if(q==1) System.out.println("You will be serving for 10 yrs \n Salary= 35000");
            else if(q==2) System.out.println("You will be serving for more than 10 yrs \n Salary= 50000");
            else System.out.println("Enter valid option");
        }else{
            System.out.println("Enter valid option");
        }

    }
}
