package Week8;

import java.util.*;

public class Review {

    public static void main(String[] args) {
       
        // // Variable Names (letters, digits, underscores, $- for compiler, but cannot start with a digit) 

        // int variableName = 10;
        // char _character2 = 'A';

        // // Print vs Println

        // // System.out.println("Hi");
        // // System.out.println("Hello"); // prints a new line
        // // System.out.print("A"); // print on the same line
        
        // // Hi
        // // Hello A

        // // Primitive Types: int, double, boolean, char

        //     int x = 10;
        //     double y = x;
            

        // // Numerical Data Types: byte, short, int, long, float, double

        // // Named Constants = final variables (like PI) and Literals
        // // final dataType CONSTANT_NAME = value;

        // final double PI = 3.14;

        // // Escape Sequences: \n, \t, \\, \", \'
        // // System.out.print("Hello" + "\n");
        // // System.out.print("\t Goodbye");

        // // Hello
        // //      Goodbye

        // // Scanner
        // // 1. Create Scanner -> Scanner input = new Scanner(System.in);
        // // 2. Prompt -> As specific as possible
        // // System.out.println("Give me an integer number: ");
        // // 3. Create a variable for input -> int x = input.nextInt();
        // // int -> .nextInt()
        // // double -> .nextDouble()
        // // String -> .nextLine()

        // // Arithmetic Operators: +, -, *, /

        // // x = x + 1 -> x++ or x += 1, x *=2 -> x = x * 2

        // // Equals and Assignment Operators: =, +=, -=, *=, /=, %=
        

        // // Increment and Decrement Operators: ++, --

        // int a = 10;
        // int b = a++; //what do we do to a, then increment

        // System.out.println(b); // 10
        // // System.out.println(a); // 11

        // System.out.println(b++ + a++); // 10, 11

        // System.out.println(b);








        // // Type Casting: implicit and explicit
        //     // implicit: smaller type to larger type (int to double)
        //         int c = 5; // 5
        //         double d = c; // 5.0
        //     // explicit: larger type to smaller type (double to int) - can cause data loss
        //         double v = 5.5;
        //         int e = (int) v; // explicit casting from double to int
        //         double average = (double) 2/5;

        // // Relational Operators: ==, !=, >, <, >=, <=

        // // x != y -> x does not equal
        // // x % 2 != 0 -> odd number

        // // Boolean: true (1) and false (0)
        
        // // If Statements, if-else, nested if-else, else-if

        // if(x > 10){ // if true
        //     //some code
        // }else if(x < 10){ // if true
        //     // some code
        // }else if(x == 10){ // if true
        //     // some code
        // }else{
        //     // some code
        // }

        // // Logic Operators: &&, ||, !, ^

        // // true && true = true
        // // false || false = false 

        // // Operator Precedence
        // // int x = 5;
        // // int y = 10;
        // // (y < 20) && (x > 10)) || (true && true) || true

        // // (false || true) || true

        // // true || true = true

        // // Switch Statements

        // int daysOfWeek = 2;

        // switch(daysOfWeek){
        //     case 1: System.out.println("Monday");
        //             break;
        //     case 2: System.out.println("Tuesday");
        //             break;
        //     default: System.out.println("Not a day");

        // }

        // if(daysOfWeek == 1){
        //     // print Monday
        // }else if(daysOfWeek == 2){
        //     // print Tuesday
        // }else{
        //     // print not a day
        // }

        // // Conditional Expressions (Ternary Operator): condition ? value_if_true : value_if_false
        // int ticketPrice = 10;
        // System.out.println(ticketPrice > 20 ? "Greater than 20" : "Not greater than 20");

        // if(ticketPrice > 20){
        //     // print greater than 20
        // }else if(ticketPrice < 20){
        //     // print less than 20
        // }

        // // Math Class

        // // inclusive - 10 (min) -20(max)
        // // (MAX-MIN + 1) + 10
        // // 
        //  int randomNumber = (int)(Math.random() * (20-10)+1)+10;
        // // exclusive 
        //  int randomNumber2 = (int)(Math.random() * (20-10))+10;

        // // ASCII Week 5-1 CS1- Updated
        // int ascii = (int) 'A'; // ASCII value of 'A' is 65
        // char character = (char) 66; // ASCII value 66 corresponds to 'B'
        // System.out.println("ASCII value of 'A': " + ascii);
        // System.out.println("Character for ASCII value 66: " + character);

        // String word = "hello";
        // char letter1 = 'h';

        // if(word.charAt(0) == 'h'){
        //     // print- h is in the word hello
        // }

        // Loops: for, while, do-while
        int x = 7; // counter, sum 

        while(x < 10){ // condition
            System.out.println("While Loop: " + x + " "); //some code
            if( x == 4){
                // print 4
                continue;
            }
            x++; // a method to break out of the loop
        }
        System.out.println("Hi");
        /////////////////////////////////////////////////////////////
        int y = 7; // counter

        do{
            System.out.println("Do-While Loop: " + y + " "); // some code
            y++; // a method to break out of the loop
        } while(y < 5); // condition

        /////////////////////////////////////////////////////////////

        // initialization (counter); condition; a method to break out of the loop)
        for(int i = 0; i < 5; i++){
            System.out.println("For Loop: " + i + " "); // some code
        }

        // Break and Continue

        // Break - breaks completely out of the loop

    }
}