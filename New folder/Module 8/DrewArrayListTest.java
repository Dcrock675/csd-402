
/**
 Drew Crockett
 2/21/26
 Module 8
 */
import java.util.ArrayList;
import java.util.Scanner;

public class DrewArrayListTest {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();

        System.out.println("Enter integers (enter 0 to stop):");

        Integer input;

        do {
            input = scanner.nextInt();
            numbers.add(input);
        } while (input != 0);

        Integer largest = max(numbers);

        System.out.println("The largest value is: " + largest);

        scanner.close();
    }

    public static Integer max(ArrayList list) {

        if (list == null || list.size() == 0) {
            return 0;
        }

        Integer largest = (Integer) list.get(0);

        for (int i = 0; i < list.size(); i++) {
            Integer current = (Integer) list.get(i);
            if (current > largest) {
                largest = current;
            }
        }

        return largest;
    }
}