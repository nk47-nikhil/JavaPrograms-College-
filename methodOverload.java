//  Demonstrate a program for method overloading. Consider the different types of transaction modes used for transferring money
//  (Credit card, Debit card, Net banking etc).
import java.util.Scanner;
class methodOverload{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your bank account: ");
        int account = sc.nextInt();
        System.out.print("Enter the amount to be ttransferred: ");
        int amount = sc.nextInt();
        System.out.print("Enter the mode of transaction: \n1.Credit Card\n2.Debit Card\n3.Net Banking\n");
        int ch = sc.nextInt();
        methods m1 = new methods();
        switch(ch){
            case 1: m1.transaction("Credit Card", amount);
            break;
            case 2: System.out.print("Enter the pin: ");
                    int pin =  sc.nextInt();
                    m1.transaction("Debit Card" , pin, amount);
            break;
            case 3: System.out.print("Enter your password: ");
                    String password = sc.next();
                    System.out.print("Enter your id: ");
                    int id = sc.nextInt();
                    m1.transaction("net banking", password, id, amount);
                    break;
            default: System.out.print("Enter a valid mode of Transaction");
                    }
                    sc.close();
    }
    
}
class methods{
      void transaction(String mode, int amount){
        System.out.println("The mode of transaction is credit card.");
        System.out.print(amount+" is credited to the account");
    }
    void transaction(String mode,int pin, int amount){
        System.out.println("The mode of transaction is Debit card.");
        System.out.print(amount+" is debited to the account");
    }
    void transaction(String mode, String password, int id, int amount){
        System.out.println("The mode of transaction is net BAnking:");
        System.out.print(amount +" is debited ");
    }
}