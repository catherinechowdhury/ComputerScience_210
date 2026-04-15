package Week11;
import java.util.Scanner;
public class Lab {
    
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        // Q1
        System.out.print("Enter the size of the array: ");  
        int size = input.nextInt();

        int[] array1 = new int[size];

        for(int i = 0; i < array1.length; i++){
            array1[i] = (int)(Math.random() * 101);
        }

        for(int i = 0; i < array1.length; i++){
            System.out.print(array1[i] + " ");
        }

        int[] arrayReversed = new int[size];
        int index = 0;

        for(int i = array1.length-1; i >= 0; i--){
            arrayReversed[index] = array1[i];
            index++;
        }
        System.out.println();
         for(int i = 0; i < array1.length; i++){
            System.out.print(arrayReversed[i] + " ");
        }

        // Q2

        int[] array2 = new int[10];

        for(int i = 0; i < array2.length; i++){
            System.out.print("Enter a number: ");
            int num = input.nextInt();
            array2[i] = num;
        }

        for(int i = array2.length-1; i >= 0; i--){
            System.out.print(array2[i] + " ");
        }

        // Q3

        double[] scores = new double[100];

        double sum = 0;
        int count = 0;
        int i = 0;
        double score;
        do{
            System.out.println("Enter a number or -1 to end: ");
            score = input.nextDouble();
            if(score != -1){
                sum += score;
                count++;
                scores[i]=score;
                i++;
            }
        }while(score != -1);

        double average = sum/count;

        int numAbove = 0;
        int numBelow = 0;

        for(int j = 0; j < count; j++){
            if(scores[j] >= average){
                numAbove++;
            }else{
                numBelow++;
            }

        }

    }
}
