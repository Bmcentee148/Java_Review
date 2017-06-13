/** Reads Strings in from console input, storing each word in its own variable.

    @author Brian McEntee */

import java.util.Scanner;

public class StringInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter three words separated by spaces: ");
        String str1 = input.next();
        String str2 = input.next();
        String str3 = input.next();

        System.out.println("str1 is " + str1);
        System.out.println("str2 is " + str2);
        System.out.println("str3 is " + str3);
    }
}