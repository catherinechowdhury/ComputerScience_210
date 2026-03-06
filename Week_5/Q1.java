package Week_5;

import java.util.*;

public class Q1 {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.println("Enter an integer: ");

        int number = input.nextInt();

        if(number%5 == 0 && number%6 == 0){
            System.out.println("The number is divisible by 5 AND 6.");
        }

        if(number%5 == 0 || number%6 == 0){
            System.out.println("The number is divisible by 5 OR 6.");
        }

        if((number%5 == 0 || number%6 == 0) ^ (number%5 == 0 && number%6 == 0) ){
            System.out.println("The number is divisible by 5 or 6 but not both.");
        }

        input.close();

    }
}
