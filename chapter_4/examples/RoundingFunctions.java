/** Examples utilizing the built in rounding fuctions from the Math class.

    @author Brian McEntee */

public class RoundingFunctions {
    public static void main(String[] args) {
        System.out.println(Math.ceil(2.1)); //3.0
        System.out.println(Math.ceil(3.0)); //3.0
        System.out.println(Math.ceil(0.1)); //1.0
        System.out.println(Math.ceil(-0.1)); //0.0
        System.out.println(Math.ceil(-2.9)); //-2.0
        System.out.println(Math.floor(2.1)); //2.0
        System.out.println(Math.floor(3.0)); //3.0
        System.out.println(Math.floor(0.1)); //0.0
        System.out.println(Math.floor(-0.1)); //-1.0
        System.out.println(Math.floor(-2.9)); //-3.0
        System.out.println(Math.rint(2.1)); //2.0
        System.out.println(Math.rint(2.6)); //3.0
        System.out.println(Math.rint(-1.0)); //-1.0
        System.out.println(Math.rint(-5.4)); //-5.0
        System.out.println(Math.rint(-5.6)); //-6.0
        System.out.println(Math.rint(4.5)); //4.0
        System.out.println(Math.rint(1.5)); //2.0
        System.out.println(Math.rint(-1.5)); //-2.0
        System.out.println(Math.round(2.6)); //3 as long
        System.out.println(Math.round(-2.6)); //-3 as long
        System.out.println(Math.round(2.5f)); //3 as int
        System.out.println(Math.round(11.5f)); //12 as int
        System.out.println("==================================================");
        System.out.println(
            Math.rint(15.3) == Math.round(15.3)); // true
        System.out.println(
            Math.rint(15.5) == Math.round(15.5)); //true
        System.out.println(
            Math.rint(14.5) == Math.round(14.5)); //false
    }
}