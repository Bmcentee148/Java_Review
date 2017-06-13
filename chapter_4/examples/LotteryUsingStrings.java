/** A lottery game that has the user guess two digits that were chosen at random
    
    @author Brian McEntee */

import java.util.Scanner;

public class LotteryUsingStrings {
    public static void main(String[] args) {

        //Generate random digits
        String lotteryNumbers = "" + (int)(Math.random() * 10) + 
            (int)(Math.random() * 10);

        System.out.println("The lottery numbers are " + lotteryNumbers);

        //Prompt user to choose their own numbers
        System.out.print("Enter two digits: ");
        Scanner input = new Scanner(System.in);
        String chosenNumbers = input.nextLine().trim();
        
        //Check input for validity and terminate program if necessary
        if(chosenNumbers.length() != 2) {
            System.out.println("Error: You must enter exactly two digits "
                + "without spaces");
            System.exit(1);
        }

        //Determine amount user has won and display results on the console
        char lotteryNum1 = lotteryNumbers.charAt(0);        
        char lotteryNum2 = lotteryNumbers.charAt(1);
        char chosenNum1 = chosenNumbers.charAt(0);
        char chosenNum2 = chosenNumbers.charAt(1);
        if(chosenNumbers.equals(lotteryNumbers)) {
            System.out.println("Exact match: You win $10,000");
        }
        else if(lotteryNum2 == chosenNum1
            && lotteryNum1 == chosenNum2) {
            
            System.out.println("Match all digits: You win $3,000");
        }
        else if(lotteryNumbers.contains(String.valueOf(chosenNum1)) 
            || lotteryNumbers.contains(String.valueOf(chosenNum2))) {
            
            System.out.println("Match one digit: You win $1,000");
        }
        else {
            System.out.println("Sorry, you didn't win anything this time.");
        }
    }
}