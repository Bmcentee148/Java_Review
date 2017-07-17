/** Find all 'perfect' numbers up to 10,000

    @author Brian McEntee */

public class Exercise05_33 {
    /** Main method */
    public static void main(String[] args) {
        final int MAX_NUMBER = 100000;
        int numFound = 0;

        for (int num = 2; num < MAX_NUMBER; num++) {
            int sum = 0;
            for (int divisor = 1; divisor < num; divisor++) {
                if (num % divisor == 0) {
                    sum += divisor;
                }
            }
            if (num == sum) {
                numFound++; //number is perfect
                System.out.printf("%d is a perfect number%n", num);
            }
        }
    }
}