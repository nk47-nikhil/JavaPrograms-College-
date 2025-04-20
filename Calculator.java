package Class_Problems;
import java.util.*;
public class Calculator {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter the operation u want to perform : \n 1. Addition\n 2. Subtarction\n 3. Multiplication\n 4. Division\n");
        int choice=sc.nextInt();

        System.out.println("Enter first no.:");
        int a=sc.nextInt();
        System.out.println("Enter sec no:");
        int b=sc.nextInt();
        switch (choice){
            case 1:
                System.out.println(a+b);
            case 2:
                System.out.println(a-b);
            case 3:
                System.out.println(a*b);
            case 4:
                System.out.println(a/b);
            default:
                System.out.println("Enter right choice.");
        }
    }
}
