package Week6;

public class IncrementsAgain {
    public static void main(String[] args) {
        int x = 5;

    int y = x++; // post-increment: assign x to y, then increment x

    System.out.println("x: " + x); // x is now 6
    System.out.println("y: " + y); // y is 5, because it was assigned before x was incremented

    int a = 5;
    int b = ++a; // pre-increment: increment a, then assign it to b

    System.out.println("a: " + a); // a is now 6
    System.out.println("b: " + b); // b is 6, because it was assigned after a was incremented

    int c = 5;
    c++; // post-increment: increment c by 1, but the value of c is not used in an expression
    System.out.println("c: " + c); // c is now 6

    ++c; // pre-increment: increment c by 1, but the value of c is not used in an expression
    System.out.println("c: " + c); // c is now 7

    }
    
}
