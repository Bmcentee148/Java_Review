/** Quiz user on 5 subtraction problems and display graded problems

    @author Brian McEntee */
import java.util.Scanner;
public class SubtractionQuizLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final long START_TIME = System.currentTimeMillis();
        final int NUM_QUESTIONS = 5;
        int a = 0, b = 0, count = 0, numCorrect = 0;
        String gradedQuiz = "";

        while (count < NUM_QUESTIONS) {
            //Generate two random integers for problem
            a = (int)(Math.random() * 10);
            b = (int)(Math.random() * 10);

            //Insure value of a is > value of b so answer is strictly positive
            if(a < b) {
                int temp = a;
                a = b;
                b = temp;
            }

            //Prompt user to answer question
            System.out.printf(
                "What is %d - %d? ", a, b);
            int answer = input.nextInt();
            if (answer != a - b) {
                System.out.printf(
                    "Wrong answer. The solution to %d - %d should be %d%n",
                    a, b, a - b);
            }
            else {
                System.out.println("That is correct!");
                numCorrect++;
            }

            //add graded answer to output string
            gradedQuiz += "\n" + (count + 1) + ". " + a + " - " + b + " = "
                + answer + " " + ((a - b == answer) ? "correct" : "incorrect");

            count++; //increase question number

            System.out.println(); //leave empty line between questions
        }

        final long END_TIME = System.currentTimeMillis();
        System.out.printf("The test took %d seconds%n",
            (END_TIME - START_TIME) / 1000);
        System.out.printf("You got %d out of %d correct",
            numCorrect, NUM_QUESTIONS);
        System.out.println(gradedQuiz);
    }
}