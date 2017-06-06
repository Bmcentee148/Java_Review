/** Determine if one rectangle is contained by, overlaps, or has no overlap
    with a second rectangle. 

    @author Brian McEntee */

import java.util.Scanner;

public class TwoRectangles {
    public static void main(String[] args) {

        //Prompt user to enter coordinates, width, and height for the rectangles
        Scanner input = new Scanner(System.in);
        System.out.print("Enter r1's center x-, y-coordinates, " +
            "width, and height: ");
        double r1X = input.nextDouble();
        double r1Y = input.nextDouble();
        double r1Width = input.nextDouble();
        double r1Height = input.nextDouble();
        System.out.print("Enter r2's center x-, y-coordinates, " +
            "width, and height: ");
        double r2X = input.nextDouble();
        double r2Y = input.nextDouble();
        double r2Width = input.nextDouble();
        double r2Height = input.nextDouble();

        //Determine corner points that compose r2's vertices
        double maxX = r2X + r2Width / 2;
        double minX = r2X - r2Width / 2;
        double maxY = r2Y + r2Height / 2;
        double minY = r2Y - r2Height / 2;

        //Find number of r2's vertices that are inside r1
        int numVerticesContained = 0;

        if (pointInRectangle(minX, maxY, r1X, r1Y, r1Width, r1Height)){
            numVerticesContained++; //top left vert contained by r1
        }
        if (pointInRectangle(maxX, maxY, r1X, r1Y, r1Width, r1Height)){
            numVerticesContained++; //top right vert contained by r1
        }
        if (pointInRectangle(maxX, minY, r1X, r1Y, r1Width, r1Height)){
            numVerticesContained++; //bottom right vert contained by r1
        }
        if (pointInRectangle(minX, minY, r1X, r1Y, r1Width, r1Height)){
            numVerticesContained++; //bottom left vert contained by r1
        }

        if(numVerticesContained == 4) { 
            System.out.println("r2 is inside r1");
        }
        else if(0 < numVerticesContained && numVerticesContained < 4) {
            System.out.println("r2 overlaps r1");
        }
        else if(numVerticesContained == 0) {
            System.out.println("r2 does not overlap r1");
        }
    }

    public static boolean pointInRectangle(double pointX, double pointY,
        double centerX, double centerY, double rectWidth, double rectHeight) {

        double maxX = centerX + rectWidth / 2.0;
        double minX = centerX - rectWidth / 2.0;
        double maxY = centerY + rectHeight / 2.0;
        double minY = centerY - rectHeight / 2.0;

        return (minX <= pointX && pointX <= maxX) 
            && (minY <= pointY && pointY <= maxY);
    }
}