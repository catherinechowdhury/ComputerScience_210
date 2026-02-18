package Week5;

public class Division {
    
    public static void main(String[] args) {
        // Integer and Floating Point Division
        // Integer division will give us the quotient without the remainder 
        // EX: 5 / 2 will give us 2 because 2 goes into 5 twice with a remainder of 1 but 
        // integer division we only care about the quotient and not the remainder

        int k = 5 / 2;
        System.out.println(k);

        // Floating point division will occur when we divide by a double, which will give us a decimal result
        // The double could either be the divisor or the dividend, as long as one of them is a double, the result will be a double

        double l = 5 / 2.0; // This will give us a double result because we are dividing by a double
        System.out.println(l);

        double m = 5.0 / 2; // This will also give us a double result because we are dividing by a double
        System.out.println(m);

        // Note: when dividing by a double, we need to store it in a double variable, 
        // otherwise we will get a type mismatch error because we cannot store a double result in an int variable
    }
}
