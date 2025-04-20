package Class_Problems;
import java.util.Scanner;
public class CalcResult {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);

         float [] arr=new float[5];

        System.out.println("Enter the Marks:");

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter mark "+(i+1)+" :");
            arr[i]=sc.nextFloat();
        }

        float sum=0;
        for(int i=0;i<5;i++){
            sum+=arr[i];
        }

        float perc=sum*100/500;

        if(perc>=60.0) System.out.println("First div");
        else if(perc>=50 && perc<60) System.out.println("Sec div");
        else if(perc>=40 && perc<50) System.out.println("Third div");
        else System.out.println("Fail");
    }

}
