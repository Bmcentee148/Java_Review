public class ArraySearchesV2 {
    /** Main method. */
    public static void main(String[] args) {
        // Test linear search method
        int[] unsortedNums = {3, 1, 9, 2, 44, 109, 432, 12, 6, 101};
        System.out.println(linearSearch(unsortedNums, 109)); // 5
        System.out.println(linearSearch(unsortedNums, 99)); // -1
        System.out.println(linearSearch(new int[]{0, -1, 33, 4}, -1)); // 1

        // Test binary search method
        int[] sortedNums = {2, 3, 11, 26, 56, 199, 201};
        System.out.println(binarySearch(sortedNums, 7));
        System.out.println(binarySearch(sortedNums, 333));

    }

    /** Linear search method. Best for small and/or unsorted collections. */
    public static int linearSearch(int[] list, int key) {
        for (int i = 0; i < list.length; i++) {
            if (list[i] == key) {
                return i;
            }
        }
        return -1; // key not found in list
    }

    /** Binary search method. Collection must be previously sorted. */
    public static int binarySearch(int[] list, int key) {
        int low = 0, high = list.length - 1;

        while (high >= low) {
            int mid = (high - low) / 2 + low;
            if (key < list[mid]) {
                high = mid - 1;
            }
            else if (key == list[mid]) {
                return mid;
            }
            else {
                low = mid + 1;
            }
        }
        return -(low + 1); // key not found, hint at insertion point
    }
}