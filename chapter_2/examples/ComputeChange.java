/** This computes the minimum number of coins required to make change for
    a specified amount of money.

    e.g. input of $10.35 results in output of 10 dollars, 1 quarter, 1 dime

    @author Brian McEntee */

import java.util.Scanner;

public class ComputeChange {
    public static void main(String[] args) {

        System.out.print("Enter the amount of money: ");
        Scanner kb = new Scanner(System.in);
        double inputAmount = kb.nextDouble();

        int totalCents = (int)Math.round(inputAmount * 100); 
        int numberOfDollars = totalCents / 100;
        int remainingCents = totalCents % 100;
        int numberOfQuarters = remainingCents / 25;
        remainingCents %= 25;
        int numberOfDimes = remainingCents / 10;
        remainingCents %= 10;
        int numberOfNickels = remainingCents / 5;
        remainingCents %= 5;
        int numberOfPennies = remainingCents;

        System.out.println("Making change for $" + inputAmount + "...");
        System.out.println("Dollars: " + numberOfDollars
            + "\nQuarters: " + numberOfQuarters
            + "\nDimes: " + numberOfDimes
            + "\nNickels: " + numberOfNickels
            + "\nPennies: " + numberOfPennies);
    }
}