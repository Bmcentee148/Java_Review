/** Finds the lowest number of monetary units to compose a given amount of
    money. To prevent a loss of accuracy with converting a float to an int,
    we will take the input as a String and extract the number of dollars and
    cents, storing them as seperate integers. 

    @author Brian McEntee */
import java.util.Scanner;
public class MonetaryUnits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the amount of money: ");
        String totalAmount = input.nextLine();

        int decimalIndex = totalAmount.indexOf('.');
        int dollarAmount = Integer.parseInt(
            totalAmount.substring(0, decimalIndex) );
        int centAmount = Integer.parseInt(
            totalAmount.substring(decimalIndex + 1) );

        int numQuarters = centAmount / 25;
        int centsRemaining = centAmount % 25;

        int numDimes = centsRemaining / 10;
        centsRemaining = centsRemaining % 10;

        int numNickels = centsRemaining / 5;
        centsRemaining = centsRemaining % 5;

        System.out.println(
              "Dollars: " + dollarAmount + "\n"
            + "Quarters: " + numQuarters + "\n"
            + "Dimes: " + numDimes + "\n"
            + "Nickels: " + numNickels + "\n"
            + "Pennies: " + centsRemaining);
    }
}