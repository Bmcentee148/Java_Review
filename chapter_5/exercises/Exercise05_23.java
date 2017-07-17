/** Demonstrate cancellation errors when manipulating a very large number with
    a small number

    @author Brian McEntee */

public class Exercise05_23 {
    /** Main method */
    public static void main(String[] args) {
        int divisor1 = 50000;
        int divisor2 = 1;
        double sum1 = 0, sum2 = 0;

        while (divisor1 >= 1 && divisor2 <= 50000) {
            sum1 += 1.0 / divisor1; // more accurate summation
            sum2 += 1.0 / divisor2;
            divisor1--;
            divisor2++;
        }
        System.out.println("The difference in accuracy is " + (sum1 - sum2));
    }
}