package Week5;

public class Increment {
    
    public static void main(String[] args) {
        
        // Post Increment
        // The value of the variable is used first and then it is incremented by 1

        int a = 5;
        System.out.println(a); // This will print 5 because the value of a is used
        a++; // This will increment a by 1, so now a is 6
        System.out.println(a); // This will print 6 because a has been incremented

        // Pre Increment
        // The value of the variable is incremented by 1 first and then it is used

        int b = 5;
        System.out.println(b); // This will print 5 because the value of b is used
        ++b; // This will increment b by 1, so now b is 6
        System.out.println(b); // This will print 6 because b has been incremented before it is used

        // Practice Problems
        int c = 5;
        int d = 7;

        int sum = c++ + d; // This will give us 12 because c is used first and then it is incremented, so we are adding 5 and 7
        System.out.println(sum); 

        int sum2 = ++c + d; // This will give us 14 because c is incremented first and then it is used, so we are adding 7 and 7
        System.out.println(sum2);

        int sum3 = c + d++; // This will give us 14 because c is used first and then d is incremented, so we are adding 7 and 7
        System.out.println(sum3);

        int sum4 = c + ++d; // This will give us 15 because d is incremented first and then it is used, so we are adding 7 and 8
        System.out.println(sum4);

        int sum5 = c++ + ++d; // This will give us 15 because c is used first and then it is incremented, and d is incremented first and then it is used, so we are adding 7 and 8
        System.out.println(sum5);

        int count = 15;
        int newCount = ++count;
        System.out.println(count); // This will print 26 because count has been incremented
        System.out.println(newCount); // This will print 25 because newCount is assigned the
    }
}
