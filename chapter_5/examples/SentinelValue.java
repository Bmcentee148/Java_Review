import java.util.Scanner;

public class SentinelValue {
    /** Main Method */
    public static void main(String[] args) {
        //Create a scanner
        Scanner input = new Scanner(System.in);

        //Read an initial data
        System.out.print(
            "Enter an integer (input ends if it is 0): ");
        int data = input.nextInt();

        //Keep reading input until the input is 0
        int sum = 0;
        while(data != 0) {
            sum += data;

            //Read the next data
            System.out.print("Enter an integer (input ends if it is 0): ");
            data = input.nextInt();
        }

        System.out.println("The sum is " + sum);
    }
}