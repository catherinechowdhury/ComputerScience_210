package Week3;

import java.util.Scanner;

public class Lab3{

    public static void main(String[] args){

        // Declare a variable
        // int, double, boolean, String

        int number;

        // Initialize a variable

        number = 10;

        // Let's put it all together
        // data-type variableName = data;

        // variable names are lower case
        // number of students
        // numberOfStudents  <- variable name using Camel Case
        int number1 = 20; 

        double decimalNumber = 20; // . int can be stored in a double
        //int thisIsADecimal = 20.0; // cannot store a double in an int


        // Print
        // String + anything after is a string 
        // Concatenation
        //System.out.println("My Number : " + number );
        System.out.println("2 + 3 = " + 2 + 3); // Ouput: 2 + 3 = 23

        System.out.println("2 + 3 = " + (2+3)); // Output: 2 + 3 = 5

        System.out.println(2 + 3 + " is 5"); // Output: int + int + String

        // Valid Identifiers
        // three : lowercase letter, $, _
        // Camel Case
        String myNameIs;
        String $var;
        String _myVariable;

        // After the first letter, you can add digits
        String myNameIs1;

        // What is a literal?
        // String literals
        String myName = "Catherine";
        // Integer literals
        int myLiteral = 30;

        // Special characters
        // \t = tab
        // \n = new line

        System.out.print("\tHello\n" + "World");
        //System.out.print("World\n");
        //System.out.print("Another Line");

        // Scanner class

        // 1. Create a Scanner Object
        Scanner input = new Scanner(System.in);

        // 2. Create a prompt for the user
        // $10.50
        System.out.print("What is your subtotal: ");

        // 3. Take in the data from the user
        // .nextDouble() , .nextInt() , .nextLine()
        double subtotal = input.nextDouble();

        // Calculation
        








    }



}