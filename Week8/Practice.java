package Week8;
import java.util.Scanner;
public class Practice {
    
    public static void main(String[] args) {
        // Write a program that calculate the number of stars in a triangle with n rows, where n is given by the user.

        Scanner input = new Scanner(System.in);
        System.out.print("Give me an int: ");
        int n = input.nextInt();

        System.out.println("Upside down triangle:");

        for(int i = 1; i <= n; i++) {
            int stars = n-i+1; 
            for(int j = 1; j <= stars; j++){ 
                System.out.print("*");
            }
            System.out.println();
        }


        input.close();
        
    }
}
