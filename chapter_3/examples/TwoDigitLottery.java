import java.util.Scanner;

public class TwoDigitLottery {
    public static void main(String[] args) {

        //Generate winning numbers randomly 00-99
        int winningNumber1 = (int)(Math.random() * 10);
        int winningNumber2 = (int)(Math.random() * 10);

        //Prompt user to enter chosen numbers
        System.out.print("Enter chosen numbers (00 - 99): ");
        Scanner input = new Scanner(System.in);
        int inputNumbers = input.nextInt();
        
        //Separate chosen numbers into single digits
        int firstChosenNumber = inputNumbers / 10;
        int secondChosenNumber = inputNumbers % 10;

        //Determine how much, if any, user has won
        int winnings = 0;

        if(firstChosenNumber == winningNumber1
            && secondChosenNumber == winningNumber2) {
            //exact order match
            winnings += 10000;
        }
        else if(firstChosenNumber == winningNumber2
            && secondChosenNumber == winningNumber1) {
            //matched in other order
            winnings += 3000;
        }
        else if(firstChosenNumber == winningNumber1
            || firstChosenNumber == winningNumber2
            || secondChosenNumber == winningNumber1
            || secondChosenNumber == winningNumber2) {
            //matched single digit
            winnings += 1000;
        }

        System.out.println("Winning numbers: " + winningNumber1 + winningNumber2);
        System.out.println("Amount won: $" + winnings);
    }
}