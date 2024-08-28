package Model;

import java.util.ArrayList;

/**
 * Den här klassen hanterar alla beställningar/orders
 * @author Fatima Kadum
 */

public class Orders {
    private ArrayList<Product> products = new ArrayList<>();
    private int nbr;
    private double price;
    private boolean ok = false;


    /**
     * Konstruktor
     * @param nbr - index för att visa order nummer
     */
    public Orders(int nbr) {
        price = 0;
        this.nbr = nbr;
    }

    /**
     * Set metod för nbr
     * @param nbr - index för att visa order nummer
     */
    public void setNbr(int nbr) {
        this.nbr = nbr;
    }

    /**
     * Get metod för att få fram price
     * @return - double price, priset utav själva ordern
     */
    public double getPrice() {
        return price;
    }

    /**
     * Metod för att säkerställa att man minst beställer 1 pizza, isOk = minst 1 pizza beställd
     * @return ok1
     */
    public boolean isOk() {
        boolean ok1 = ok;
        return ok1;
    }
    /**
     * Metod för att lägga till en produkt med hjälp av arraylist, och för priset.
     *
     * @param product, en variabel för klassen Product för att kontrollera ifall product är instans av klassen Pizza
     *                 samt för att kunna lägga till den i arraylist av klassen Product
     */
    public void addProduct(Product product) {
        if (product instanceof Pizza) {
            ok = true;
        }
        this.products.add(product);
        price = price + product.getPrice();
    }
    /**
     * Metod så att info om specifik order skriv ut till GUI
     * @return - strings, string som vissar info om order
     */
    public String[] getInfoAboutOrder() {
        String[] strings = new String[products.size()];
        for (int i = 0; i < products.size(); i++) {
            strings[i] = products.get(i).toString();
        }
        return strings;
    }
    /**
     * ToString metod för att se beställningen
     * @return String av nbr & price
     */
    public String toString() {
        return String.format("%s %s", "Order number: " + nbr + ", Price: ", price + " Kr");
    }
}
