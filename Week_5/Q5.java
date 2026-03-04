package Week_5;
import java.util.*;
public class Q5 {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a character from a-z: ");

        String character = input.nextLine();

        switch(character){
            case "a": System.out.println(character + " is a vowel."); break;
            case "e": System.out.println(character + " is a vowel."); break;
            case "i": System.out.println(character + " is a vowel."); break;
            case "o": System.out.println(character + " is a vowel."); break;
            case "u": System.out.println(character + " is a vowel."); break;
            default: System.out.println(character + " is a consonant.");
        }

        input.close();


    }
    
}
