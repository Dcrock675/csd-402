
/**
 * Write a description of class Program1 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.ArrayList;
import java.util.Scanner;

public class Program1 {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<String>();

        list.add("Apple");
        list.add("Banana");
        list.add("Cat");
        list.add("Dog");
        list.add("Egg");
        list.add("Fish");
        list.add("Goat");
        list.add("Hat");
        list.add("Ice");
        list.add("Jam");

        System.out.println("Here is the list:");

        for (String item : list) {
            System.out.println(item);
        }

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number between 0 and 9:");
        String userInput = input.nextLine();

        try {
            Integer index = Integer.parseInt(userInput);
            System.out.println("You chose: " + list.get(index));
        } 
        catch (IndexOutOfBoundsException e) {
            System.out.println("Exception thrown: Out of Bounds");
        } 
        catch (NumberFormatException e) {
            System.out.println("Please enter a valid number.");
        }

        input.close();
    }
}