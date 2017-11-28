public class FanDemo {
    /** Main method. */
    public static void main(String[] args) {
        Fan f1 = new Fan();
        Fan f2 = new Fan();
        System.out.println(f1.toString());
        System.out.println(f2.toString());

        f1.setSpeed(Fan.FAST);
        f1.setColor("yellow");
        f1.setRadius(10);
        f1.turnOn();

        f2.setSpeed(Fan.MEDIUM);
        f2.setColor("blue");
        f2.setRadius(5);
        f2.turnOff();

        System.out.println(f1.toString());
        System.out.println(f2.toString());
    }
}