/** Find the greatest common divisor of two specified numbers

    @author Brian McEntee */
import java.util.Scanner;
public class GreatestCommonDivisor {
    /** Main method */
    public static void main(String[] args) {
        //Create a scanner
        Scanner input = new Scanner(System.in);

        //Prompt user to enter two numbers
        System.out.print("Enter first integer: ");
        int n1 = input.nextInt();
        System.out.print("Enter second integer: ");
        int n2 = input.nextInt();

        //Find greatest common divisor
        int gcd = 1, k = 2;
        while (k <= n1 && k <= n2) {
            if (n1 % k == 0 && n2 % k == 0){
                gcd = k;
            }
            k++;
        }

        System.out.printf("The gcd for %d and %d is %d%n", n1, n2, gcd);
    }
}