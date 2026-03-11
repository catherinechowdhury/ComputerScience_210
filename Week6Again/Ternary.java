package Week6Again;

public class Ternary {
    
    public static void main(String[] args) {
        
        //Ternary (Conditional) operator is a shorthand for an if-else statement. It takes three operands: a condition, a value if the condition is true, and a value if the condition is false. The syntax is:

        // condition ? valueIfTrue : valueIfFalse;

        int num = 10;

        // Example 1: Check if a number is even or odd using the ternary operator
        String result = (num % 2 == 0) ? "Even" : "Odd";

        
        System.out.println(num + " is " + result);

        // Example 2: Find the maximum of two numbers using the ternary operator
        int a = 5;
        int b = 8;
        int max = (a > b) ? a : b;
        System.out.println("The maximum of " + a + " and " + b + " is " + max);

        // Rewrite the following if-else statement using the ternary operator:  
        int x = 15;
        
        if(x > 10){
            System.out.println("Greater than 10");
        }else{
            System.out.println("10 or less");
        }

        // Using ternary operator
        String message = (x > 10) ? "Greater than 10" : "10 or less";
        System.out.println(message);

    }
}
