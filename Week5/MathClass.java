package Week5;

public class MathClass {

    public static void main(String[] args) {
        // Find the square root of a number using the Math class

        double num = 16;
        double result = Math.sqrt(num);

        // Find the power of a number using the Math class

        double base = 2;
        double exponent = 3;
        double powerResult = Math.pow(base, exponent);

        // Use Math.random() to generate a random number between 20 and 100 exclusive
        // Formula: (int)(Math.random() * (max - min) + min);
        int randomNum = (int) (Math.random() * (100 - 20) + 20);

        // Use Math.random() to generate a random number between 0 and 100 inclusive
        // Formula: (int)(Math.random() * (max - min + 1) + min);
        int randomNumInclusive = (int) (Math.random() * (100 - 0 + 1) + 0);
    }
    

}
