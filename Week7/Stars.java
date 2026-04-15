package Week7;
 import java.util.Scanner;
public class Stars {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Give me an int: ");
        int n = sc.nextInt();

        System.out.println("Left-aligned triangle:");
        for (int row = 1; row <= n; row++) {
            // Print 'row' number of stars
            for (int star = 1; star <= row; star++) {
                System.out.print("*");
            }
                System.out.println(); // Move to next line after each row
        }

        // You could also do it like this, where you calculate how many stars to print in each row first, and then print that many stars:
        for (int currentRow = 1; currentRow <= n; currentRow++) {

            int starsToPrint = currentRow; // how many stars this row

            for (int count = 1; count <= starsToPrint; count++) {
                System.out.print("*"); // print one star
            }

            System.out.println(); // go to next line
        }

        // To print the stars upside down
        System.out.println("Upside down triangle:");
        for(int i = 1; i <= n; i++) {
            int stars = n-i+1; // calculate how many stars to print in this row, which is n - current row + 1
            for(int j = 1; j <= stars; j++){ 
                System.out.print("*");
            }
            System.out.println();
        }


        // To print the stars in a right-aligned triangle
        System.out.println("Right-aligned triangle:");
        for (int row = 1; row <= n; row++) {

            // Print spaces first 
            for (int s = 1; s <= n - row; s++) { // n - row means how many spaces we need to print before the stars start
                System.out.print(" ");
            }

            // Then print stars
            for (int star = 1; star <= row; star++) {
                System.out.print("*");
            }

            // Move to next line
            System.out.println();
        }

        sc.close();
    }
    
}
