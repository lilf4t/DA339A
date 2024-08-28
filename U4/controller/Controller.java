package controller;

import model.HighScoreList;
import model.Map;
import model.Player;
import model.Ship;
import view.ButtonEnum;
import view.ButtonType;
import view.MainFrame;
import javax.swing.JOptionPane;
import java.io.IOException;

/**
 * The Controller class manages the game logic and user interactions within the game application.
 * It orchestrates interactions between the model, view, and high score management.
 * It keeps track of player actions, coordinates, ship hits, and game state.
 * It handles game initialization, gameplay, ship hits, and game completion.
 * It interfaces with the UI components and manages high score recording and display.
 *
 * @author Fatima Kadum
 */
public class Controller {
    private MainFrame mainFrame;
    private HighScoreList highScoreList;
    private Player player;
    private Map map;
    private boolean[][] hitUnitTracking;
    private int tries;
    private int miss;
    private int downedShips;
    private int hits;

    /**
     * Constructs a Controller instance and initializes highScoreList so there's only one instance of a high score list.
     *
     * @throws IOException If an I/O error occurs during initialization.
     */
    public Controller() throws IOException {
        highScoreList = new HighScoreList(this); // Initialize highScoreList here
        start();
    }

    /**
     * Initializes the game state, user interface, and map layout.
     *
     */
    private void start() {
        initializeGame();

        String[] mapLayout = new String[] { "map layout 1", "map layout 2"};

        int chooseMapLayout = JOptionPane.showOptionDialog(null,
                "select which map layout you want. you only have 45 tries.",
                "battlefield", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE,
                null, mapLayout, mapLayout[0]);

        mainFrame = new MainFrame(800, 500, this);
        // Initialize a boolean array to track hit units on the game map (10x10 grid)
        hitUnitTracking = new boolean[10][10];

        map = new Map(chooseMapLayout);

        highScoreList.readFromFile();
        mainFrame.populateRPanel(highScoreList.getScoreInfo());
    }

    /**
     * Initializes the game's starting values.
     */
    private void initializeGame() {
        player = new Player(null, 0);
        tries = 0;
        hits = 0;
        miss = 0;
        downedShips = 0;
    }

    /**
     * Handles the logic when a player selects a coordinate on the map.
     *
     * @param x The x-coordinate of the selected point.
     * @param y The y-coordinate of the selected point.
     * @param buttonType The type of button (attack, miss, etc.).
     * @throws IOException If an I/O error occurs during gameplay.
     */
    public void selectedCoordinate(int x, int y, ButtonType buttonType) throws IOException {
        // If the coordinates (x, y) have already been hit before
        if (hitUnitTracking[x][y]) {
            // Update a message indicating a repeated hit
            mainFrame.updateMessage(1, "test");
        } else {
            tries++;
            mainFrame.updateMainPanel("tries", tries);
            hitUnitTracking[x][y] = true;
            // Get the ship at the specified coordinates
            Ship ship = map.getCoordinates(x, y);

            if (ship == null) {
                miss++;
                buttonType.hitButtonType(ButtonEnum.miss);
                mainFrame.updateMainPanel("miss", miss);
            } else {
                handleSuccessfulHit(ship, buttonType);
            }
        }
    }

    /**
     * Handles the logic when a successful hit on a ship occurs.
     *
     * @param ship The ship that was hit.
     * @param buttonType The type of button (attack, miss, etc.).
     */
    private void handleSuccessfulHit(Ship ship, ButtonType buttonType) {
        // Update the user interface to display a message indicating a successful hit on the ship
        mainFrame.updateMessage(2, ship.getName());
        ship.hit();
        hits++;
        mainFrame.updateMainPanel("attack", hits);
        buttonType.hitButtonType(ButtonEnum.hit);

        if (ship.isDown()) {
            ship.down();
            // Update the user interface to indicate that the ship has been sunk
            mainFrame.updateMessage(3, ship.getName());
            downedShips++;
            mainFrame.updateMainPanel("downed", downedShips);

            if (map.allShipsAreDown()) {
                handleGameCompletion();
            }
        }
    }

    /**
     * Handles the logic when the game is completed.
     */
    private void handleGameCompletion() {
        mainFrame.updateMessage(4, "test");
        player.setScore(tries);

        if (highScoreList.compareScore(tries)) {
            highScoreList.writeToFile();
            mainFrame.populateRPanel(highScoreList.getScoreInfo());
        } else {
            JOptionPane.showMessageDialog(null, "you did not make the highscore list!");
        }

        int reply = showPlayAgainDialog();
        if (reply == 0) {
            mainFrame.hideFrame();
            initializeGame(); // Reset the game here
            start();
        } else {
            mainFrame.closeFrame();
        }
    }

    /**
     * Shows a dialog to ask the player if they want to play again.
     *
     * @return 0 if the player wants to play again, 1 if not.
     */
    private int showPlayAgainDialog() {
        String[] options = new String[] { "yes", "no" };
        return JOptionPane.showOptionDialog(null, "play again?", "game over",
                JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, options, options[0]);
    }

    /**
     * Retrieves the current player.
     *
     * @return current player
     */
    public Player getPlayer() {
        return player;
    }
}
