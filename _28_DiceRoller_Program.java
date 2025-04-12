import java.util.Random;
import java.util.Scanner;

public class _28_DiceRoller_Program {
    public static void main(String[] args){
        // JAVA DICE ROLLER PROGRAM

        // STEPS
        // 1. declare variables
        // 2. get the number of dice from the user
        // 3. check if the number of dice > 0
        // 4. roll all the dice
        // 5. get the total
        // 6. display ascii of dice

        Scanner keyboard = new Scanner(System.in);
        Random random = new Random();

        // step 1
        int numOfDice;
        int total = 0;

        // step 2
        System.out.println("Enter the number of dice to roll: ");
        numOfDice = keyboard.nextInt();

        // step 3, 4, 5
        if(numOfDice > 0){
            for(int i = 0; i < numOfDice; i++){
                int roll = random.nextInt(1, 7);
                printDie(roll);
                System.out.println("You rolled " + roll);
                total += roll;
            }
            System.out.println("Total: " + total);
        }
        else{
            System.out.println("Number of dice must be greater than 0");
        }

        System.out.println("The average is: " + total / numOfDice);

        keyboard.close();
    }
    // step 6
    static void printDie(int roll){     // die is the singular version of dice
        String dice1 = """
                -------
               |       |
               |   ●   |
               |       |
                -------
               """;

        String dice2 = """
                -------
               | ●      |
               |        |
               |      ● |
                -------
               """;

        String dice3 = """
                -------
               |●      |
               |   ●   |
               |      ●|
                -------
               """;

        String dice4 = """
                -------
               |●     ●|
               |       |
               |●     ●|
                -------
               """;

        String dice5 = """
                -------
               |●     ●|
               |   ●   |
               |●     ●|
                -------
               """;

        String dice6 = """
                -------
               |●     ●|
               |●     ●|
               |●     ●|
                -------
               """;

        switch(roll){
            case 1 -> System.out.print(dice1);
            case 2 -> System.out.print(dice2);
            case 3 -> System.out.print(dice3);
            case 4 -> System.out.print(dice4);
            case 5 -> System.out.print(dice5);
            case 6 -> System.out.print(dice6);
            default -> System.out.print("INVALID ROLL");
        }

    }

}
