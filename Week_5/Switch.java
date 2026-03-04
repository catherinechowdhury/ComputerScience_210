package Week_5;

public class Switch {
    
   

    public static void main(String[] args) {

         // Switch statements are used to execute one block of code among many based on the value of a variable or expression.

        // Switch statement syntax:
        // switch (variable) {  
        //     case value1:
        //         // code to be executed if variable == value1
        //         break;
        //     case value2:
        //         // code to be executed if variable == value2
        //         break;
        //     ...
        //     default:
        //         // code to be executed if variable doesn't match any case
        // }

        // Note: variables used in switch statements can be of type int or String, but not double or boolean.

        // Note: break means to exit the switch statement. If break is omitted, the program will continue to execute the next case(s) until it encounters a break or the end of the switch statement.

        int dayOfWeek = 3; // 1: Monday, 2: Tuesday, ..., 7: Sunday

        switch (dayOfWeek) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid day of the week");
        }

    }
}
