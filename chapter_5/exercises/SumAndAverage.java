/** Find the sum and average for an unknown number of integers

    @author Brian McEntee */

import java.util.Scanner;

public class SumAndAverage {
    /** Main method */
    public static void main(String[] args) {
        int sum = 0;
        int numIntegers = 0; //for computing the average
        int numPositive = 0; //keeps track of positive integers
        int numNegative = 0; //keeps track of negative integers

        System.out.print("Enter integers, input ends with 0: ");
        Scanner input = new Scanner (System.in);
        int number = input.nextInt();
        while (number != 0) {
            if (number > 0) {
                numPositive++;
            }
            else { //number is negative
                numNegative++;
            }
            sum += number;
            numIntegers++;
            number = input.nextInt();
        }

        if (numIntegers > 0) {
            double average = (double)sum / numIntegers;
            System.out.printf("The number of positives is %d%n", numPositive);
            System.out.printf("The number of negatives is %d%n", numNegative);
            System.out.printf("The total is %d%n", sum);
            System.out.printf("The average is %.2f%n", average);
        }
        else { //no input received
            System.out.println("No numbers entered except zero");
        }
    }
}