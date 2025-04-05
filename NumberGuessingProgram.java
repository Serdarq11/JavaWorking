import java.util.Random;
import java.util.Scanner;

public class NumberGuessingProgram {
    public static void main(String[] args){

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int guess;
        int attempts = 0;
        int min = 1;
        int max = 100;
        int randomNumber = random.nextInt(min, max + 1);

        System.out.println("NUMBER GUESSING GAME");
        System.out.printf("Guess a number between %d and %d\n", min, max);

        do{
            System.out.print("Enter a guess!: ");
            guess = scanner.nextInt();
            attempts++;

            if(guess < randomNumber){
                System.out.println("Your guess is less than the number.");
            }
            else if(guess > randomNumber){
                System.out.println("Your guess is higher than the number.");
            }
            else{
                System.out.println("CORRECT! The number was " + randomNumber);
                System.out.println("The number of attempts: " + attempts);
            }

        }while(guess != randomNumber);




        scanner.close();

    }
}
