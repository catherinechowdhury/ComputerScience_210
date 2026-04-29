package Week12;
import java.util.Scanner;

public class Lab12{

     public static void figureOutSubtotal(){
         Scanner input = new Scanner(System.in);
       
        System.out.print("What is your subtotal: ");
    
        double subtotal = input.nextDouble();

        double taxRate = 0.07; 
        double total = subtotal + (subtotal * taxRate);

        System.out.println("Total with tax: " + total);

        System.out.println("Print Subtotal: " + subtotal);

        input.close();
     }
    
     public static boolean isEven(int x){
        if(x % 2 == 0){
            return true;
        }

       return false;
     }
    public static void main(String[] args){

       //figureOutSubtotal();
        

        ////////////////////////////////////////////////////
       Scanner input = new Scanner(System.in);

        System.out.println("Enter a number: ");

        int num = input.nextInt();

        boolean result = isEven(num);

        System.out.println(num + " is even:" + result);

        
        

        


        /////////////////////////////////////////////////////
        
        
        // if((year is divisible by 4 and year is not divisible by 100) OR (year is divisible by 400))
        
    }
}