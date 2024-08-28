package model;

/**
 * A specific type of ship representing a battleship/slagskepp on the game map.
 * Extends the abstract class Ship.
 */
public class Ship5 extends Ship{

    /**
     * Constructs a Ship5 (battleship) object with the specified properties.
     *
     * @param map The map on which the ship is placed.
     * @param name The name of the ship.
     * @param length The length of the ship in units.
     */
    public Ship5(Map map, String name, int length) {
        super(map, "battleship", 5);
    }
}
