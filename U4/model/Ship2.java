package model;

/**
 * A specific type of ship representing a torpedo boat/torpedbåt on the game map.
 * Extends the abstract class Ship.
 */
public class Ship2 extends Ship{

    /**
     * Constructs a Ship2 (torpedo boat) object with the specified properties.
     *
     * @param map The map on which the ship is placed.
     * @param name The name of the ship.
     * @param length The length of the ship in units.
     */
    public Ship2(Map map, String name, int length) {
        super(map, "torpedo boat", 2);
    }
}