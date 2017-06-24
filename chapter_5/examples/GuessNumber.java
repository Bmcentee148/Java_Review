/** Game that has user guess a number randomly chosen. For each wrong answer,
    the user will be told whether his guess was too high or too low. The 
    game ends when the user enters the correct number.

    @author Brian McEntee */

import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        // Generate random number 0 to 100 inclusive
        int answer = (int)(Math.random() * 101);

        //Prompt user to enter first guess
        Scanner input = new Scanner(System.in);
        System.out.println("Guess a number between 0 and 100.");

        int guess = -1;
        while (guess != answer) {
            System.out.print("Enter your guess: ");
            guess = input.nextInt();
            if (guess < answer) {
                System.out.println("Your guess is too low");
            }
            else if (guess > answer) {
                System.out.println("Your guess is too high");
            }
            else if (guess == answer) {
                System.out.println("Yes, the number is " + answer);
            }
        }
        
    }//end main
}//end GuessNumber
