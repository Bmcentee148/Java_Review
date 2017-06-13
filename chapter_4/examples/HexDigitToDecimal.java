/** Transform a single hexadecimal digit (base 16) to its decimal form (base 10)

    @author Brian McEntee */

import java.util.Scanner;

public class HexDigitToDecimal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a single hex digit: ");
        String hexString = input.nextLine();

        if(hexString.trim().length() != 1) {
            System.out.println("Error: You must enter EXACTLY one digit");
            System.exit(1);
        }

        char hexChar = Character.toUpperCase(hexString.charAt(0));
        if('A' <= hexChar && hexChar <= 'F') {
            int decChar = hexChar - 'A' + 10;
            System.out.println("The decimal value for hex digit " + hexChar +
                " is " + decChar);
        }
        else if(Character.isDigit(hexChar)) {
            System.out.println("The decimal value for hex digit " + hexChar +
                " is " + hexChar);
        }
        else {
            System.out.println("Error: " + hexChar + " is an invalid input");
        }
    }
}