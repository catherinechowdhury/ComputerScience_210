package Week_5;

public class LogicalOps {
    
    public static void main(String[] args) {
        
        // Logical AND (&&) and Logical OR (||)
       
        // Truth Tables

        // AND (&&)
        // a      b      a && b
        // true   true   true
        // true   false  false
        // false  true   false
        // false  false  false
        
        // OR (||)
        // a      b      a || b
        // true   true   true
        // true   false  true
        // false  true   true
        // false  false  false

        boolean a = true;
        boolean b = false;


        System.out.println("\na && b: " + (a && b) + "\n"); // false

        System.out.println("a || b: " + (a || b) + "\n"); // true


        // Precedence of Logical Operators
        
        // && has higher precedence than ||

        // EX: T && F || T

        // Evaluate: 
        // Step 1. && ---> false
        // false || T
        // Step 2. true


        //System.out.println("T && F || T: " + (true && false || true) + "\n"); 


        // Ex: T || F && F

        //Evaluate: 
        // Step 1.&& false
        // Step 2. T || false - true


        //System.out.println("T || F && F: " + (true || false && false ) + "\n");



        // Making expressions more readable with parentheses

        // Ex: true && F ---> false

        // (x + y) + 3

        // (T && (F || T))



        //System.out.println("(T && F) || T: " + (((true && false) || true) && false) + "\n");

        // Ex: T && (F || T)

        //System.out.println("T && (F || T): " + (true && (false || true)) );


        
        int x = 5;
        int y = 10;

        // x > 0 && x < 10 || y > 5
        // true && true || true 
        // true || true
        // true

        // (x > 0) && (x < 10) || (y > 5)

        //System.out.println("x > 0 && x < 10 || y > 5: " + (x > 0 && x < 10 || y > 5) + "\n");


    }
}
