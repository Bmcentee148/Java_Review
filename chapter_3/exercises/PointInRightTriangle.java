import java.util.Scanner;

public class PointInRightTriangle {
    public static void main(String[] args) {

        //Get coordinates of point in question
        System.out.print("Enter the coordinates of the point: ");
        Scanner input = new Scanner(System.in);
        double x = input.nextDouble();
        double y = input.nextDouble();

        boolean isInside = false;

        if((0 < x) && (x < 200)) {
            double maxY = (-1 / 2.0) * x + 100;
            if((0 < y) && (y < maxY)) {
                isInside = true;
            }
        }
        System.out.println(isInside);

        System.out.println("Point (" + x + ", " + y
            + ") " + (isInside ? "is " : "is not ")
            + "inside the right triangle");
    }
}