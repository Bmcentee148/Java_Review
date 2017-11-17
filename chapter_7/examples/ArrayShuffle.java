import java.util.Arrays;
/**
* This shows how to shuffle the elements of an array.
*/
public class ArrayShuffle {
    /** Main method. */
    public static void main(String[] args) {
        
        // Create and initialize array with sequential digit values
        int[] nums = new int[10];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = i + 1;
        }
        System.out.println(Arrays.toString(nums));

        // Shuffle elements of array
        for (int i = nums.length - 1; i > 0; i--) {
            // Generate random index j such that 0 <= j <= i
            int j = (int)(Math.random() * (i + 1));
            
            // Swap nums[i] with nums[j]
            int tempElement = nums[j];
            nums[j] = nums[i];
            nums[i] = tempElement;
        }
        System.out.println(Arrays.toString(nums));
    }
}