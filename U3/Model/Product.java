package Model;
/**
 * Product är superklass för produkterna Pizza och Drinks, (Alcoholic drinks är subklass till Drinks)
 * @author Fatima Kadum
 */
public abstract class  Product implements IProduct {
     private String name;
     private double price;

    /**
     * Konstruktor sätter defaultvärden för attributen.
     * @param name - namn av produkten
     * @param price - pris av produkten
     */
    public Product(String name, double price){
        this.name = name;
        this.price = price;
    }

    /**
     * Get metod för att få fram name och price.
     * @return - price & name
     */
     public double getPrice() {return price;}
     public String getName() {return name;}

    /**
     * toString metod för att skriva ut namn och pris.
     * @return - string av name & price
     */
     public String toString(){
        return String.format("%s %s", name + ", ", price + "kr");
    }
}
