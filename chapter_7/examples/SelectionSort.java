import java.util.Arrays;
/**
* This program implements and demonstrates the selection sort algorithm.
* @author Brian McEntee
*/
public class SelectionSort {
    /** Main method. */
    public static void main(String[] args) {
        int[] nums = {3, 2, 10, 1, 4, 6};
        selectionSort(nums);
        System.out.println(Arrays.toString(nums));
    }

    /** Selection sort algorithm. */
    public static void selectionSort(int[] list) {
        for (int i = 0; i < list.length - 1; i++) {
            int minValue = list[i];
            int minIndex = i;
            for (int j = i + 1; j < list.length; j++) {
                if (list[j] < minValue) {
                    minValue = list[j];
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                list[minIndex] = list[i];
                list[i] = minValue;
            }
        }
    }
}