import java.util.Scanner;

public class GetDigits {
    public static void main(String[] args) {

        //Prompt user to enter an integer
        System.out.print("Enter an integer: ");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        //Determine number of digits the number contains
        int numDigits = String.valueOf(number).length();

        //Extract each digit and store in an array
        int[] digits = new int[numDigits];
        for(int i = 0; i < numDigits; i++) {
            digits[i] = number % 10;
            number /= 10;
        }

        //Reverse contents of digits array to match number
        for(int i = 0; i <= (digits.length - 1) / 2; i++) {
            int backIndex = digits.length - (1 + i);
            int frontIndex = i;
            if(frontIndex != backIndex) {
                int frontDigit = digits[frontIndex];
                digits[frontIndex] = digits[backIndex];
                digits[backIndex] = frontDigit;
            } else {
                //at digit in middle so no need for a swap
            }
        }

        for(int i = 0; i < digits.length; i++) {
            System.out.println(digits[i]);
        }
        
    }
}