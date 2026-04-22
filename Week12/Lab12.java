package Week12;
import java.util.Scanner;

public class Lab12{

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
       
        System.out.print("What is your subtotal: ");
    
        double subtotal = input.nextDouble();

        double taxRate = 0.07; 
        double total = subtotal + (subtotal * taxRate);

        System.out.println("Total with tax: " + total);

        System.out.println("Print Subtotal: " + subtotal);

        input.close(); 


        ////////////////////////////////////////////////////
        
        System.out.println("Enter an even number: ");

        int num = input.nextInt();

        if(num % 2 == 0){
            System.out.println("Number is even");
        }

        if(num % 2 != 0){
            System.out.println("Number is odd");
        }


        /////////////////////////////////////////////////////
        
        
        System.out.println("Enter a year as YYYY:");

        int year = input.nextInt();

        // if(year is divisible by 4 and year is not divisible by 100 OR year is divisible by 200.)
        
    }
}