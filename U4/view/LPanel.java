package view;

import javax.swing.*;
import java.awt.*;
import java.io.IOException;

public class LPanel extends JPanel {
    private int width;
    private int height;
    private MainFrame mainFrame;

    public LPanel(int width, int height, MainFrame mainFrame) {
        this.mainFrame = mainFrame;
        this.width = width;
        this.height = height;
        this.setSize(width, height);

        setLocation(30, 80);

        this.setLayout(new GridLayout(10, 10, 3, 3)); // Set grid layout with spacing
        this.setBackground(new Color(102, 122, 133)); // Set background color

        for (int x = 0; x < 10; x++) {
            for (int y = 0; y < 10; y++) {
                ButtonType buttonType = new ButtonType(width/10, height/10);
                int fctrx = x;
                int fctry = y;
                buttonType.addActionListener(l -> {
                    try {
                        mainFrame.boardButtonPressed(fctrx, fctry, buttonType);
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                });
                this.add(buttonType);
            }
        }
    }
}
