/** Given 3 points p1, p2, and p3 to form a triangle, this finds the size of
    each of the three angles.

    formulas :
        A = acos((a^2 - b^2 - c^2) / (-2 * b * c))
        B = acos((b^2 - a^2 - c^2) / (-2 * a * c))
        C = acos((c^2 - b^2 - a^2) / (-2 * a * b))

    @author Brian McEntee */

import java.util.Scanner;

public class ComputeAngles {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter three points: ");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        double x3 = input.nextDouble();
        double y3 = input.nextDouble();

        //Compute length of each side a, b, and c
        double a = Math.sqrt(Math.pow(x2 - x3, 2) + Math.pow(y2 - y3, 2));
        double b = Math.sqrt(Math.pow(x1 - x3, 2) + Math.pow(y1 - y3, 2));
        double c = Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));

        //Use given formulas to find angles A, B, and C
        double angleA = Math.toDegrees(
            Math.acos( (a * a - b * b - c * c) / (-2 * b * c) ) );
        double angleB = Math.toDegrees(
            Math.acos( (b * b - a * a - c * c) / (-2 * a * c) ) );
        double angleC = Math.toDegrees(
            Math.acos( (c * c - b * b - a * a) / (-2 * a * b) ) );

        System.out.println("Angle A: " + (int)(angleA * 100) / 100.0);
        System.out.println("Angle B: " + (int)(angleB * 100) / 100.0);
        System.out.println("Angle C: " + (int)(angleC * 100) / 100.0);

    }
}
