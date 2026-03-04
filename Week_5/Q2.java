package Week_5;
import java.util.*;

public class Q2 {
    
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the exchange rate: ");

        double rate = input.nextDouble();

        System.out.println("Enter 0 - US Dollar ---> Chinese RMB");
        System.out.println("Enter 1 - Chinese RMB ---> US Dollar: ");

        int number = input.nextInt();

        switch(number){
            case 0: System.out.println("Enter US dollar: ");
                    double dollar = input.nextDouble();
                    System.out.println("Conversion: " + rate*dollar);
            case 1: System.out.println("Enter Chinese RMB: ");
                    double rmb = input.nextDouble();
                    System.out.println("Conversion: " + rmb/rate);
            default: System.out.println("Invalid number."); 
        
        }
          
        input.close();
    }
}
