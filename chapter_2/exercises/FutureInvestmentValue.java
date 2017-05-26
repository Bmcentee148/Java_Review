/** Given an investment amount, interest rate, and number of years this will
    compute the future value of the investment.

    @author Brian McEntee */ 

import java.util.Scanner;

public class FutureInvestmentValue {
    public static void main(String[] args) {

        //Obtain investment amount, APR, and number of years from user
        Scanner kb = new Scanner(System.in);
        System.out.print("Enter investment amount: ");
        double amountInvested = kb.nextDouble();
        System.out.print("Enter the annual interest rate in percentage: ");
        double annualInterestRate = kb.nextDouble();
        double monthlyInterestRate = (annualInterestRate / 100) / 12;
        System.out.print("Enter the number of years: ");
        int numberOfYears = kb.nextInt();

        //Calculate future investment value w/ given formula
        double futureInvestmentValue = amountInvested 
            * Math.pow(1 + monthlyInterestRate, numberOfYears * 12);

        //Display resulting future investment amount on the console
        System.out.println("Accumulated value is $" 
            + (int)(futureInvestmentValue * 100) / 100.0);

    }
}