/** Finds and displays the two highest scores and their names from given input

    @author Brian McEntee */

import java.util.Scanner;

public class TwoHighestScores {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int numStudents = input.nextInt();
        System.out.println("Enter each students name then score");

        double firstHighestScore = 0, secondHighestScore = 0;
        String firstHighestName = "", secondHighestName = "";
        for (int i = 0; i < numStudents; i++) {
            String currName = input.next();
            double currScore = input.nextDouble();
            if (currScore > firstHighestScore) {
                secondHighestScore = firstHighestScore;
                firstHighestScore = currScore;
                secondHighestName = firstHighestName;
                firstHighestName = currName;
            }
            else if (currScore > secondHighestScore) {
                secondHighestScore = currScore;
                secondHighestName = currName;
            }
            input.nextLine(); // consume new line
        }

        System.out.printf("%s %.1f%n", firstHighestName, firstHighestScore);
        System.out.printf("%s %.1f%n", secondHighestName, secondHighestScore);
    }
}