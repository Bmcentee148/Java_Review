import java.util.Arrays;
/**
* Array processing practice
*/
public class ArrayProcessing {
    /** Main method. */
    public static void main(String[] args) {
        double[] numList = {2.4, 4.3, 98.6, 11.0, 98.6, 0.0, 12.3};
        System.out.println(findMinimum(numList)); // 0.0
        System.out.println(findMaximum(numList)); // 98.6
        System.out.println(findIndexOfMax(numList)); // 2
        shuffle(numList);
        System.out.println(Arrays.toString(numList));
        System.out.println(sumElements(numList));
        for (int i = 0; i < 15; i++) {
            System.out.print(getRandomElement(numList) + " ");
        }
    }

    public static double findMinimum(double[] nums) {
        double min = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < min) {
                min = nums[i];
            }
        }
        return min;
    }

    public static double findMaximum(double[] nums) {
        double max = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
            }
        }
        return max;
    }

    public static int findIndexOfMax(double[] nums) {
        double max = nums[0];
        int index = 0;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
                index = i;
            }
        }
        return index;
    }

    public static void shuffle(double[] nums) {
        for (int i = nums.length - 1; i > 0; i--) {
            // generate random index s.t. 0 <= j <= i
            int j = (int)(Math.random() * (i + 1));
            // swap nums[i] with nums[j]
            double temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }
    }

    public static double sumElements(double[] nums) {
        double sum = 0;
        for (double x : nums) {
            sum += x;
        }
        return sum;
    }

    public static double getRandomElement(double[] nums) {
        return nums[(int)(Math.random() * nums.length)];
    }
}