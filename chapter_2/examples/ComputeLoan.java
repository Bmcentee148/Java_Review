import java.util.Scanner;

public class ComputeLoan {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in); //for capturing input from keyboard

        System.out.print("Enter the initial loan amount: ");
        double loanAmount = kb.nextDouble();

        System.out.print("Enter the annual interest rate: ");
        double annualInterestRate = kb.nextDouble();

        System.out.print("Enter the number of years payments will be made: ");
        double numberOfYears = kb.nextDouble();

        double monthlyInterestRate = (annualInterestRate / 12) / 100;

        double monthlyPayment = (loanAmount * monthlyInterestRate) / 
            (1 - (1 / (Math.pow(1 + monthlyInterestRate, numberOfYears * 12))));

        double totalPayment = monthlyPayment * numberOfYears * 12;

        System.out.println("The monthly payment is: $" 
            + (int)(monthlyPayment * 100) / 100.0);
        System.out.println("The total payment is: $" 
            + (int)(totalPayment * 100) / 100.0);


    }
}