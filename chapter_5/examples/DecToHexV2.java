import java.util.Scanner;

public class DecToHexV2 {
    /** Main method */
    public static void main(String[] args) {
        // Create a scanner
        Scanner input = new Scanner(System.in);

        // Prompt user to enter a decimal integer
        System.out.print("Enter a decimal integer: ");
        int decimal = input.nextInt();

        // Convert the decimal value to its hex value
        String hex = "";
        while (decimal != 0) {
            int hexValue = decimal % 16;

            char hexChar = (0 <= hexValue && hexValue <= 9) ?
                (char)(hexValue + '0') : (char)(hexValue - 10 + 'A');

            hex = hexChar + hex;
            decimal = decimal / 16;
        }
        System.out.println("The hex value is " + hex);
    }
}