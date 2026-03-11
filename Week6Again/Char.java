package Week6Again;
import java.util.Scanner;
public class Char {
    public static void main(String[] args) {
        
        // char can store letters

            char letter = 'A';
          

        // We can also use Unicode characters with char data type 

        // letter A in Unicode is \u0041

            char unicodeChar = '\u0041';

            System.out.println(letter); // Output: A
            System.out.println(unicodeChar); // Output: A

        // Suppose we have a String and we want to get a specific character from it, we can use the charAt() method of the String class

            String word = "Hello";
            char firstLetter = word.charAt(0); 
            System.out.println(firstLetter); // Output: H

            char secondLetter = word.charAt(1);
            System.out.println(secondLetter); // Output: e

            char thirdLetter = word.charAt(2);
            System.out.println(thirdLetter); // Output: l

            char fourthLetter = word.charAt(3);
            System.out.println(fourthLetter); // Output: l

            char fifthLetter = word.charAt(4);
            System.out.println(fifthLetter); // Output: o


        // With the Scanner

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a character: ");

        char userChar = input.next().charAt(0);
        
        System.out.println("You entered: " + userChar);

        input.close();

        
    }
}
