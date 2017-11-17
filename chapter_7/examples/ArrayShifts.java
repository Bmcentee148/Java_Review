import java.util.Arrays;
/**
* Practice shifting elements of array both left and right
*/
public class ArrayShifts {
    /** Main method. */
    public static void main(String[] args) {
        int[] nums = new int[10];
        for (int i = 0; i < 10; i++) {
            nums[i] = i + 1;
        }
        System.out.println(Arrays.toString(nums));

        // Shift elements of array left, moving first element to last position
        int firstElement = nums[0];
        for (int i = 1; i < nums.length; i++) {
            nums[i - 1] = nums[i];
        }
        nums[nums.length - 1] = firstElement;
        System.out.println(Arrays.toString(nums));

        // Shift elements of array right, moving last element to first position
        int lastElement = nums[nums.length - 1];
        for (int i = nums.length - 2; i >= 0; i--) {
            nums[i + 1] = nums[i];
        }
        nums[0] = lastElement;
        System.out.println(Arrays.toString(nums));
    }
}