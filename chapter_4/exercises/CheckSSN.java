/** Determine whether or not a given Social Security Number is valid

    Valid SSN: ###-##-####

    @author Brian McEntee */
import java.util.Scanner;
public class CheckSSN {
    public static void main(String[] args) {
        //Prompt user to enter social security number
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a social security number: ");
        String ssn = input.nextLine().trim();

        if (ssn.length() == 11
            && Character.isDigit(ssn.charAt(0))
            && Character.isDigit(ssn.charAt(1))
            && Character.isDigit(ssn.charAt(2))
            && ssn.charAt(3) == '-'
            && Character.isDigit(ssn.charAt(4))
            && Character.isDigit(ssn.charAt(5))
            && ssn.charAt(6) == '-'
            && Character.isDigit(ssn.charAt(7))
            && Character.isDigit(ssn.charAt(8))
            && Character.isDigit(ssn.charAt(9))
            && Character.isDigit(ssn.charAt(10))) {
            System.out.println(ssn + " is a valid social security number");
        }
        else {
            System.out.println(ssn + " is an invalid social security number");
        }
    }
}