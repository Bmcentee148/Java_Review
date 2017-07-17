/** Find the smallest number n such that n^2 is greater than 12,000
    
    @author Brian McEntee */

public class Exercise05_12 {
    /** Main method */
    public static void main(String[] args) {
        int n = 1;
        while (n * n <= 12000) {
            n++;
        }
        System.out.printf("%-5s%-5s%n", "n", "n^2");
        System.out.printf("%-5d%-5d%n", n, n * n);
    }
}