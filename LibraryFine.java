package Class_Problems;
import java.time.Period;
import java.util.*;
import java.time.format.DateTimeFormatter;
import java.time.LocalDate;
import java.time.*;
public class LibraryFine {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the date at which this book got issued: (dd-MM-yyyy)");
        String inputDate=sc.next();

        LocalDate date=LocalDate.now();
        DateTimeFormatter formatter=DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate inDate=LocalDate.parse(inputDate,formatter);
       // System.out.println(date);
        Period period=Period.between(inDate,date);
        double fine=0;
       // System.out.println(period.getDays());
        if(period.getDays()<=5) fine+= period.getDays()*0.5;
      //  System.out.println(fine);
        int leftDays=period.getDays()-5;
       // System.out.println(leftDays);
        if(leftDays>0 && leftDays<=5){
            fine+=leftDays;
        }else if(leftDays>5){
            fine+=5;
            leftDays-=5;
        }

        if(leftDays>0 && period.getMonths()==0){
            fine+=leftDays*5;
        }else if(period.getMonths()>=1) System.out.println("Your memebership has been cancelled.");
        else{
            System.out.println("Toatal fine= "+fine);
        }


    }
}
