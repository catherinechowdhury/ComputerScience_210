package Week_6;

public class MoreSwitch {
    public static void main(String[] args) {
        
        // Switch statements can also be used with String variables

        String dayOfWeek = "Monday";

        switch (dayOfWeek) {
            case "Monday": System.out.println("It's Monday!"); break;
            case "Tuesday": System.out.println("It's Tuesday!"); break;
            case "Wednesday": System.out.println("It's Wednesday!"); break;
            case "Thursday": System.out.println("It's Thursday!"); break;
            case "Friday": System.out.println("It's Friday!"); break;
            case "Saturday": System.out.println("It's Saturday!"); break;
            case "Sunday": System.out.println("It's Sunday!"); break;
            default: System.out.println("Invalid day of the week.");
        }

        // Using better formatting for switch statements with arrow statements (available in Java 14 and later)
        switch (dayOfWeek) {
            case "Monday" -> System.out.println("It's Monday!");
            case "Tuesday" -> System.out.println("It's Tuesday!");
            case "Wednesday" -> System.out.println("It's Wednesday!");
            case "Thursday" -> System.out.println("It's Thursday!");
            case "Friday" -> System.out.println("It's Friday!");
            case "Saturday" -> System.out.println("It's Saturday!");
            case "Sunday" -> System.out.println("It's Sunday!");
            default -> System.out.println("Invalid day of the week.");
        }

        // If multiple cases have the same code, we can group them together without break statements in between 
        String season = "Spring";
        switch (season) {
            case "Spring", "Summer", "Fall", "Autumn", "Winter" -> System.out.println("It's a valid season.");
            default -> System.out.println("Invalid season.");
        }

        // If there are multiple lines of code for a case, we can use a block of code with curly braces
        switch (season) {
            case "Spring" -> {
                System.out.println("It's Spring!");
                System.out.println("The weather is getting warmer.");
            }
            case "Summer" -> {
                System.out.println("It's Summer!");
                System.out.println("It's hot outside.");
            }
            case "Fall", "Autumn" -> {
                System.out.println("It's Fall/Autumn!");
                System.out.println("The leaves are changing color.");
            }
            case "Winter" -> {
                System.out.println("It's Winter!");
                System.out.println("It's cold outside.");
            }
            default -> System.out.println("Invalid season.");
        }

    // Let's retry the vowel example
    String character = "a";
    switch (character) {
            case "a", "e", "i", "o", "u" -> System.out.println(character + " is a vowel.");
            default -> System.out.println(character + " is a consonant.");
        
    }
}
}

    

