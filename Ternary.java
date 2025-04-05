public class Ternary {
    public static void main(String[] args){

        // ternary operator ? = return 1 of 2 values if a condition is true

        // variable = (condition) ? ifTrue : ifFalse;

        int score = 55;

        //if(score >= 60){
        //    System.out.println("PASS");
        //}
        //else{
        //    System.out.println("FAIL");
        //}

        String passOrFail = (score >= 60) ? "PASS" : "FAIL";

        System.out.println(passOrFail);


        int number = 6;

        String evenOrOdd = (number % 2 == 0) ? "EVEN" : "ODD";

        System.out.println(evenOrOdd);

    }
}
