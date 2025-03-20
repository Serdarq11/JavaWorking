import java.util.Scanner;

public class ShoppingCart {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        String food;
        double price;
        int number;
        char currency = '$';
        double total;

        System.out.print("What food would you like to buy?: ");
        food = scanner.nextLine();
        System.out.print("What is the price for each?: ");
        price = scanner.nextDouble();
        System.out.print("How many would you like?: ");
        number = scanner.nextInt();

        total = price * number;

        System.out.println("You have bought " + number + " " + food + "/s");
        System.out.println("Your total is $," + currency + total);

        scanner.close();
    }
}
