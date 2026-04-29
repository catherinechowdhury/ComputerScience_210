package Week13;

public class Review {
    public static void main(String[] args){
        //m(1);

        int n = 1;
        m2(n);
        System.out.println(n);

        int k =10;
        nPrint("Hello World",k);
        System.out.println(k);
    }

    public static void m(int n){
        n++;
        System.out.println(n);
    }

    public static void m2(int n){
        n++;
    }

    public static void nPrint(String message, int n){
        while(n > 0){
            System.out.println(message);
            n--;
        }
    }
}
