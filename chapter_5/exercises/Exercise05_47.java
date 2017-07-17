/** Find the last digit (checksum) of an ISBN given the first 12 digits

    @author Brian McEntee */

import java.util.Scanner;

public class Exercise05_47 {
    /** Main method */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String isbn = "";
        boolean isValid = true;
        do {
            // Prompt user to enter first 12 digits of ISBN
            System.out.print(
                "Enter the first 12 digits of an ISBN-13 as a string: ");
            isbn = input.nextLine().trim();
            isValid = isbn.length() == 12;
            for(int i = 0; i < isbn.length(); i++) {
                if (!Character.isDigit(isbn.charAt(i))) {
                    isValid = false;
                    break;
                }
            }
            if (!isValid)
                System.out.println(isbn + " is an invalid input");
        } while (!isValid);

        int sum = 0;
        for (int i = 0; i < isbn.length(); i++) {
            if (i % 2 == 0)
                sum += isbn.charAt(i) - '0';
            else
                sum +=  3 * (isbn.charAt(i) - '0');
        }

        int checksum = 10 - (sum % 10);
        isbn += (checksum == 10 ? 0 : checksum);
        System.out.println("The ISBN-13 number is " + isbn);

    }
}