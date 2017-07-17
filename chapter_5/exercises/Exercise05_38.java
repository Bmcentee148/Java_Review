/** Convert a given decimal value into its octal equivalent

    @author Brian McEntee */
import java.util.Scanner;
public class Exercise05_38 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a decimal integer: ");
        int dec = input.nextInt();

        int quotient = dec;
        int remainder = 0;
        String octString = "";
        while (quotient > 0) {
            octString = (quotient % 8) + octString;
            quotient /= 8;
        }
        System.out.println("The octal equivalent of " + dec + " is "
            + octString);
    }
}