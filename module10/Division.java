
/**
 * Drew Crockett
 *
 * 
 *
 */
public abstract class Division {

    String divisionName;
    int accountNumber;

    public Division(String name, int number) {
        divisionName = name;
        accountNumber = number;
    }

    public abstract void display();
}