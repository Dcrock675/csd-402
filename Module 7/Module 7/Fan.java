
/**
 *Drew Crockett
 *2/14/26
 *Module 7.2
 */
public class Fan {

    public static final int STOPPED = 0;
    public static final int SLOW = 1;
    public static final int MEDIUM = 2;
    public static final int FAST = 3;

    private int speed;
    private boolean on;
    private double radius;
    private String color;

    public Fan() {
        this.speed = STOPPED;
        this.on = false;
        this.radius = 6;
        this.color = "white";
    }

    public Fan(int speed, boolean on, double radius, String color) {
        this.speed = speed;
        this.on = on;
        this.radius = radius;
        this.color = color;
    }

    public int getSpeed() {
        return this.speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean getOn() {
        return this.on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return this.radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String toString() {
        if (this.on == true) {
            return "Fan is on\nSpeed: " + this.speed +
                   "\nRadius: " + this.radius +
                   "\nColor: " + this.color;
        } else {
            return "Fan is off\nRadius: " +
                   this.radius + "\nColor: " + this.color;
        }
    }
}


import java.math.BigInteger;

BigInteger num1 = new BigInteger("12345678901234567890");
BigInteger num2 = new BigInteger("10");
BigInteger result = num1.multiply(num2);
System.out.println(result);




