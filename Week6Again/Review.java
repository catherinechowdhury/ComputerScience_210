package Week6Again;

import java.util.Scanner;

public class Review {
    
    public static void main(String[] args) {
        
        // What we have covered so far in the course:

       // 1. Scanner Class

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = input.nextInt();
        System.out.println("Enter another number: ");
        int number2 = input.nextInt();

       // 2. Variables and Data Types (int, double, boolean, char, String)

            // constant variables with final keyword

             final double CONSTANT_VALUE = 3.14;

             char letters = 'a';

             String letter2 = "A";

       // 3. Comparison operators (==, !=, >, <, >=, <=)
            int x = 10;

            if(x == 10){ // false
                System.out.print("x is 10");
            }

            if(x <= 10){ // 10 == 10- true
                // code
            }

       // 4. if-else statements

            if(x == 10){
                // code
            }else if( x > 10){
                // code
            }else{
                // code
            }

       // 5. Math class and its methods (sqrt, pow, random)

            // Formula: (int)(Math.random() * (max - min)) + min; for exclusive max
            // 0-10: 5, 6, 7, 8, 9
            int randomNumber = (int) (Math.random() * (10-5)) + 5;

            // Formula: (int)(Math.random() * (max - min + 1) + min); for inclusive max

            int randomNumber2 = (int) (Math.random() * ((10-0)+1)) + 0;

       // 6. Logical operators (&&, ||, !)

       // true && true = true
       // true || false = true 
       // !true = false

       // 7. Switch statements

       // 8. charAt() method of the String class

       // 9. Ternary (Conditional) Statements



    }
}
