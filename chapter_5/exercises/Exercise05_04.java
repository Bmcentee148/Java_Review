/** Create a table of miles and kilometers for miles 1 to 10

    @author Brian McEntee */

public class Exercise05_04 {
    /** Main method */
    public static void main(String[] args) {
        final double KILOMETERS_PER_MILE = 1.609;
        // Display table header
        System.out.printf("%-10s%-10s%n", "Miles", "Kilometers");
        // Display table
        for (int miles = 1; miles <= 10; miles++) {
            System.out.printf("%-10d%-10.3f%n",
                miles, miles * KILOMETERS_PER_MILE);
        }
    }
}