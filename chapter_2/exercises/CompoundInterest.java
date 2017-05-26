/** Given a monthly savings amount and an annual interest rate (5%), this 
    computes the total value of savings after a six month period.

    @author Brian McEntee */

import java.util.Scanner;

public class CompoundInterest {

    public static void main(String[] args) {
        final double ANNUAL_INTEREST_RATE = .05;
        final double MONTHLY_INTEREST_RATE = ANNUAL_INTEREST_RATE / 12;

        //Prompt user to enter monthly savings amount
        System.out.print("Enter the amount saved each month: ");
        Scanner kb = new Scanner(System.in);
        double monthlySavings = kb.nextDouble();

        //Calculate total savings after 6 month period
        double totalSaved = 0.00;
        totalSaved = (totalSaved + monthlySavings) * 
            (1 + MONTHLY_INTEREST_RATE);
        totalSaved = (totalSaved + monthlySavings) * 
            (1 + MONTHLY_INTEREST_RATE);
        totalSaved = (totalSaved + monthlySavings) * 
            (1 + MONTHLY_INTEREST_RATE);
        totalSaved = (totalSaved + monthlySavings) * 
            (1 + MONTHLY_INTEREST_RATE);
        totalSaved = (totalSaved + monthlySavings) * 
            (1 + MONTHLY_INTEREST_RATE);
        totalSaved = (totalSaved + monthlySavings) * 
            (1 + MONTHLY_INTEREST_RATE);


        //Display resulting amount on the console
        System.out.println("After the sixth month, the account value is $"
            + (int)(totalSaved * 100) / 100.0);

    }
}