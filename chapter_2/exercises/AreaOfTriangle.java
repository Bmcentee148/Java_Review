/** Given three sets of coordinates for the vertices of a triangle, this
    will compute its area.

    @author Brian McEntee */

import java.util.Scanner;

public class AreaOfTriangle {
    public static void main(String[] args) {

        //Prompt user to enter coordinates of vertices
        System.out.print("Enter three points for a triangle: ");
        Scanner kb = new Scanner(System.in);
        double x1 = kb.nextDouble();
        double y1 = kb.nextDouble();
        double x2 = kb.nextDouble();
        double y2 = kb.nextDouble();
        double x3 = kb.nextDouble();
        double y3 = kb.nextDouble();

        //Compute length of each side
        double s1 = Math.sqrt(Math.pow((x1 - x2), 2) + Math.pow((y1 - y2), 2));
        double s2 = Math.sqrt(Math.pow((x1 - x3), 2) + Math.pow((y1 - y3), 2));
        double s3 = Math.sqrt(Math.pow((x2 - x3), 2) + Math.pow((y2 - y3), 2));

        //Compute area of triangle with given formula
        double s = (s1 + s2 + s3) / 2.0;
        double area = Math.sqrt(s * (s - s1) * (s - s2) * (s - s3));

        //Display resulting area on the console
        System.out.println(s1 + " " + s2 + " " + s3);
        System.out.println("The area of the triangle is " 
            + (int)(area * 10) / 10.0);

    }
}