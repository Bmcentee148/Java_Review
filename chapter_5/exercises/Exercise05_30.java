/** Find compound value of monthly savings given # months, amnt saved, and APR

    @author Brian McEntee */

import java.util.Scanner;

public class Exercise05_30 {
    /** Main method */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Prompt user to enter monthly savings, APR, and number of months
        System.out.print("Enter the amount saved per month: $");
        double savedPerMonth = input.nextDouble();
        System.out.print("Enter the annual interest rate: ");
        double monthlyInterestRate = input.nextDouble() / 12;
        System.out.print("Enter the number of months you will save for: ");
        int numMonths = input.nextInt();

        double totalSaved = 0;
        for (int month = 0; month < numMonths; month++) {
            totalSaved = (totalSaved + savedPerMonth) * (1 + monthlyInterestRate);
        }

        System.out.printf("Total savings: $%.2f%n", totalSaved);
    }
}