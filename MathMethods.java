import java.util.Scanner;

public class MathMethods {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        // System.out.println(Math.PI);
        // System.out.println(Math.E);

        double result;

        result = Math.pow(2, 3);    // 8.0
        result = Math.abs(-5);      // 5.0
        result = Math.sqrt(9);      // 3.0
        result = Math.round(3.14);  // 3.0
        result = Math.ceil(3.14);   // 4.0
        result = Math.floor(3.99);   // 3.0
        result = Math.max(10, 20);   // 20.0
        result = Math.min(10, 20);   // 10.0

        System.out.println(result);

        // HYPOTENUSE c = Math.sqrt(a² + b²)

        double a;
        double b;
        double c;

        System.out.print("Enter a number for a: ");
        a = scanner.nextDouble();

        System.out.print("Enter a number for b: ");
        b = scanner.nextDouble();

        c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));

        System.out.println("The hypotenuse is: " + c + " cm");

        scanner.close();

    }
}


