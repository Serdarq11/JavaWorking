import java.util.Scanner;

public class _34_quizGame {
    public static void main(String[] args){

        // JAVA QUIZ GAME

        // QUESTIONS array []
        // OPTIONS array [][]
        // DECLARE VARIABLES
        // WELCOME MESSAGE
        // QUESTION (LOOP)
        //      OPTIONS
        //      GET GUESS FROM USER
        //      CHECK OUR GUESS
        // DISPLAY FINAL SCORE

        String[] questions = {"What is the main function of a router?",
                              "Which part of the computer is considered the brain?",
                              "What year was Facebook launched?",
                              "Who is known as the father of computer?",
                              "What was the first programming language?"};

        String[][] options = {{"1. storing files", "2. encrypting data", "3. directing internet traffic", "4. managing passwords"},
                              {"1. CPU", "2. hard drive", "3. RAM", "4. GPU"},
                              {"1. 2000", "2. 2004", "3. 2006", "4. 2008"},
                              {"1. Steve Jobs", "2. Bill Gates", "3. Alan Turing", "4. Charles Babbage"},
                              {"1. COBOL", "2. C", "3. Fortran", "4. Assembly"}};

        int[] answers = {3, 1, 2, 4, 3};
        int score = 0;
        int guess;

        Scanner scanner = new Scanner(System.in);

        System.out.println("******************************");
        System.out.println("Welcome to the JAVA QUIZ GAME");
        System.out.println("******************************");


        for(int i = 0; i < questions.length; i++){
            System.out.println(questions[i]);

            for(String option : options[i]){
                System.out.println(option);
            }

            System.out.print("Enter your guess: ");
            guess = scanner.nextInt();

            if(guess == answers[i]){
                System.out.println("***********");
                System.out.println(" CORRECT! ");
                System.out.println("***********");
                score++;
            }
            else{
                System.out.println("***********");
                System.out.println(" WRONG! ");
                System.out.println("***********");
            }

        }


        System.out.println("Your final score is " + score + " out of " + questions.length);





        scanner.close();
    }
}
