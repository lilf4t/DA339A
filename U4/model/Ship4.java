package model;

/**
 * A specific type of ship representing a cruiser boat/kryssare on the game map.
 * Extends the abstract class Ship.
 */
public class Ship4 extends Ship{

    /**
     * Constructs a Ship4 (cruiser) object with the specified properties.
     *
     * @param map The map on which the ship is placed.
     * @param name The name of the ship.
     * @param length The length of the ship in units.
     */
    public Ship4(Map map, String name, int length) {
        super(map, "cruiser", 4);
    }
}