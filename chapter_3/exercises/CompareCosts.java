/** Compares cost for two different packages of food given weight and price.

    @author Brian McEntee */

import java.util.Scanner;

public class CompareCosts {
    public static void main(String[] args) {

        //Prompt user to enter weight and costs for each package
        Scanner input = new Scanner(System.in);
        System.out.print("Enter weight and price for package 1: ");
        double weight1 = input.nextDouble();
        double price1 = input.nextDouble();
        System.out.print("Enter weight and price for package 2: ");
        double weight2 = input.nextDouble();
        double price2 = input.nextDouble();

        double pricePerUnit1 = price1 / weight1;
        double pricePerUnit2 = price2 / weight2;

        final double EPSILON = 10E-4;

        if( Math.abs(pricePerUnit1 - pricePerUnit2) < EPSILON) {
            System.out.println("Both packages have the same price");
        }
        else if(pricePerUnit1 < pricePerUnit2) {
            System.out.println("Package 1 has better price");
        }
        else if(pricePerUnit2 < pricePerUnit1) {
            System.out.println("Package 2 has better price");
        }
    }
}