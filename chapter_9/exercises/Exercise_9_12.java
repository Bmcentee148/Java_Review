import java.util.Scanner;

/** Demo program for LinearEquation class. */
public class Exercise_9_12 {
    /** Main method. */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print(
            "Enter endpoint coordinates for first line (x1 y1 x2 y2): ");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        System.out.print(
            "Enter endpoint coordinates for first line (x3 y3 x4 y4): ");
        double x3 = input.nextDouble();
        double y3 = input.nextDouble();
        double x4 = input.nextDouble();
        double y4 = input.nextDouble();

        double a = y1 - y2;
        double b = x2 - x1;
        double e = (y1 - y2) * x1 - (x1 - x2) * y1;
        double c = y3 - y4;
        double d = x4 - x3;
        double f = (y3 - y4) * x3 - (x3 - x4) * y3;
        LinearEquation eq = new LinearEquation(a, b, c, d, e, f);

        if (eq.isSolvable()) {
            System.out.println("x = " + eq.getX());
            System.out.println("y = " + eq.getY());
        }
        else {
            System.out.println("The equation has no solution.");
        }

        LinearEquation testEq = new LinearEquation(9, 4, 3, -5, -6, -21);
        System.out.println(testEq.getX());
        System.out.println(testEq.getY());

    }
}