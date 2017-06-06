import java.util.Scanner;

public class TwoCircles {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in); 
        System.out.print("Enter circle1's x-, y-coordinates, and radius: ");
        double c1X = input.nextDouble();
        double c1Y = input.nextDouble();
        double r1 = input.nextDouble();
        System.out.print("Enter circle2's x-, y-coordinates, and radius: ");
        double c2X = input.nextDouble();
        double c2Y = input.nextDouble();
        double r2 = input.nextDouble();

        double centerDistance = Math.sqrt(
            Math.pow(c1X - c2X, 2) + Math.pow(c1Y - c2Y, 2));

        if(centerDistance + r2 < r1) {
            System.out.println("circle2 is inside circle1");
        }
        else if(centerDistance < r1 + r2) {
            System.out.println("circle2 overlaps circle1");
        }
        else {
            System.out.println("circle2 does not overlap circle1");
        }

    }
}