package Week_5;

public class Switch {
    
   

    public static void main(String[] args) {

        int dayOfWeek = 1; // 1: Monday, 2: Tuesday, ..., 7: Sunday

        if( dayOfWeek == 1){
            System.out.println("Monday");

        }else if (dayOfWeek == 2){
            System.out.println("Tuesday");

        }else if (dayOfWeek == 3){
            System.out.println("Wednesday");

        }else if (dayOfWeek == 4){
            System.out.println("Thursday"); 

        }else if (dayOfWeek == 5){
            System.out.println("Friday");

        }else if (dayOfWeek == 6){
            System.out.println("Saturday");

        }else if (dayOfWeek == 7){
            System.out.println("Sunday");
            
        }else{
            System.out.println("Invalid day of the week");
        }

         // Switch statements are used to execute one block of code among many based on the value of a variable or expression.
         // Use switch when you are checking one variable against many specific constant values

        // Switch statement syntax:

        // switch (1) {  
        //     case 1:
        //         // code to be executed if variable == value1
                // break;
        //        
        //     case 2:
        //         // code to be executed if variable == value2
        //         // break;
        //     ...
        //     default:
        //         // code to be executed if variable doesn't match any case
        // }

        // Note: variables used in switch statements can be of type int or String, but not double or boolean.

        // Note: break means to exit the switch statement. If break is omitted, the program will continue to execute the next case(s) until it encounters a break or the end of the switch statement.

       dayOfWeek = 3;

        switch (dayOfWeek) {
            case 1: // if <--- start here
                System.out.println("Monday");
                break;
            case 2: // else if
                System.out.println("Tuesday");
                break;
            case 3: // else if
                System.out.println("Wednesday");
                break;
            case 4: // else if
                System.out.println("Thursday");
                break;
            case 5: //else if
                System.out.println("Friday");
                break;
            case 6: //else if
                System.out.println("Saturday");
                break;
            case 7: //else if
                System.out.println("Sunday");
                break;
            default: // else statement
                System.out.println("Invalid day of the week");
        }

        

        

    }
}
