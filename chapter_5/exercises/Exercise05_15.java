/** Print the ascii character table with 10 characters per line

    @author Brian McEntee */

public class Exercise05_15 {
    /** Main method */
    public static void main(String[] args) {
        final int START_INDEX = 33; // '!'
        final int END_INDEX = 126; // '~'

        int charCount = 0;
        for (int i = START_INDEX; i <= END_INDEX; i++) {
            charCount++;
            if (charCount % 10 == 0)
                System.out.println((char)i);
            else
                System.out.print((char)i + " ");
        }
    }
}