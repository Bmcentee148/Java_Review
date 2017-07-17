/** Approximate the value of mathematical e by summing a series

    @author Brian McEntee */

public class Exercise05_26 {
    /** Main method */
    public static void main(String[] args) {
        System.out.printf("%-10s%-10s%n", "i", "e");
        for (int i = 10000; i <= 100000; i += 10000) {
            double e = 1.0;
            double element = 1.0;
            for (int j = 1; j <= i; j++) {
                element /= j;
                e += element;
            }
            System.out.printf("%-10d%-10.16f%n", i, e);
        }
    }
}