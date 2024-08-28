package model;

import java.io.Serializable;

/**
 * Represents a player with a name and score. Implements the Serializable interface for object serialization
 * and the Comparable interface for score-based comparisons.
 *
 * @author Fatima Kadum
 */
public class Player implements Serializable, Comparable<Player> {
    private String name;
    private int score;

    /**
     * Constructs a player with a specified name and score.
     *
     * @param name  The name of the player.
     * @param score The score of the player.
     */
    public Player(String name, int score) {
        this.name = name;
        this.score = score;
    }

    /**
     * Sets the name of the player.
     *
     * @param name The new name of the player.
     */
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    /**
     * Sets the score of the player.
     *
     * @param score The new score of the player.
     */
    public void setScore(int score) {
        this.score = score;
    }

    /**
     * Gets the score of the player.
     *
     * @return The score of the player.
     */
    public int getScore() {
        return score;
    }

    /**
     * Returns a string representation of the player's name and score.
     *
     * @return A string containing the name and score of the player.
     */
    @Override
    public String toString() {
        return "name: " + name + ", score: " + score;
    }

    /**
     * Compares this player to another player based on their scores.
     *
     * @param otherPlayer The other player to compare to.
     * @return A negative integer if this player's score is less than the other player's score,
     *         a positive integer if greater, and 0 if scores are equal.
     */
    @Override
    public int compareTo(Player otherPlayer) {
        return Integer.compare(score, otherPlayer.score);
    }
}