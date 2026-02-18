package Week5;

public class ModulusAgain {
    

    public static void main(String[] args) {

        // Let's cycle through the digits
        // We are using modulus 10 because the cycle length of digits is 10, 
        // therefore the remainder will be between 0 and 9, which is the range of digits

        int a = 41 % 10; // 1 R 1 = 1
        int b = 22 % 10; // 2 R 2
        int c = 33 % 10; // 3 R 3
        int d = 44 % 10;
        int e = 55 % 10;
        int f = 66 % 10;
        int g = 77 % 10;
        int h = 88 % 10;
        int i = 99 % 10;
        int j = 100 % 10; // 1 R 0

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);  
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);
        System.out.println(h);
        System.out.println(i);
        System.out.println(j);
        
        // Cycle through the months of the year
        // Cycle length of a year is 12 months, therefore we will use modulus 12 because
        // the remainder will be between 0 and 11, which is the range of months in a year

        // January = 1
        // February = 2
        // March = 3

        // 2025
        int jan = 1 % 12; // 0 R 1 
        int feb = 2 % 12; // 0 R 2
        int nov = 11 % 12; // 0 R 11
        int dec = 12 % 12; // 1 R 0 <starting point

        // 2026
        int january = 1 % 12; // 0 R 1

       // 2027
       // let's jump 14 months into the future
       // What month is it? March

       int futureMonth = (1 + 14) % 12; // 15 % 12 = 1 R 3
       System.out.println("Future Month: " + futureMonth);


       


    }   
}
