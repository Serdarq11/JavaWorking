public class printfClass {
    public static void main(String[] args){

        // printf() = is a method used to format output

        // %[flag][width][.precision][specifier-character]

        String name = "Spongebob";
        char firstLetter = 'S';
        int age = 30;
        double height = 60.5;
        boolean isEmployed = true;

        System.out.printf("Hello %s\n", name);    // Hello Spongebob
        System.out.printf("Your name starts with a %c\n", firstLetter);    // S
        System.out.printf("You are %d years old.\n", age);    // You are 30 years old.
        System.out.printf("You are %f inches tall.\n", height);    // You are 60.500000 inches tall.
        System.out.printf("Employed: %b\n", isEmployed);    // Employed: true

        System.out.printf("%s is %d years old\n", name, age);     // Spongebob is 30 years old

        // + = output a plus
        // , = comma grouping separator                 -> 9000.99 = 9,000.99
        // ( = negative numbers are enclosed in ()      -> -54.01 = (54.01)
        // space = display a minus if negative, display a space if positive


        double price1 = 9.99;
        double price2 = 100.15;
        double price3 = -54.01;

        System.out.printf("%.1f\n", price1);    // 10.0
        System.out.printf("%.1f\n", price2);    // 100.2
        System.out.printf("%.1f\n", price3);    // -54.0

        System.out.printf("%.2f\n", price1);    // 9.99
        System.out.printf("%.2f\n", price2);    // 100.15
        System.out.printf("%.2f\n", price3);    // -54.01

        System.out.printf("%+.2f\n", price1);    // +9.99
        System.out.printf("%+.2f\n", price2);    // +100.15
        System.out.printf("%+.2f\n", price3);    // -54.01

        // [width]

        // 0 = zero padding
        // number = right justified padding
        // negative number = left justified padding

        int id1 = 1;
        int id2 = 23;
        int id3 = 456;
        int id4 = 7890;

        System.out.printf("%04d\n", id1);       // 0001
        System.out.printf("%04d\n", id2);       // 0023
        System.out.printf("%04d\n", id3);       // 0456
        System.out.printf("%04d\n", id4);       // 7890

    }
}
