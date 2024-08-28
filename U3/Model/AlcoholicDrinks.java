package Model;
/**
 * AlcoholicDrinks är en subklass till Drinks.
 * @author Fatima Kadum
 */
public class AlcoholicDrinks extends Drinks{
    private double alcPercentage;

    /**
     * Konstruktor för att kunna initiera drinks objekt med name och price
     * @param name - vad drink heter
     * @param price - hur mycket drink kostar
     * @param alcPercentage - alkoholhalten för drink
     */

    public AlcoholicDrinks(String name, double price, double alcPercentage){
        super(name, price);
        this.alcPercentage = alcPercentage;
    }

    /**
     *  toString metod som skriver ut pris, namn och alkoholprocent
     *  @return - String name, double price, double alcPercentage
     */
    public String toString(){
        return super.toString() + ", " + " Alcohol percentage: " +  alcPercentage + "%";
    }
}
