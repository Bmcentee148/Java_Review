/* This will generate two random numbers and quiz the user on their sum. */

import java.util.Scanner;

public class AdditionQuiz {
    public static void main(String[] args) {

        //Generate necessary random numbers 0-9
        int numberOne = (int)System.currentTimeMillis() % 10;
        int numberTwo = (int)System.currentTimeMillis() / 7 % 10;

        //Quiz user on the sum of these two numbers
        System.out.println("What is " + numberOne + " + " + numberTwo + "?");
        Scanner kb = new Scanner(System.in);
        int submittedAnswer = kb.nextInt();

        //Determine whether user was correct or incorrect
        boolean isCorrect = (submittedAnswer == numberOne + numberTwo);

        System.out.println(numberOne + " + " + numberTwo + " = "
            + submittedAnswer + " is " + isCorrect);
    }
}
