/** Find the first days of each month given the year and first day of the year

    @author Brian McEntee */
import java.util.Scanner;
public class Exercise05_28 {
    /** Main method */
    public static void main(String[] args) {
        String[] dayNames = {
            "Sunday", 
            "Monday", 
            "Tuesday", 
            "Wednesday", 
            "Thursday", 
            "Friday", 
            "Saturday"
        };
        String[] monthNames = {
            "January",
            "February",
            "March",
            "April",
            "May",
            "June",
            "July",
            "August",
            "September",
            "October",
            "November",
            "December"
        };

        // Prompt user to enter year and day
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the year: ");
        int year = input.nextInt();
        System.out.print("Enter the week day of the first day of the year: ");
        int firstDay = input.nextInt();

        // Determine if it is a leap year or not
        boolean isLeapYear = 
            (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);

        // Find first days of each month in the given year
        int month = 0;
        for (int monthIndex = 0; monthIndex <= 11; monthIndex++) {
            System.out.println(
                monthNames[monthIndex] + " 1, " + year +
                " is a " + dayNames[firstDay]);
            if (month == 3 || month == 5 || month == 8 || month == 10) {
                firstDay = (firstDay + 30) % 7;
            }
            else if (month == 1) {
                int daysInFeb = isLeapYear ? 29 : 28; 
            }
            else {
                firstDay = (firstDay + 31) % 7;
            }
        }
    }
}