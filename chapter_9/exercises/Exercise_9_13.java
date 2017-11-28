import java.util.Scanner;
import java.util.Arrays;
public class Exercise_9_13 {
    /** Main method. */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of rows and columns in the array: ");
        int numRows = input.nextInt();
        int numCols = input.nextInt();
        double[][] inputArray = getArrayFromInput(numRows, numCols);
        Location largestElement = locateLargest(inputArray);
        System.out.println(largestElement);
    }

    /** Find the location of the maximum value in a 2-dimensional array. */
    public static Location locateLargest(double[][] a) {
        int maxRow = 0, maxCol = 0;
        double maxValue = a[0][0];
        for (int row = 0; row < a.length; row++) {
            for (int col = 0; col < a[row].length; col++) {
                if (a[row][col] > maxValue) {
                    maxValue = a[row][col];
                    maxRow = row;
                    maxCol = col;
                }
            }
        }
        return new Location(maxRow, maxCol, maxValue);
    }// end locateLargest

    /** Get the array from user input. */
    public static double[][] getArrayFromInput(int numRows, int numCols) {
        Scanner input = new Scanner(System.in);
        double[][] a = new double[numRows][numCols];

        for (int row = 0; row < numRows; row++) {
            for (int col = 0; col < numCols; col++) {
                a[row][col] = input.nextDouble();
            }
        }
        return a;
    }// end getArrayAsInput
}