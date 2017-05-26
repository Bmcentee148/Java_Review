/** This finds the sum of all digits that compose an integer between 0 and 1000
    
    @author Brian McEntee */

import java.util.Scanner;

public class SumOfDigits {
    
    public static void main(String[] args) {

        //Prompt user to enter the integer to compute sum of
        System.out.print("Enter an integer 0 - 1000 (exclusive): ");
        Scanner kb = new Scanner(System.in);
        int originalInteger = kb.nextInt();
        int integer = originalInteger; 

        //Compute the sum of the specified integer
        int sum = 0;
        sum += integer % 10;    //add rightmost digit to sum
        integer /= 10;          //remove rightmost digit
        sum += integer % 10;    //add rightmost digit to sum
        integer /= 10;          //remove rightmost digit
        sum += integer % 10;    //add last possible digit to sum

        //Display resulting sum on the console
        System.out.println("The sum of the digits in " + originalInteger 
            + " is " + sum + ".");

    }//end main
}//end SumOfDigits