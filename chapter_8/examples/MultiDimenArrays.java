import java.util.Arrays;
/**
* This program will demonstrate the use of multi-dimensional arrays.
* @author Brian McEntee
*/
public class MultiDimenArrays {
    /** Main method. */
    public static void main(String[] args) {
        int[][] myArray = { {1, 2, 3},
                            {4, 5, 6},
                            {7, 8, 9} };

        int[][] raggedArray = { {1} ,
                                {1, 2},
                                {1, 2, 3} };

        System.out.println(arraySum(myArray));
        System.out.println(Arrays.toString(rowSum(myArray)));
        System.out.println(Arrays.toString(colSum(myArray)));
        System.out.println(isRagged(myArray));
        System.out.println(isRagged(raggedArray));
        System.out.println(Arrays.toString(myArray[0]));
    }

    /** Sums all the elements in a 2D array. */
    public static int arraySum(int[][] nums) {
        int sum = 0;
        for (int row = 0; row < nums.length; row++) {
            for (int col = 0; col < nums[row].length; col++) {
                sum += nums[row][col];
            }
        }
        return sum;
    }

    /** Sum the elements of each individual row in a 2D array. */
    public static int[] rowSum(int[][] nums) {
        int[] totals = new int[nums.length];
        for (int row = 0; row < nums.length; row++) {
            int sum = 0;
            for (int col = 0; col < nums[row].length; col++) {
                sum += nums[row][col];
            }
            totals[row] = sum;
        }
        return totals;
    }

    /** Sum the elements of each individual column in a 2D array. */
    public static int[] colSum(int[][] nums) {
        int[] totals = new int[nums[0].length];
        for (int col = 0; col < nums[0].length; col++) {
            int sum = 0;
            for (int row = 0; row < nums.length; row++) {
                sum += nums[row][col];
            }
            totals[col] = sum;
        }
        return totals;
    }

    /** Determines each row in array has the same number of columns. */
    public static boolean isRagged(int[][] nums) {
        boolean isRagged = false;
        int numCols = nums[0].length;
        for (int row = 1; row < nums.length; row++) {
            if (nums[row].length != numCols) {
                isRagged = true;
                break;
            }
        }
        return isRagged;
    }
}