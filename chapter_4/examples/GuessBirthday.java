/** Guess the user's birthday asking only 5 questions

    @author Brian McEntee
    @version 0.0 */

import java.util.Scanner;

public class GuessBirthday {
    public static void main(String[] args) {

        //Create the 5 sets of numbers that will be presented
        String s1 = " 1  3  5  7\n" + 
                    " 9 11 13 15\n" +
                    "17 19 21 23\n" +
                    "25 27 29 31";
        
        String s2 = " 2  3  6  7\n" +
                    "10 11 14 15\n" +
                    "18 19 22 23\n" +
                    "26 27 30 31";
        
        String s3 = " 4  5  6  7\n" +
                    "12 13 14 15\n" +
                    "20 21 22 23\n" +
                    "28 29 30 31";
        
        String s4 = " 8  9 10 11\n" +
                    "12 13 14 15\n" +
                    "20 21 22 23\n" +
                    "28 29 30 31";
        
        String s5 = "16 17 18 19\n" +
                    "20 21 22 23\n" +
                    "24 25 26 27\n" +
                    "28 29 30 31";

        String[] dayNumbers = {       
            "1st",
            "2nd",
            "3rd",
            "4th",
            "5th",
            "6th",
            "7th",
            "8th",
            "9th",
            "10th",
            "11th",
            "12th",
            "13th",
            "14th",
            "15th",
            "16th",
            "17th",
            "18th",
            "19th",
            "20th",
            "21st",
            "22nd",
            "23rd",
            "24th",
            "25th",
            "26th",
            "27th",
            "28th",
            "29th",
            "30th",
            "31st"
        };

        Scanner input = new Scanner(System.in);
        int day = 0;

        System.out.println("Is your birthday in set 1?");
        System.out.println(s1);
        System.out.print("Enter 0 for No or 1 for Yes: ");
        if(input.nextInt() == 1) day += 1;

        System.out.println("Is your birthday in set 2?");
        System.out.println(s2);
        System.out.print("Enter 0 for No or 1 for Yes: ");
        if(input.nextInt() == 1) day += 2;

        System.out.println("Is your birthday in set 3?");
        System.out.println(s3);
        System.out.print("Enter 0 for No or 1 for Yes: ");
        if(input.nextInt() == 1) day += 4;

        System.out.println("Is your birthday in set 4?");
        System.out.println(s4);
        System.out.print("Enter 0 for No or 1 for Yes: ");
        if(input.nextInt() == 1) day += 8;

        System.out.println("Is your birthday in set 5?");
        System.out.println(s5);
        System.out.print("Enter 0 for No or 1 for Yes: ");
        if(input.nextInt() == 1) day += 16;

        System.out.println("I bet your birthday is on the " 
            + dayNumbers[day - 1]);


    }
}