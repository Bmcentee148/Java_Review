/** Find the largest number n such that n^3 < 12000

    @author Brian McEntee */

public class Exercise05_13 {
    /** Main method */
    public static void main(String[] args) {
        int n = 0;
        while (Math.pow(n+1, 3) < 12000) {
            n++;
        }
        System.out.printf("%-5s%-5s%n", "n", "n^3");
        System.out.printf("%-5d%-5d%n", n, n * n * n);
    }
}