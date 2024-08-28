package model;
/**
 * An abstract class representing a ship on the game map.
 * @author Fatima Kadum
 */
public abstract class Ship {
    private Map map;
    private String name;
    private int length;
    private int hits;

    /**
     * Constructs a Ship object with the specified properties.
     *
     * @param map The map on which the ship is placed.
     * @param name The name of the ship.
     * @param length The length of the ship in units.
     */
    public Ship(Map map, String name, int length) {
        this.map = map;
        this.name = name;
        this.length = length;
    }

    /**
     * Retrieves the name of the ship.
     *
     * @return The name of the ship.
     */
    public String getName() {
        return name;
    }

    /**
     * Returns a string representation of the ship.
     *
     * @return A string containing the name and length of the ship.
     */
    public String toString() {
        return name + " , " +length+ " units ";
    }

    /**
     * Records a hit on the ship.
     */
    public void hit(){
        hits++;
    }

    /**
     * Checks whether the ship has been fully hit and is down.
     *
     * @return {@code true} if the ship is down, {@code false} otherwise.
     */
    public boolean isDown(){
        return hits == length;
    }

    /**
     * Marks the ship as down and reduces the count of ships on the map.
     */
    public void down()
    {
        map.reduceShipAmount();
    }
}
