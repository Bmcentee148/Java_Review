import java.util.Scanner;

public class PointInCircle {
    public static void main(String[] args) {
        final double CIRCLE_RADIUS = 10;
        //Prompt user to enter coordinates for point x y
        System.out.print("Enter a point with two coordinates: ");
        Scanner input = new Scanner(System.in);
        double xCoordinate = input.nextInt();
        double yCoordinate = input.nextInt();

        double distanceFromOrigin = Math.sqrt(
            Math.pow(xCoordinate,2) + Math.pow(yCoordinate,2));

        if(distanceFromOrigin < CIRCLE_RADIUS) {
            System.out.println("Point (" + xCoordinate + ", " + yCoordinate +
                ") is in the circle");
        }
        else {
            System.out.println("Point (" + xCoordinate + ", " + yCoordinate +
                ") is not in the circle");
        }
    }
}