/** Simulate a game of rock paper scissors, user vs the computer

    @author Brian McEntee */
import java.util.Scanner;
public class Exercise05_34 {
    /** Main method */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final int USER = 0;
        final int COMPUTER = 1;
        final int TIE = 2;
        int numUserWins = 0, numComputerWins = 0;

        while (Math.max(numUserWins, numComputerWins) - 
            Math.min(numUserWins, numComputerWins) < 2) {
            // Prompt user to choose rock paper or scissor
            System.out.print("Enter rock, paper, or scissors: ");
            String userSelection = input.nextLine().trim().toLowerCase();
            // Generate random selection for AI
            String compSelection = "";
            int rand = (int)(Math.random() * 3);
            if (rand == 0)
                compSelection = "rock";
            else if (rand == 1)
                compSelection = "paper";
            else if (rand == 2) 
                compSelection = "scissors";


            int winner = TIE;
            if (userSelection.equals(compSelection)) {
                // both players have the same selection -> tie
                System.out.println("You both chose " + userSelection);
                continue;
            }
            else {
                switch (userSelection) {
                    case "rock" :
                    if (compSelection == "scissors") {
                        winner = USER;
                        numUserWins++;
                    }
                    else if (compSelection == "paper") {
                        winner = COMPUTER;
                        numComputerWins++;
                    }
                    break;
                    case "paper" :
                    if (compSelection == "rock") {
                        winner = USER;
                        numUserWins++;
                    }
                    else if (compSelection == "scissors") {
                        winner = COMPUTER;
                        numComputerWins++;
                    }
                    break;
                    case "scissors" :
                    if (compSelection == "paper") {
                        winner = USER;
                        numUserWins++;
                    }
                    else if (compSelection == "rock") {
                        winner = COMPUTER;
                        numComputerWins++;
                    }
                    break;
                }
            }

            System.out.println("You chose " + userSelection + " and the computer "
                + "chose " + compSelection);
            if (winner == USER) {
                System.out.println("You won this round");
            }
            else if (winner == COMPUTER) { 
                System.out.println("Sorry, you lost this round");
            }
            else {
                System.out.println("You both tied this round");
            }
        }

        System.out.printf("Game over!%nUser Wins: %d%nComputer Wins: %d%n",
            numUserWins, numComputerWins);

    }
}