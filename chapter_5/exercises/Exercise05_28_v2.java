/** Determine the weekday of the first of each month for a given year
    
    @author Brian McEntee */

import java.util.Scanner;

public class Exercise05_28_v2 {
    /** Main method */
    public static void main(String[] args) {
        final int JANUARY = 0;
        final int FEBRUARY = 1;
        final int MARCH = 2;
        final int APRIL = 3;
        final int MAY = 4;
        final int JUNE = 5;
        final int JULY = 6;
        final int AUGUST = 7;
        final int SEPTEMBER = 8;
        final int OCTOBER = 9;
        final int NOVEMBER = 10;
        final int DECEMBER = 11;

        final int SUNDAY = 0;
        final int MONDAY = 1;
        final int TUESDAY = 2;
        final int WEDNESDAY = 3;
        final int THURSDAY = 4;
        final int FRIDAY = 5;
        final int SATURDAY = 6;


        Scanner input = new Scanner(System.in);
        // Prompt user to enter year and first weekday
        System.out.print("Enter the year: ");
        int year = input.nextInt();
        System.out.print("Enter the first weekday: ");
        int firstWeekday = input.nextInt();

        // Determine the number of days in month of February
        boolean isLeapYear = 
            (year % 4 == 0 && year % 10 != 0) || (year % 400 == 0);
        int daysInFeb = isLeapYear ? 29 : 28;

        for(int month = JANUARY; month <= DECEMBER; month++) {
            int numDaysInMonth = 0;
            String dayName = "";
            switch (month) {
                case JANUARY :
                    System.out.print("January 1, " + year + " is a ");
                    numDaysInMonth = 31;
                    break;
                case FEBRUARY :
                    System.out.print("February 1, " + year + " is a ");
                    numDaysInMonth = daysInFeb;
                    break;
                case MARCH :
                    System.out.print("March 1, " + year + " is a ");
                    numDaysInMonth = 31;
                    break;
                case APRIL :
                    System.out.print("April 1, " + year + " is a ");
                    numDaysInMonth = 30;
                    break;
                case MAY :
                    System.out.print("May 1, " + year + " is a ");
                    numDaysInMonth = 31;
                    break;
                case JUNE :
                    System.out.print("June 1, " + year + " is a ");
                    numDaysInMonth = 30;
                    break;
                case JULY :
                    System.out.print("July 1, " + year + " is a ");
                    numDaysInMonth = 31;
                    break;
                case AUGUST :
                    System.out.print("August 1, " + year + " is a ");
                    numDaysInMonth = 31;
                    break;
                case SEPTEMBER :
                    System.out.print("September 1, " + year + " is a ");
                    numDaysInMonth = 30;
                    break;
                case OCTOBER :
                    System.out.print("October 1, " + year + " is a ");
                    numDaysInMonth = 31;
                    break;
                case NOVEMBER :
                    System.out.print("November 1, " + year + " is a ");
                    numDaysInMonth = 30;
                    break;
                case DECEMBER :
                    System.out.print("December 1, " + year + " is a ");
                    numDaysInMonth = 31;
                    break;
            }

            switch (firstWeekday) {
                case SUNDAY :
                    dayName = "Sunday";
                    break;
                case MONDAY : 
                    dayName = "Monday";
                    break;
                case TUESDAY : 
                    dayName = "Tuesday";
                    break;
                case WEDNESDAY : 
                    dayName = "Wednesday";
                    break;
                case THURSDAY : 
                    dayName = "Thursday";
                    break;
                case FRIDAY : 
                    dayName = "Friday";
                    break;
                case SATURDAY : 
                    dayName = "Saturday";
                    break;
            }

            System.out.println(dayName);

            firstWeekday = (firstWeekday + numDaysInMonth) % 7;
        } 
    }
}