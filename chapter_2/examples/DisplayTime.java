import java.util.Scanner;

public class DisplayTime {
    public static void main(String[] args) {

        // Get amount of time in seconds from user
        Scanner kb = new Scanner(System.in);
        System.out.print("Enter an integer for seconds: ");
        int seconds = kb.nextInt();

        //Calculate the number of minutes and remaining seconds
        int minutes = seconds / 60;
        int remainingSeconds = seconds % 60;

        // Display result on the console
        System.out.println(seconds + " seconds is " + minutes 
            + ((minutes > 1) ? " minutes and " : " minute and ")
            + remainingSeconds + " seconds.");
    }
}