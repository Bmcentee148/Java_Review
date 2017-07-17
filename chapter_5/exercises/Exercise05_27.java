/** Find all the leap years from year 101 A.D. to 2100 A.D.

    @author Brian McEntee */
import java.util.Scanner;

public class Exercise05_27 {
    /** Main method */
    public static void main(String[] args) {
        final int START_YEAR = 101;
        final int END_YEAR = 2100;
        int count = 0; // the numbers of leap years found
        
        for (int year = START_YEAR; year <= END_YEAR; year++) {
            boolean isLeapYear = 
                (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
            if (isLeapYear) {
                count++;
                if (count % 10 == 0)
                    System.out.println(year);
                else
                    System.out.print(year + " ");
            }
        }
    }
}