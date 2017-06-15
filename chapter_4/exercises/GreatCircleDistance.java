/** Computes the 'great circle distance', or distance between two points
    located on a sphere given their latitude and longitude and the average
    radius of the earth.

    Equations Needed:
        radius = 6,371.01 km
        d = radius * arccos(
            sin(x1) * sin(x2) + cos(x1) * cos(x2) * cos(y1 - y2) )

    @author Brian McEntee */

import java.util.Scanner; 

public class GreatCircleDistance {
    public static void main(String[] args) {

        final double RADIUS = 6371.01; //average radius of earth

        //Prompt user to enter coordinates in form 'latitude, longitude'
        Scanner input = new Scanner(System.in);
        System.out.print("Enter point 1 (latitude and longitude) "
            + "in degrees: ");
        String coordinate1 = input.nextLine();
        int k = coordinate1.indexOf(',');
        double lat1 = Double.parseDouble(coordinate1.substring(0,k));
        double lon1 = Double.parseDouble(coordinate1.substring(k+2));
        double x1 = Math.toRadians(lat1);
        double y1 = Math.toRadians(lon1);

        System.out.print("Enter point 2 (latitude and longitude) "
            + "in degrees: ");
        String coordinate2 = input.nextLine();
        k = coordinate2.indexOf(',');
        double lat2 = Double.parseDouble(coordinate2.substring(0,k));
        double lon2 = Double.parseDouble(coordinate2.substring(k+2));
        double x2 = Math.toRadians(lat2);
        double y2 = Math.toRadians(lon2);

        //Compute great circle distance with given formula
        double distance = RADIUS * Math.acos(
            Math.sin(x1) * Math.sin(x2) + Math.cos(x1) * Math.cos(x2)
            * Math.cos(y1 - y2) );
        System.out.printf("The distance between these coordinates is: %f km%n",
            distance);
    }
}