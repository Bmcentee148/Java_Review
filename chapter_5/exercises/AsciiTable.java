/** Print an Ascii table that contains the character, unicode and integer values

    @author Brian McEntee */

public class AsciiTable {
    /** Main method */
    public static void main(String[] args) {
        // Print table header
        System.out.printf("%-10s%-10s%-10s%n",
            "Unicode", "Integer", "Character");
        System.out.println("-----------------------------");

        // Print table for lower case letters
        for (int i = 97; i <= 122; i++) {
            System.out.printf("%-10s%-10d%-10c%n",
                "/u" + Integer.toHexString(i), i, (char)i);
        }

        // Print table for upper case letters
        for (int i = 65; i <= 90; i++) {
            System.out.printf("%-10s%-10d%-10c%n",
                "/u" + Integer.toHexString(i), i, (char)i);
        }
    }
}