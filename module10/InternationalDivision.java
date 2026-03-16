
/**
 * Drew Crockett
 * 3/8/26
 * Module 10.2
 * 
 */
public class InternationalDivision extends Division {

    String country;
    String language;

    public InternationalDivision(String name, int number, String c, String l) {
        super(name, number);
        country = c;
        language = l;
    }

    public void display() {
        System.out.println("International Division");
        System.out.println("Division Name: " + divisionName);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Country: " + country);
        System.out.println("Language: " + language);
        System.out.println();
    }
}