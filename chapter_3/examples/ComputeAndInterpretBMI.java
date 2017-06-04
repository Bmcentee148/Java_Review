/** Calculates and interprets BMI based on user's weight and height

    @author Brian McEntee */

import java.util.Scanner;

public class ComputeAndInterpretBMI {
    public static void main(String[] args) {
        //Declared constants for conversions
        final double KILOGRAMS_PER_POUND = .45359237;
        final double METERS_PER_INCH = .0254;

        //Prompt user to enter weight in pounds and height in inches
        System.out.print("Enter weight in pounds: ");
        Scanner kb = new Scanner(System.in);
        double weightInPounds = kb.nextDouble();
        System.out.print("Enter height in inches: ");
        double heightInInches = kb.nextDouble();

        //Convert pounds to kilograms and inches to meters
        double weightInKilograms = 
            weightInPounds * KILOGRAMS_PER_POUND;
        double heightInMeters = 
            heightInInches * METERS_PER_INCH;

        double bmi = calculateBMI(weightInKilograms, heightInMeters);
        String interpretation = interpretBMI(bmi);

        System.out.println("Body Mass Index (BMI): " + bmi);
        System.out.println("Interpretation: " + interpretation);
    }

    /** Calculates body mass index.
        @param weight weight in kilograms
        @param height height in inches
        @return the body mass index */
    public static double calculateBMI(double weight, double height) {
        return weight / Math.pow(height, 2);
    }

    /** Interprets the meaning of a specific body mass index.
        @param bmi a body mass index
        @return the meaning of the given bmi */
    public static String interpretBMI(double bmi) {
        String result;

        if (bmi >= 30){
            result = "obese";
        }
        else if (bmi >= 25.0) {
            result = "overweight";
        }
        else if (bmi >= 18.5) {
            result = "normal";
        }
        else {
            result = "underweight";
        }

        return result;
    }
}