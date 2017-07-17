/** Find all numbers from 100 to 1000 that are divisible by 5 or 6 but not both

    @author Brian McEntee */

public class Exercise05_11 {
    /** Main method */
    public static void main(String[] args) {
        int count = 0; //number of digits found divisible by 5 or 6 but not both
        for (int i = 100; i <= 1000; i++) {
            if (i % 5 == 0 ^ i % 6 == 0) {
                count++;
                if (count % 10 == 0) { // 10th digit on current line reached
                    System.out.println(i);
                }
                else {
                    System.out.print(i + " ");
                }
            }
        }
    }
}