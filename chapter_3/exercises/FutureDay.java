import java.util.Scanner;

public class FutureDay {
    public static void main(String[] args) {

        //Prompt user to enter current day number and number of elapsed days
        Scanner input = new Scanner(System.in);
        System.out.print("Enter current day number: ");
        int currentDayNumber = input.nextInt();
        System.out.print("Enter the number of days elapsed since today: ");
        int numberElapsedDays = input.nextInt();

        //Compute future day number
        int futureDayNumber = (currentDayNumber + numberElapsedDays) % 7;

        //Print results to the console
        System.out.println("Today is " + getDayName(currentDayNumber) + 
            " and the future day is " + getDayName(futureDayNumber));

    }

    public static String getDayName(int dayNumber) {
        String dayName = "";
        switch(dayNumber) {
            case 0:
                dayName = "Sunday";
                break;
            case 1:
                dayName = "Monday";
                break;
            case 2:
                dayName = "Tuesday";
                break;
            case 3:
                dayName = "Wednesday";
                break;
            case 4:
                dayName = "Thursday";
                break;
            case 5:
                dayName = "Friday";
                break;
            case 6:
                dayName = "Saturday";
                break;
        }
        return dayName;
    }
}