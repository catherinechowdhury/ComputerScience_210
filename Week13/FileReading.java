package Week13;
import java.io.*;
import java.util.*;

public class FileReading {
    
    public static void main(String[] args) throws FileNotFoundException, IOException{
        File file = new File("Week13//integers.txt"); 
        Scanner input = new Scanner(file);

        while(input.hasNextInt()){ // true if next token is int
            int x = input.nextInt();
            System.out.print(x + " ");
        }

        System.out.println();

        File file2 = new File("Week13//doubles.txt");
        Scanner input2 = new Scanner(file2);

        while(input2.hasNextDouble()){ // true if next token is double
            double y = input2.nextDouble();
            System.out.print(y + " ");
        }

        // Command Line

        File file3 = new File(args[0]);
        Scanner input3 = new Scanner(file3);

        while(input3.hasNextInt()){
            int z = input3.nextInt();
            System.out.print(z + " ");
            
        }

        input.close();
        input2.close();
        input3.close();
    }
    
}
