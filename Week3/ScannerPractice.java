package Week3;

import java.util.Scanner;

public class ScannerPractice {

    public static void main(String[] args){

        // Scanner class

        // 1. Create a Scanner Object
        Scanner input = new Scanner(System.in);

        // 2. Create a prompt for the user
        // $10.50
        System.out.print("What is your subtotal: ");

        // 3. Take in the data from the user
        // .nextDouble() , .nextInt() , .nextLine()
        double subtotal = input.nextDouble();

        // Do Some calculation with the subtotal or print

        System.out.println("Print Subtotal: " + subtotal);

    }
    
}
