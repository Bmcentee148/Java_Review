/** Convert a given decimal value into its corresponding binary representation

    @author Brian McEntee */
import java.util.Scanner;

public class Exercise05_37 {
    public static void main(String[] args) {
        // Prompt user to enter a decimal integer
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a decimal integer: ");
        int decimal = input.nextInt();

        int quotient = decimal;
        int remainder = 0;
        String binary = "";
        while (quotient > 0) {
            int binaryDigit = quotient % 2;
            binary = binaryDigit + binary;
            quotient /= 2;
        }
        System.out.println("The binary representation of " + decimal + " is " 
            + binary);
    }
}