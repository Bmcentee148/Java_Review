import java.util.Scanner;

public class GreatestCommonDivisorMethod {
    /** Main method */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first integer: ");
        int n1 = input.nextInt();
        System.out.print("Enter second integer: ");
        int n2 = input.nextInt();

        System.out.printf("The greatest common divisor of %d and %d is %d%n",
            n1, n2, gcd(n1, n2));
    }
    /** Find the greatest common divisor of two integers */
    public static int gcd(int n1, int n2) {
        int gcd = 1;
        int divisor = Math.min(n1, n2);
        while (divisor > 1) {
            if (n1 % divisor == 0 && n2 % divisor == 0) {
                gcd = divisor;
                break;
            }
            divisor--;
        }
        return gcd;
    }
}