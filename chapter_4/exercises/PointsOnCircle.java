/** Generates three random points on a circle centered at (0, 0) with radius 40

    @author Brian McEntee */

public class PointsOnCircle {
    public static void main(String[] args) {
        final int RADIUS = 40; //radius of circle

        //Generate 3 random points with coordinates xi, yi for i = 1,2,3
        double theta = Math.random() * (2 * Math.PI);
        double x1 = RADIUS * Math.cos(theta);
        double y1 = RADIUS * Math.sin(theta);

        theta = Math.random() * (2 * Math.PI);
        double x2 = RADIUS * Math.cos(theta);
        double y2 = RADIUS * Math.sin(theta);

        theta = Math.random() * (2 * Math.PI);
        double x3 = RADIUS * Math.cos(theta);
        double y3 = RADIUS * Math.sin(theta);

        //Get length of each side using distance formula
        double sideA = Math.sqrt(
            (x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2) );
        double sideB = Math.sqrt(
            (x1 - x3) * (x1 - x3) + (y1 - y3) * (y1 - y3) );
        double sideC = Math.sqrt(
            (x2 - x3) * (x2 - x3) + (y2 - y3) * (y2 - y3) );

        System.out.printf("side1: %f%nside2: %f%nside3: %f%n",
            sideA, sideB, sideC);

        double angleA = Math.acos((sideB * sideB + sideC * sideC - sideA * sideA)
            / (2 * sideB * sideC));
        double angleB = Math.acos((sideA * sideA + sideC * sideC - sideB * sideB)
            / (2 * sideA * sideC));
        double angleC = Math.acos((sideB * sideB + sideA * sideA - sideC * sideC)
            / (2 * sideA * sideB));

        System.out.printf("Angle A: %f%nAngle B: %f%nAngle C: %f%n",
            Math.toDegrees(angleA), Math.toDegrees(angleB),
            Math.toDegrees(angleC));

        final double EPSILON = 10E9;
        boolean isEqual = false;
        if(Math.abs(angleA + angleC + angleB - 180) < EPSILON) isEqual = true;
        System.out.printf("Angles sum to 180 degrees is %b%n", isEqual);

    }



}