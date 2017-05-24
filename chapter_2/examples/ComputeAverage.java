/** This program will find the average of three numbers.*/

import java.util.Scanner;

public class ComputeAverage {
    public static void main(String[] agrs) {
        System.out.print("Enter 3 numbers: ");
        Scanner kb = new Scanner(System.in);
        double firstNum = kb.nextDouble();
        double secondNum = kb.nextDouble();
        double thirdNum = kb.nextDouble();
        double average = (firstNum + secondNum + thirdNum) / 3.0;
        System.out.println("The average is: " + average);


    }
}