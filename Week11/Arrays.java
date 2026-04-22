package Week11;

import java.util.Scanner;
public class Arrays{

    public static void main(String[] args){

        // Declaring an array
        
        int size = 10;
        int[] array = new int[size];

        // Adding to an array

        for(int i = 0; i < array.length; i++){
            array[i] = (int)(Math.random()*100);
        }

        // Printing an array

        for(int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }

    
    }
}