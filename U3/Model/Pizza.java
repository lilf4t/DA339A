package Model;

import java.util.Arrays;

/**
 * Pizza klassen är en subklass till Product.
 * @author Fatima Kadum
 */
public class Pizza extends Product{
    /**
     * Något endast unik till pizza klassen är att den har toppings.
     */
    private Toppings[] toppings;

    /**
     * Konstruktor för att kunna initiera pizza objekt med name, price, toppings
     * @param name - namn av pizza
     * @param price - pris av pizza
     * @param toppings - toppings (array) för pizza
     */
    public Pizza(String name, double price, Toppings[] toppings) {
        super(name, price);
        this.toppings = toppings;
    }
    /**
     * toString metod för att skriva ut namn och pris och toppings när man lagt till en pizza.
     * @return String name, double price, Arrays.toString(toppings)  (gör array till strings för att visa toppings)
     */
    public String toString(){
        return String.format((super.toString() + " Toppings" + Arrays.toString(toppings)));
    }
}
