import java.util.Scanner;

public class ComputeAreaWithConstant {
    public static void main(String[] args) {
        
        final double PI = 3.14159; //define a constant for pi

        // Get radius of the circle from user
        System.out.print("Please enter the radius: ");
        Scanner kb = new Scanner(System.in);
        double radius = kb.nextDouble();

        // Calculate area and display results
        double area = radius * radius * PI;
        System.out.println("A circle with radius " + radius
            + " has an area of " + area); 

    }
}