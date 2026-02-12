package Week3;

public class Modulus {

    public static void main(String[] args){
        // 1. Hold our number 932
			int num = 932;
			
		// 2. Hold the sum of the digits
			int sum = 0;
			
		// A. Isolate 2
			// Mod
			int num1 = num % 10; // 932 % 10 = 93 R 2 = 2
			
			// Add sum
			sum = sum + num1; // 0 + 2 = 2
			
			// Integer Div to isolate the 93
			int numA = num / 10; // 932 / 10 = 93 R 2 = 93
			
		// B. Isolate 3
			// Mod
			int num2 = numA % 10; // 93 % 10 = 9 R 3 = 3
			
			// Add sum
			sum = sum + num2; // 2 + 3 = 5
			
			// Integer Div to isolate 9
			
			int numB = numA / 10; // 93 / 10 = 9 R 3 = 9
			
		// C. Isolate 9 - hundred
			// Mod
			int num3 = numB % 10; // 9 % 10 = 0 R 9 = 9
			
			// Add sum
			sum = sum + num3; // 5 + 9 = 14
	
		
		// D. Isolate the thousandths place ?
			
		System.out.println("9 + 3 + 2 = " + sum);
			
    }
    
}
