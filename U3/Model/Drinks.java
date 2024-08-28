package Model;
/**
 * Drinks är en subklass till Product.
 * @author Fatima Kadum
 */
public class Drinks extends Product{

    /**
     * Konstruktor för att kunna initiera drinks objekt med name och price
     * @param name - namn för drink
     * @param price - pris för dirnk
     */
    public Drinks(String name, double price) {
        super(name, price);
    }

    /**
     * toString metod för att skriva ut namn och pris.
     * @return - String name, double price
     */
    public String toString(){
        return String.format(super.toString());
    }
}
