package model;

/**
 * Represents a game map for the battleships.
 *
 * @author Fatima Kadum
 */
public class Map {
   // represent the layout of ships on the game map
    private Ship[][] ships;
    private int shipAmount = 5;
    // defines the different ship types that can be placed on the map and their sizes
    private Ship[] shipType = new Ship[] {
            null,
            new Ship1(this, "submarine", 1),
            new Ship2(this, "torpedo boat", 2),
            new Ship3(this, "cruiser", 3),
            new Ship4(this, "hunter ship", 4),
            new Ship5(this, "battleship", 5)
    };

    /**
     * Constructs a game map based on the chosen option.
     *
     * @param option The option for selecting the map configuration.
     */
    public Map(int option) {
        if (option == 0) {
            createMapOption1();
        } else if (option == 1) {
            createMapOption2();
        }
    }
    /**
     * Creates the first map configuration.
     */
    private void createMapOption1() {
        ships = new Ship[][]{
                {shipType[1], null, shipType[2], null, null, null, null, null, null, null},
                {null, null, shipType[2], null, null, null, null, null, null, null},
                {null, null, null, null, null, shipType[3], shipType[3], shipType[3], null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {shipType[4], null, null, null, null, null, null, null, null, null},
                {shipType[4], null, null, null, null, null, null, null, null, null},
                {shipType[4], null, null, null, null, null, null, null, null, null},
                {shipType[4], null, null, shipType[5], shipType[5], shipType[5], shipType[5], shipType[5], null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
        };
    }
    /**
     * Creates the second map configuration.
     */
    private void createMapOption2() {
        ships = new Ship[][]{
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, shipType[4], shipType[4], shipType[4], shipType[4], null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {shipType[2], null, null, null, null, null, null, null, null, null},
                {shipType[2], null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, shipType[1], null, null},
                {null, null, shipType[3], null, null, null, null, null, null, null},
                {null, null, shipType[3], null, null, null, null, null, null, null},
                {null, null, shipType[3], null, null, null, null, null, null, null},
                {null, null, null, null, null, shipType[5], shipType[5], shipType[5], shipType[5], shipType[5]},
        };
    }
    /**
     * Reduces the count of remaining ships.
     */
    public void reduceShipAmount() {
        shipAmount--;
    }
    /**
     * Checks whether all ships on the map are down.
     *
     * @return {@code true} if all ships are down, {@code false} otherwise.
     */
    public boolean allShipsAreDown() {
        return shipAmount == 0;
    }
    /**
     * Retrieves the ship at the specified coordinates on the map.
     *
     * @param x The x-coordinate.
     * @param y The y-coordinate.
     * @return The ship at the specified coordinates, or {@code null} if no ship is present.
     */
    public Ship getCoordinates(int x, int y) {
        return ships[x][y];
    }
}

