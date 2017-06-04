import java.util.Scanner;

public class SubtractionQuiz {
    public static void main(String[] args) {
        //Generate the two random numbers 0 through 9
        int number1 = (int)(Math.random() * 10);
        int number2 = (int)(Math.random() * 10);

        //Ensure that first number is greater than second number
        if (number1 < number2) {
            int tempNumber = number1;
            number1 = number2;
            number2 = tempNumber;
        }

        //Prompt user for an answer to the resulting question
        System.out.println("What is " + number1 + " - " + number2 + "?");
        Scanner kb = new Scanner(System.in);
        int userAnswer = kb.nextInt();

        //Determine whether or not the user was correct
        if (userAnswer == number1 - number2) {
            System.out.println("That is correct!");
        }
        else {
            System.out.println("Sorry, that is not correct.");
        }
    }
}