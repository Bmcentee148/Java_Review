/** Find the greatest common divisor (gcd) of two given numbers
    
    @author Brian McEntee */
import java.util.Scanner;
public class Exercise05_14 {
    /** Main method */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter two integers: ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();

        int divisor = Math.min(num1, num2);
        while (divisor >= 1) {
            if (num1 % divisor == 0 && num2 % divisor == 0)
                break;
            divisor--;
        }

        System.out.println("The greatest common divisor of " + num1 + " and " +
            num2 + " is " + divisor);
    }
}