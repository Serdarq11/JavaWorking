import java.util.Scanner;

public class EnhancedSwitches {
    public static void main(String[] args){

        // enhanced switch: A replacement to many if else statements
        //                  (Java 14 feature)

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the day of the week: ");
        String day = scanner.nextLine();

        switch(day){
            case "Monday", "Tuesday", "Wednesday", "Thursday", "Friday" ->
                    System.out.println("It is weekday 😒");
            case "Saturday", "Sunday" ->
                    System.out.println("It is the weekend 😊");
            default -> System.out.println(day + " is not a day!");


        }


    }
}
