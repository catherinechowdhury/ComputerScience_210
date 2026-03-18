package Week7;

public class ForLoop {
    public static void main(String[] args) {
        int k = 2;
        while(k < 7) {
            
            k++;

            if(k %2 == 0) {
                //continue;
                break;
            }

            System.out.println(k);
        }
    }
}