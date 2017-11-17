import java.util.Arrays;
import java.util.Scanner;

/**
* This program will read in 100 numbers, find their average, and then determine
* how many items are above the average.
* @author Brian McEntee 
*/
public class AnalyzeNumbers {
    /** Main method. */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of items: ");
        int numItems = input.nextInt();
        double[] numbers = readInNumbers(numItems);
        System.out.println(Arrays.toString(numbers)); //DEBUGGING
        double average = getAverage(numbers);
        int numAboveAverage = getNumItemsAboveAverage(numbers);
        System.out.println("The average of these numbers is " + average
            + " and the number of items above that average is " 
            + numAboveAverage);

    }

    /** Read in a predetermined amount of numbers. */
    public static double[] readInNumbers(int numItems) {
        double[] nums = new double[numItems];
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < numItems; i++) {
            nums[i] = input.nextDouble();
        }
        return nums;
    }

    public static double getAverage(double[] nums) {
        double sum = 0.0;
        for (double item : nums) {
            sum += item;
        }
        return sum / nums.length;
    }

    public static int getNumItemsAboveAverage(double[] nums) {
        int count = 0;
        double average = getAverage(nums);
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > average) {
                count++;
            }
        }
        return count;
    }
}