package model;

import controller.Controller;
import javax.swing.*;
import java.io.*;
import java.util.*;
import java.util.ArrayList;

/**
 * The HighScoreList class manages and maintains a list of highscore objects which can also read and write to a dat file
 *
 * @author Fatima Kadum.
 */
public class HighScoreList {
    private ArrayList<Player> highScore;
    private ArrayList<Player> highScoreList;
    private Controller controller;
    private Player player;

    private static final String list = "list.txt";

    /**
     * Constructs a HighScoreList object.
     *
     * @param controller The controller instance for player information.
     * @throws FileNotFoundException If a file is not found during initialization.
     * @throws IOException If an I/O error occurs during initialization.
     */
    public HighScoreList(Controller controller) throws FileNotFoundException, IOException {
        highScore = new ArrayList<>();
        highScoreList = new ArrayList<>(10);

        this.controller = controller;
    }

    /**
     * Compares the player's score with the high score list and updates the list if necessary.
     * A player within 45 tries are eligible for the list, if there already are 10 people in the list,
     * it will replace the player with the lowest score.
     *
     * @param tries The number of tries the player has made.
     * @return {@code true} if the player's score qualifies for the high score list, {@code false} otherwise.
     */
    public boolean compareScore(int tries) {
        if (tries >= 45) {
            return false;
        }
        // Check if the high score list is empty
        if (highScoreList.size() == 0) {
            String playersName = JOptionPane.showInputDialog(null, "Enter name");
            this.player = controller.getPlayer();
            player.setName(playersName);
            // Add the player to the high score list
            highScoreList.add(player);
            return true;
        }
        // Check if the first element in the high score list is not null and is an instance of Player
        // Also check if the player's score is lower than the score of the player at index 9
        if ((highScoreList.get(0) != null && highScoreList.get(0) instanceof Player) || highScoreList.isEmpty()
                || (player.getScore() < highScoreList.get(9).getScore())) {
            String playersName = JOptionPane.showInputDialog(null, "Enter name");
            this.player = controller.getPlayer();
            player.setName(playersName);
            highScoreList.add(player);
            // Sort the high score list in ascending order
            Collections.sort(highScoreList);

            // After sorting the list, remove any entries beyond the first 10
            if (highScoreList.size() > 10) {
                highScoreList.subList(10, highScoreList.size()).clear();
            }
            return true;
        } else {
            return false;
        }
    }
    /**
     * Retrieves an array of strings containing information about all the high scores.
     *
     * @return An array of strings containing high score information.
     */
    public String[] getScoreInfo() {
        String[] scoreArray = new String[highScoreList.size()];
        for (int i = 0; i < scoreArray.length; i++) {
            scoreArray[i] = highScoreList.get(i).toString();
        }
        return scoreArray;
    }

    /**
     * Writes the high score list to a .dat file using object serialization.
     */
    public void writeToFile() {
        try{
            FileWriter write = new FileWriter(list);
            PrintWriter out = new PrintWriter(write);

            for (int i = 0; i < highScoreList.size() && i < 9; i++){
                Player p = highScoreList.get(i);
                out.println(p.getName() + "\t" + p.getScore());
            }
            out.close();
        } catch(IOException e) {
            e.printStackTrace();
        }
    }


    /**
     * Reads the high score list from a .dat file using object deserialization.
     */
    public void readFromFile() {
            String line;
            String[] parts;
            int score;

            highScoreList = new ArrayList<Player>(10);

            try {
                BufferedReader file = new BufferedReader(new FileReader(list));

                while((line = file.readLine()) != null) {
                    parts = line.split("\t");
                    String name = parts[0];
                    score = Integer.parseInt(parts[1]);
                    highScoreList.add(new Player(name, score));
                }
                file.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
}
