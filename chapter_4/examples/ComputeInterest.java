/** Compute amount of interest accrued given an initial amount and the annual
    interest rate.

    @author Brian McEntee */
import java.text.DecimalFormat;

public class ComputeInterest {
    public static void main(String[] args) {
        double amount = 12618.98;
        double interestRate = 0.0013; //0.13%
        double interest = 00.1567;//amount * interestRate;
        
        System.out.println("Interest is $" + (int)(interest * 100) / 100.0);
        System.out.printf("Interest is $%.2f%n", interest);
        DecimalFormat currencyFormat = new DecimalFormat("$###,#0.00");
        System.out.println("Interest is " + currencyFormat.format(interest));
    }
}