/** This will compute the area of a circle given a radius.
    @author Brian McEntee
    @date   5.17.17 */
import java.util.Scanner;

public class ComputeArea {
    public static void main(String[] agrs) {
        System.out.print("Enter the radius: ");
        Scanner kb = new Scanner(System.in);
        double radius = kb.nextDouble();
        double area = Math.pow(radius,2) * Math.PI;
        System.out.println("The area of a circle with radius " + radius 
            + " is " + area);
    }
}