package Model;
/**
 * Interface klass med metoder.
 * @uthor Fatima Kadum
 */
public interface IProduct {
    /**
     * Metod för att få fram priset
     * @return - price (av product)
     */
    double getPrice();
    /**
     * Metod för att få fram namnet
     * @return - name (av product)
     */
    String getName();
}
