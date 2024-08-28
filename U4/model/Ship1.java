package model;
/**
 * A specific type of ship representing a submarine/u-båt on the game map.
 * Extends the abstract class Ship.
 */
public class Ship1 extends Ship{

    /**
     * Constructs a Ship1 (submarine) object with the specified properties.
     *
     * @param map The map on which the ship is placed.
     * @param name The name of the ship.
     * @param length The length of the ship in units.
     */
    public Ship1(Map map, String name, int length) {
        super(map, "submarine", 1);
    }
}
