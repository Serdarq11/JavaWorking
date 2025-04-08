public class methods {
    public static void main(String[] args){
        // method: a block of reusable code that is executed when called ()

        String name = "Serdar";
        int age1 = 21;

        happyBirthday(name, age1);

        System.out.println(square(3));

        System.out.println(cube(2));

        String getFullname = fullname("Serdar", "Kaya");
        System.out.println(getFullname);

        int age = 15;

        if(ageCheck(age)){
            System.out.println("You may sign up!");
        }
        else{
            System.out.println("You must be 18+ to sign up!");
        }

    }

    static void happyBirthday(String name, int age1){
        System.out.println("Happy birthday to you!");
        System.out.printf("Happy birthday dear %s!\n", name);
        System.out.printf("You are %d years old!\n", age1);
        System.out.println("Happy birthday to you!\n");
    }
    static double square(double number){
        return number * number;
    }
    static double cube(double number){
        return number * number * number;
    }
    static String fullname(String firstName, String surname){
        return firstName + " " + surname;
    }
    static boolean ageCheck(int age){
        if(age >= 18){
            return true;
        }
        else{
            return false;
        }
    }

}
