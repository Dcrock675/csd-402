
/**
 * Drew Crockett
 * Module 6.2
 * 2/7/26
 */
public class FanTest {

    public static void main(String[] args) {

        Fan fan1 = new Fan();

        Fan fan2 = new Fan(Fan.FAST, true, 10, "blue");

        System.out.println("Fan 1 info:");
        System.out.println(fan1.toString());

        System.out.println();
        System.out.println("Fan 2 info:");
        System.out.println(fan2.toString());

        fan1.setOn(true);
        fan1.setSpeed(Fan.MEDIUM);
        fan1.setRadius(8);
        fan1.setColor("black");

        System.out.println();
        System.out.println("Fan 1 after changes:");
        System.out.println(fan1.toString());
    }
}
