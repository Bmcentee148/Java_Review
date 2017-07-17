/** Display the 16 bits that compose a given short type (16 bit) integer

    @author Brian McEntee */
import java.util.Scanner;

public class Exercise05_44 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a short integer: ");
        short digit = input.nextShort();

        System.out.print("The bits are ");
        int bitMask = 1; // 0000 0000 0000 0001
        // for each bit, shift it to last position and determine if 0 or 1
        for (int shiftAmount = 15; shiftAmount >= 0; shiftAmount--) {
            int temp = digit >> shiftAmount; 
            // bit is either 0 or 1 depending on last bit in current temp
            int bit = temp & bitMask; 
            System.out.print(bit);
        }
        System.out.println();
    }
}