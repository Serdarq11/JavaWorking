import java.sql.SQLOutput;
import java.util.Scanner;

public class _27_BankingProgram {

    static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args){
        // JAVA BANKING PROGRAM FOR BEGINNERS

        // DECLARE VARIABLES
        // DISPLAY MENU
        // GET AND PROCESS USER'S CHOICE
        // showBalance()
        // deposit()
        // withdraw()
        // EXIT MESSAGE


        double balance = 0;
        boolean isRunning = true;
        int choice;
        double deposit = 20;

        while(isRunning){
            System.out.println("BANKING PROGRAM");
            System.out.println("***************");
            System.out.println("1. Show Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. EXIT");

            System.out.print("Enter your choice (1-4): ");
            choice = keyboard.nextInt();

            switch(choice){
                case 1 -> showBalance(balance);
                case 2 -> balance += deposit();
                case 3 -> balance -= withdraw(balance);
                case 4 -> isRunning = false;
                default -> System.out.println("INVALID CHOICE");
            }
        }

        System.out.println("******************");
        System.out.println("Thank you! Have a nice day!");

        keyboard.close();
    }
    static void showBalance(double balance){
        System.out.println("***************");
        System.out.printf("$%.2f\n", balance);
    }
    static double deposit(){
        double amount;

        System.out.print("Enter an amount to be deposited: ");
        amount = keyboard.nextDouble();

        if(amount < 0){
            System.out.println("Amount cannot be negative.");
            return 0;
        }
        else{
            return amount;
        }

    }
    static double withdraw(double balance){
        double amount;

        System.out.print("Enter an amount to be withdrawn: ");
        amount = keyboard.nextDouble();

        if(amount > balance){
            System.out.println("INSUFFICIENT FUNDS!");
            return 0;
        }
        else if(amount < 0){
            System.out.println("Amount cannot be negative!");
            return 0;
        }
        else{
            return amount;
        }
    }
}
