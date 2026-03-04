package Week_5;

public class LogicalOps {
    
    public static void main(String[] args) {
        
        // Logical AND (&&) and Logical OR (||)
        boolean a = true;
        boolean b = false;

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

        System.out.println("\na && b: " + (a && b) + "\n"); 

        System.out.println("a || b: " + (a || b) + "\n"); 

        // Precedence of Logical Operators
        // 
        // && has higher precedence than ||

        // EX: T && F || T

        System.out.println("T && F || T: " + (true && false || true) + "\n"); 

        // Ex: (T || F) && F
        System.out.println("(T || F) && F: " + (false && true || false ) + "\n");

        // Making expressions more readable with parentheses

        // Ex: (T && F) || T

        System.out.println("(T && F) || T: " + ((true && false) || true) + "\n");

        // EX: x > 0 && x < 10 || y > 5
        int x = 5;
        int y = 10;

        System.out.println("x > 0 && x < 10 || y > 5: " + (x > 0 && x < 10 || y > 5) + "\n");

        

    }
}
