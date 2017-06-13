/** Examples which utilize the built in trig functions from the Math class

    @author Brian McEntee */

public class TrigonometricFunctions {
    public static void main(String[] args) {
        System.out.println(Math.toDegrees(Math.PI / 2)); //90
        System.out.println(Math.toRadians(30)); //.5236 i.e pi/6
        System.out.println(Math.sin(0)); //0.0
        System.out.println(
            Math.sin(Math.toRadians(270))); //-1.0
        System.out.println(Math.cos(0)); //1
        System.out.println(Math.asin(0)); //0
        System.out.println(Math.acos(1)); //0
        System.out.println(Math.atan(1.0)); //.789358
    }
}