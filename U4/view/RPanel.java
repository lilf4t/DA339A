package view;

import javax.swing.*;
import java.awt.*;

public class RPanel extends JPanel {
    private JList<Object> objectJList;
    private JTextField hitField;
    private JTextField missField;
    private JTextField triesField;
    private JLabel labelAttack;
    private JLabel labelMiss;
    private JLabel labelTries;
    private JLabel labelList;
    private MainFrame mainFrame;

    public RPanel(int width, int height, MainFrame mainFrame) {
        this.mainFrame = mainFrame;
        this.setLayout(null);
        this.setSize(width, height / 2);
        setLocation(width, 0);
        setUpFields();
        setUpLabels();
        setUpList();
        setUp();
    }
    private void setUpFields() {
        hitField = createTextField();
        missField = createTextField();
        triesField = createTextField();
    }
    private JTextField createTextField() {
        JTextField textField = new JTextField("0");
        textField.setPreferredSize(new Dimension(50, 30));
        return textField;
    }
    private void setUpLabels() {
        labelAttack = createLabel("successful attempts");
        labelMiss = createLabel("unsuccessful attempts");
        labelTries = createLabel("total tries");
        labelList = createLabel("high score list");
    }
    private JLabel createLabel(String labelText) {
        JLabel label = new JLabel(labelText);
        label.setSize(100, 30);
        return label;
    }
    private void setUpList() {
        objectJList = new JList<>();
        objectJList.setSize(100, 100);
    }
    private void setUp() {
        setLayout(new GridLayout(6, 2, 10, 10));

        add(labelAttack);
        add(hitField);

        add(labelMiss);
        add(missField);

        add(labelTries);
        add(triesField);

        add(labelList);
        add(objectJList);
        add(new JScrollPane(objectJList)); // Use a JScrollPane for the list
    }

    public void updateLabel(String str, int newValue) {
        switch (str) {
            case "attack":
                hitField.setText(String.valueOf(newValue));
                break;
            case "miss":
                missField.setText(String.valueOf(newValue));
                break;
            case "tries":
                triesField.setText(String.valueOf(newValue));
                break;
        }
    }

    public void updateMessage(int choice, String shipName) {
        switch (choice) {
            case 1:
                JOptionPane.showMessageDialog(null, "please choose a different tile.");
                break;
            case 2:
                JOptionPane.showMessageDialog(null, "you attacked a " + shipName);
                break;
            case 3:
                JOptionPane.showMessageDialog(null, "you sunk a " + shipName);
                break;
            case 4:
                JOptionPane.showMessageDialog(null, "game over");
                break;
        }
    }
    public void populateList(String[] informationArray) {
        objectJList.setListData(informationArray);
    }
}
