/** Sums the series (1/3) + (3/5) + (5/7) + ... + (97/99)

    @author Brian McEntee */

public class Exercise05_24 {
    /** Main method */
    public static void main(String[] args) {
        int numerator = 1;
        int denominator = 3;
        double sum = 0;

        while (numerator <= 97 && denominator <= 99) {
            sum += (float)numerator / denominator;
            numerator += 2;
            denominator += 2;
        }

        System.out.printf("The sum is %.2f%n", sum);
    }
}