package view;

import javax.swing.*;
import java.awt.*;
/**
 * The MainPanel class represents the main content panel of the Battleship game's user interface.
 * It acts as a container for the left and right panels within the game interface.
 *
 * This class extends JPanel and is responsible for initializing the left and right panels,
 * setting their positions, and providing methods to interact with and update UI components.
 *
 */
public class MainPanel extends JPanel {
    private LPanel lPanel;
    private RPanel rPanel;

    public MainPanel(int width, int height, MainFrame mainFrame) {
        super(null);
        this.setSize(width, height);
        this.setBackground(new Color(50, 228, 232)); // Set background color

        lPanel = new LPanel(width / 2, 460, mainFrame);
        lPanel.setLocation(0, 0); // Align to the left
        add(lPanel);

        rPanel = new RPanel(width / 2, height, mainFrame);
        rPanel.setLocation(width / 2, 0); // Align to the right
        add(rPanel);
    }
    protected RPanel getRPanel() {
        return rPanel;
    }
    public void updateRPanel(String str, int newValue) {
        rPanel.updateLabel(str, newValue);
    }
    public void updateMessage(int choice, String shipName) {
        rPanel.updateMessage(choice, shipName);
    }
}
