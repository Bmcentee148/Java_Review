/** Approximate pi of different accuracies using a summation

    @author Brian McEntee */

public class Exercise05_25 {
    /** Main method */
    public static void main (String[] args) {
        System.out.printf("%-10s%-10s%n", "i", "pi");
        for(int i = 10000; i <= 100000; i+= 10000) {
            double summation = 0;
            for (int j = 1; j <= i; j++) {
                summation += 4.0 * (Math.pow(-1, j + 1) / (2 * j - 1));
            }
            System.out.printf("%-10d%-10.5f%n", i, summation);
        }
    }
}