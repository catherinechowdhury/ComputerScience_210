package Week3;

public class LabPractice {

    public static void main(String[] args) {
        // Declare a variable
        // Data-types: int, double, boolean, String
        int myVariable;

        // Initialize a variable
        myVariable = 10;

        // Let's put it all together: data-type variableName = data;
        int anotherVariable = 20;

        double thisIsADecimalNumber = 2.0; // a double cannot be stored in an int 
        
        // Print
        System.out.println("The value of myVariable is: " + myVariable);
        System.out.println("The value of anotherVariable is: " + anotherVariable);

        // Valid Identifiers
        // lowercase letter, $, _
        // Camel Case
        String myNameIs;
        String $var;
        String _myVariable;

        // After the first letter, you can add digits
        String myNameIs1;

        // Camel Case
        int camelCaseExample;

        // What is a literal?
        // String literals
        String stringLiteral = "This is a string literal.";

        // Integer literals
        int integerLiteral = 100;

        // Special characters
        // \t = tab
        // \n = new line

        System.out.print("\tHello\n" + "World");
        String specialCharacters = "This string contains special characters: \n\t\"\\";

        // Math.sqrt(a) >Math.sqrt(9) > 3
        // Math.pow(a,b) > Math.pow(2,2) > 4

    }
    
}
