package view;

import controller.Controller;
import javax.swing.*;
import java.io.IOException;
/**
 * The MainFrame class represents the main window of the Battleship game.
 * It provides the graphical user interface for the game, containing the game panel
 * and various methods to interact with the panel and update its components.
 *
 * This class extends JFrame and acts as the top-level window of the game interface.
 * It initializes the main panel, handles UI updates, and interacts with the game controller.
 *
 */

public class MainFrame extends JFrame {
    private MainPanel mainPanel;
    private Controller controller;

    public MainFrame(int width, int height, Controller controller) {
        super("battleship");
        this.controller = controller;
        this.setResizable(false);
        this.setSize(width, height);
        this.mainPanel = new MainPanel(width, height, this);
        this.setContentPane(mainPanel);
        this.setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void populateRPanel(String[] informationArray) {
        mainPanel.getRPanel().populateList(informationArray);
    }

    public void updateMainPanel(String str, int newValue) {
        mainPanel.updateRPanel(str, newValue);
    }

    public void updateMessage(int choice, String shipName) {
        mainPanel.updateMessage(choice, shipName);
    }

    public void boardButtonPressed(int x, int y, ButtonType button) throws IOException {
        controller.selectedCoordinate(x,y,button);
    }

    public void hideFrame() {
        setVisible(false);
    }

    public void closeFrame() {
        System.exit(0);
    }
}
