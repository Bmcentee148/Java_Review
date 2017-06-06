import java.util.Scanner;

public class PointInRectangle {
    public static void main(String[] args) {
        //Declared contstants
        final double WIDTH = 10;
        final double HEIGHT = 5;
        final double CENTER_X = -5;
        final double CENTER_Y = -5;

        //Prompt user to enter coordinates for a point
        System.out.print("Enter a point with two coordinates: ");
        Scanner input = new Scanner(System.in);
        double xCoordinate = input.nextInt();
        double yCoordinate = input.nextInt();

        double minX = CENTER_X - WIDTH / 2;
        double maxX = CENTER_X + WIDTH / 2;
        double minY = CENTER_Y - HEIGHT / 2;
        double maxY = CENTER_Y + HEIGHT / 2;

        boolean pointInside = (yCoordinate > minY && yCoordinate < maxY)
            && (xCoordinate > minX && xCoordinate < maxX);

        System.out.println("Point (" + xCoordinate + ", " + yCoordinate 
            + ") is" + (pointInside ? " inside " : " not inside ")
            + "the rectangle.");


    }
}