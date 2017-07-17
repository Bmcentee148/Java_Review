/** Reverse a given String

    @author Brian McEntee */

import java.util.Scanner;

public class Exercise05_46 {
    /** Main method */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = input.nextLine().trim();

        String reverse = "";
        for (int i = 0; i < s.length(); i++)
            reverse = s.charAt(i) + reverse;
        System.out.println("The reversed string is " + reverse);
    }
}