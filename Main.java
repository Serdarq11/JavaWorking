public class Main {
    public static void main(String[] args){

        // This is my first java program

        /*
        This
        is
        a
        multi-line
        comment
         */

        System.out.println("I like pizza!");
        System.out.print("It's really good!\n");
        System.out.print("Buy me pizza!\n");

        int age = 21;
        double price = 19999.99;
        int year = 2025;
        double gpa = 3;

        System.out.println(age);
        System.out.println("$" + price);
        System.out.println("The year is " + year);
        System.out.println(gpa); // 3.0

        char grade = 'A';
        char symbol = '!';
        char currency = '$';

        System.out.println(grade);
        System.out.println(symbol);
        System.out.println(currency);

        boolean isStudent = true;
        boolean forSale = false;
        boolean isOnline = true;

        System.out.println(isStudent);
        System.out.println(forSale);
        System.out.println(isOnline);

        if(isStudent){
            System.out.println("You are a student!");
        }
        else{
            System.out.println("You are NOT a student!");
        }

        String name = "John Doe";
        String food = "pizza";
        String email = "fake123@gmail.com";
        String car = "Mustang";
        String color = "blue";

        System.out.println("Hello " + name);
        System.out.println("Your favorite food is: " + food);
        System.out.println("Your email is " + email);
        System.out.println("You are " + age + " years old!");
        System.out.println("Your gpa is: " + gpa);
        System.out.println("Your average letter grade is: " + grade);
        System.out.println("Your choice is: " + color + ' ' + year + ' ' + car);
        System.out.println("The price is: " + currency + price);

        if(forSale){
            System.out.println("There is a car " + car + " for sale!");
        }
        else{
            System.out.println("The " + car + " is not for sale!");
        }

    }
}


