/**
* This program implements and demonstrates both a linear search and binary
* search on an array.
* @author Brian McEntee
*/
public class ArraySearches {
    /** Main method. */
    public static void main(String[] args) {
        //TODO
    }

    /** Search an array linearly for a particular element. */
    public static int linearSearch(int[] nums, int key) {
        int index = -1;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == key) {
                index = i;
            }
        }
        return index;
    }

    /** Search an array for a particular element logarithmically. */
    public static int binarySearch(int[] nums, int key) {
        int low = 0;
        int high = nums.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (key < nums[mid]) {
                high = mid - 1;
            }
            else if (key = nums[mid]) {
                return mid;
            }
            else {
                low = mid + 1;
            }
        }
        return -(low + 1);
    }

}