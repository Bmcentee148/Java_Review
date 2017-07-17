/** Create a table that converts pound to kilograms and kilograms to pounds

    @author Brian McEntee */

public class Exercise05_05 {
    /** Main method */
    public static void main(String[] args) {
        final double POUNDS_PER_KILOGRAM = 2.2;
        final double KILOGRAMS_PER_POUND = 1 / POUNDS_PER_KILOGRAM;

        // Print table header
        System.out.printf("%-11s%-11s%-5s%-11s%-11s%n",
            "Kilograms", "Pounds", "|", "Pounds", "Kilograms");
        // Print table
        for (int kilograms = 1, pounds = 20; 
                kilograms < 200 && pounds <= 515; kilograms += 2, pounds += 5) {

            System.out.printf("%-11d%-11.1f%-5s%-11d%-11.2f%n",
                kilograms, kilograms * POUNDS_PER_KILOGRAM, "|", 
                pounds, pounds * KILOGRAMS_PER_POUND);
        }
    }
}