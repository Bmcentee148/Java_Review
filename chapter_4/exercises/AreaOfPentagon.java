/** Given the length from the center of a pentagon to its vertex, compute the
    area.

    @author Brian McEntee */

import java.util.Scanner;

public class AreaOfPentagon {
    public static void main(String[] args) {

        //Prompt user to enter length from center to a vertex
        System.out.print("Enter the length from center to vertex: ");
        Scanner input = new Scanner(System.in);
        double r = input.nextDouble();

        double s = 2 * r * Math.sin(Math.PI / 5);
        double area = (5 * s * s) / (4 * Math.tan(Math.PI / 5) );

        System.out.printf("%-10s%-10s%-10s%n", "radius", "s", "area");
        System.out.printf("%-10.2f%-10.2f%-10.2f%n", r, s, area);
    }
}