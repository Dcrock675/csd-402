
/**
 * Drew Crockett
 *  3/8/26
 *  Module 10
 * 
 */
public class DomesticDivision extends Division {

    String state;

    public DomesticDivision(String name, int number, String s) {
        super(name, number);
        state = s;
    }

    public void display() {
        System.out.println("Domestic Division");
        System.out.println("Division Name: " + divisionName);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("State: " + state);
        System.out.println();
    }
}