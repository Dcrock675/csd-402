/**
 * Drew Crockett
 * 2/14/26\
 * Module 7.2
 */
import java.util.ArrayList;

public class UseFans {

    // Method to display ONE fan (no toString)
    public static void displayFan(Fan fan) {

        System.out.println("Fan Information:");

        if (fan.getOn() == true) {
            System.out.println("Fan is on");
            System.out.println("Speed: " + fan.getSpeed());
        } else {
            System.out.println("Fan is off");
        }

        System.out.println("Radius: " + fan.getRadius());
        System.out.println("Color: " + fan.getColor());
        System.out.println();
    }

    // Method to display a collection of fans
    public static void displayFanCollection(ArrayList<Fan> fans) {

        for (int i = 0; i < fans.size(); i++) {
            System.out.println("Fan #" + (i + 1));
            displayFan(fans.get(i));
        }
    }

    // Test code
    public static void main(String[] args) {

        ArrayList<Fan> fanList = new ArrayList<Fan>();

        Fan fan1 = new Fan();
        Fan fan2 = new Fan(Fan.FAST, true, 10, "blue");
        Fan fan3 = new Fan(Fan.MEDIUM, true, 8, "black");

        fanList.add(fan1);
        fanList.add(fan2);
        fanList.add(fan3);

        displayFanCollection(fanList);
    }
}
