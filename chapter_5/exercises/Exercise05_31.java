/** Compute the final value of a CD given its initial amount, APR, and longevity

    @author Brian McEntee */
import java.util.Scanner;

public class Exercise05_31 {
    /** Main method */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Prompt user to enter initial value, APR, and number of months
        System.out.print("Enter the initial deposit amount: $");
        double initialDeposit = input.nextDouble();
        System.out.print("Enter annual percentage yield: ");
        double monthlyInterestRate = input.nextDouble() / 1200;
        System.out.print("Enter maturity period (number of months): ");
        int numMonths = input.nextInt();

        // Print table header
        System.out.printf("%-7s%-10s%-10s%n", "Month", "Interest", "CD Value");
        double totalValue = initialDeposit;
        for (int month = 1; month <= numMonths; month++) {
            double interest = totalValue * monthlyInterestRate;
            totalValue += interest;
            System.out.printf(
                "%-7d%-10.2f%-10.2f%n", month, interest, totalValue );
        }
    }
}