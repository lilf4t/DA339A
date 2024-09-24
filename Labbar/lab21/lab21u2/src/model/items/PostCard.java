package model.items;

public class PostCard extends Letter{

    //ToDO: Skapa egen attribut för PostCard

    //----------------------------------Instance Variables---------------------------------------
    private String date;

    //----------------------------------Constructor----------------------------------------------
    public PostCard(String date) {
        this.date = date;
    }
    //----------------------------------Get Method----------------------------------------------
    public String getDate() {
        return date;
    }
    //----------------------------------Set Method----------------------------------------------
    public void setDate(String date) {
        this.date = date;
    }
    //----------------------------------To String-----------------------------------------------
    public String toString() {
        return String.format("Receiver: %s, Sender: %s, Weight: %.2f g, Cost: %.2f Kr, Date: %s", getReceiver(),
                getSender(), getWeight(), getCost(), date);
    }
}
