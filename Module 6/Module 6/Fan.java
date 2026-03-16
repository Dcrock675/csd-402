
/**
 * Drew Crockett
 * Module 6.2
 * 2/7/26
 */
public class Fan {

    // constants
    public static final int STOPPED = 0;
    public static final int SLOW = 1;
    public static final int MEDIUM = 2;
    public static final int FAST = 3;

    // variables
    private int speed;
    private boolean on;
    private double radius;
    private String color;

    // no-argument constructor
    public Fan() {
        speed = STOPPED;
        on = false;
        radius = 6;
        color = "white";
    }

    // constructor with arguments
    public Fan(int s, boolean o, double r, String c) {
        speed = s;
        on = o;
        radius = r;
        color = c;
    }

    // getters and setters
    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int s) {
        speed = s;
    }

    public boolean getOn() {
        return on;
    }

    public void setOn(boolean o) {
        on = o;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double r) {
        radius = r;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String c) {
        color = c;
    }

    // toString method
    public String toString() {
        String result = "";

        if (on == true) {
            result = "Fan is on\n";
            result = result + "Speed: " + speed + "\n";
            result = result + "Radius: " + radius + "\n";
            result = result + "Color: " + color;
        } else {
            result = "Fan is off\n";
            result = result + "Radius: " + radius + "\n";
            result = result + "Color: " + color;
        }

        return result;
    }
}
