/** Estimates the geographical area between 4 chosen cities
    
    Cities: Atlanta, Georgia 33.7214, -84.4423          x1 y1
            Orlando, Florida 28.5383, -81.3792          x2 y2
            Savannah, Georgia 32.1334, -81.1173         x3 y3
            Charlotte, North Carolina 35.2270, -80.8431 x4 y4
            
            - Polygon -
            s1) Atlanta <-> Orlando
            s2) Orlando <-> Savannah
            s3) Savannah <-> Charlotte
            s4) Charlotte <-> Atlanta 

            - Added Diagonal -
            s5) Atlanta <-> Savannah

            - Triangle 1 -
            s1 s2 s5

            - Triangle 2 -
            s3 s4 s5

    @author Brian McEntee */

public class AreaBetweenCities {
    public static void main(String[] args) {
        final double EARTH_RADIUS = 6371.01; //km
        //Atlanta
        double x1 = Math.toRadians(33.7214);
        double y1 = Math.toRadians(-84.4423);
        //Orlando
        double x2 = Math.toRadians(28.5383);
        double y2 = Math.toRadians(-81.3792);
        //Savannah
        double x3 = Math.toRadians(32.1334);
        double y3 = Math.toRadians(-81.1173);
        //Charlotte
        double x4 = Math.toRadians(35.2270);
        double y4 = Math.toRadians(-80.8431);

        double s1 = circleDistance(EARTH_RADIUS, x1, y1, x2, y2);
        double s2 = circleDistance(EARTH_RADIUS, x2, y2, x3, y3);
        double s3 = circleDistance(EARTH_RADIUS, x3, y3, x4, y4);
        double s4 = circleDistance(EARTH_RADIUS, x1, y1, x4, y4);
        double s5 = circleDistance(EARTH_RADIUS, x1, y1, x3, y3);

        double area1 = areaOfTriangle(s1, s2, s5);
        double area2 = areaOfTriangle(s3, s4, s5);

        double totalArea = area1 + area2;
        System.out.printf("The estimated area is %f%n", totalArea);

    }

    public static double circleDistance(double radius, double x1, double y1,
        double x2, double y2) {

        return radius * Math.acos(
            Math.sin(x1) * Math.sin(x2) + Math.cos(x1) * Math.cos(x2)
            * Math.cos(y1 - y2) );
    }

    public static double areaOfTriangle(double s1, double s2, double s3) {
        double s = (s1 + s2 + s3) / 2.0;
        return Math.sqrt(
            s * (s - s1) * (s - s2) * (s - s3) );
    }
}