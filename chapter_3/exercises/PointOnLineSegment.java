import java.util.Scanner;

public class PointOnLineSegment {
    public static void main(String[] args) {

        System.out.print("Enter three points for p0, p1, p2: ");
        Scanner input = new Scanner(System.in);
        double x0 = input.nextDouble();
        double y0 = input.nextDouble();
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        double x3 = input.nextDouble();
        double y3 = input.nextDouble();

        double slope = (y0 - y1) / (x0 - x1);
        double leftX = Math.min(x0, x1);
        double rightX = Math.max(x0, x1);
        boolean onLineSegment = false;
        if(leftX <= x3 && x3 <= rightX) {
            double expectedY3 = slope * (x3 - x0) + y0;
            if(expectedY3 == y3) {
                onLineSegment = true;
            }
        }
        System.out.println(onLineSegment);
    }
}