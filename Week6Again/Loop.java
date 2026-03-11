package Week6Again;
import java.util.Scanner;
public class Loop {

    // Let a user enter a number and print if the number is even or odd. They can enter 'X' to exit the program.

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in); 
        System.out.println("Enter a number from 1- 10 or enter 0 to exit: ");
        int userInput = input.nextInt();

        // You can use !userInput.equalsIgnoreCase("X") to compare the user input with "X" and ignore case sensitivity. This way, the user can enter "x" or "X" to exit the program.

        while (userInput != 0) {
            
            switch(userInput) {
                case 2, 4, 6, 8 -> System.out.println(userInput + " is even.");
                case 1, 3, 5, 7, 9 -> System.out.println(userInput + " is odd.");
                default -> System.out.println("Invalid input.");
            }

            System.out.println("Enter a number from 1- 10 or enter 0 to exit: ");
            userInput = input.nextInt();
        }

        System.out.println("Exiting the program. Goodbye!");

        input.close();
    }
    
}
