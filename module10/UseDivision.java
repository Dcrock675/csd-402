
/**
 * Drew Crockett    
 *  3/8/26
 *  Module 10
 *
 * 
 * 
 */
public class UseDivision {

    public static void main(String[] args) {

        InternationalDivision div1 = new InternationalDivision(
                "Asia Sales", 1001, "Japan", "Japanese");

        InternationalDivision div2 = new InternationalDivision(
                "Europe Sales", 1002, "Germany", "German");

        DomesticDivision div3 = new DomesticDivision(
                "West Coast Sales", 2001, "California");

        DomesticDivision div4 = new DomesticDivision(
                "South Region Sales", 2002, "Texas");

        div1.display();
        div2.display();
        div3.display();
        div4.display();
    }
}