/** Practice with using random() from the Math class to generate random numbers
    in specified intervals.

    @author Brian McEntee */

import java.util.Scanner;

public class RandomNumbers {
    public static void main(String[] args) {
        
        double radians = Math.toRadians(47);
        double degrees = Math.toDegrees(Math.PI / 7);

        //random integer between 34 and 55
        int random1 = (int)(Math.random() * 21) + 34; 
        //random integer between 0 and 999
        int random2 = (int)(Math.random() * 1000);
        //random number between 5.5 and 55.5
        double random3 = (Math.random() * 50) + 5.5;
        //random number between 6.7 and 39.2
        double random4 = Math.random() * 32.5 + 6.7;

        System.out.println(random1);
        System.out.println(random2);
        System.out.println(random3);
        System.out.println(random4);
    }
}