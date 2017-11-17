/**
* This program demonstrates the use of variable length argumment lists.
* @author Brian McEntee
*/
public class VarLengthArgs {
    /** Main method. */
    public static void main(String[] args) {
        System.out.println(addNums(1.0, 2.3, 5.6));
        double[] myNumbers = {3.0, 7.0, 22.0, 44.0};
        System.out.println(addNums(myNumbers));

    }

    public static double addNums(double... nums) {
        int sum = 0;

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        return sum;
    }
}