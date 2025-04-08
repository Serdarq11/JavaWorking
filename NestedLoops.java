import java.util.Scanner;

public class NestedLoops {
    public static void main(String[] args){

        // nested loop: a loop inside another loop
        //                used often with matrices and DS&A (data structures and algorithms)

        Scanner keyboard = new Scanner(System.in);

        /*
        for(int i = 1; i <= 3; i++){
            for(int j = 1; j < 10; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
         */

        int rows;
        int columns;
        char symbol;

        System.out.print("Enter the number of rows: ");
        rows = keyboard.nextInt();

        System.out.print("Enter the number of columns: ");
        columns = keyboard.nextInt();

        System.out.print("Enter the symbol to use: ");
        symbol = keyboard.next().charAt(0);

        for(int i = 0; i < rows; i++){
            for(int j = 0; j < columns; j++){
                System.out.print(symbol);
            }
            System.out.println();
        }

        keyboard.close();
    }
}
