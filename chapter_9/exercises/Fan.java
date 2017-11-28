/**
* The Fan class respresents a typical fan found in the household.
* @author Brian McEntee
* @version 0.0
*/
public class Fan {
    /* Declared constants. */
    public static final int SLOW = 1;
    public static final int MEDIUM = 2;
    public static final int FAST = 3;

    /* Instance variables. */
    private int speed = SLOW;
    private boolean on = false;
    private double radius = 5.0; // in inches
    private String color = "blue";

    /* Constructors. */
    public Fan() {}

    /* Accessor and mutator methods for private data fields. */
    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        if (speed == SLOW || speed == MEDIUM || speed == FAST) {
            this.speed = speed;
        }
        else {
            // invalid speed given
        }
    }

    public boolean isOn() {
        return on;
    }

    public void turnOn() {
        on = true;
    }

    public void turnOff() {
        on = false;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if (radius > 0) {
            this.radius = radius;
        }
        else {
            // invalid radius given
        }
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        if (on) {
            return "Speed: " + speed +
                    "\nColor: " + color + 
                    "\nRadius: " + radius;
        }
        else {
            return "Color: " + color +
                    "\nRadius: " + radius + 
                    "\nThe fan is off";
        }
    }

}