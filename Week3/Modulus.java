package Week3;
import java.util.Scanner;
public class Modulus {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt(); // 932

			
		// 2. Hold the sum of the digits
            int sum = 0;
			
			
		// A. Isolate 2
			int num1 = number % 10; // 932 % 10 = 93 R 2 = 2

            // Add it to sum
            sum = sum + num1; // sum = 0 + 2 = 2

            // isolate the 93
            int a = number / 10; // 932 / 10 = 93 R 2 = 93
			
		// B. Isolate 3
			int num2 = a % 10; // 93 % 10 = 9 R 3 = 3

            // Add to sum
            sum = sum + num2; // sum = 2 + 3 = 5

            // isolate 9
            int b = a / 10; // 93 / 10 = 9 R 3 = 9
			
		// C. Isolate 9 - hundred
			int num3 = b % 10; // 9 % 10 = 0 R 9 = 9

            // Add to sum
            sum = sum + num3; // sum = 5 + 9 = 14

            //isolate ?

        // D. ?
		
		// Print Sum
        System.out.println("Sum of the digits: " + sum);

        // 100 seconds = 1 min 40 sec
        // 100 % 60 = 1 R 40 = 40 sec
        // 100 / 60 = 1 R 40 = 1 min

	
			
    }
    
}
