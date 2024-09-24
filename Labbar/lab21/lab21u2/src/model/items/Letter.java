package model.items;

public class Letter extends MailItem{

    //ToDO: Skapa egen attribut för Letter

    //----------------------------------Instance Variables---------------------------------------
    private int stamps;

    //----------------------------------Constructor----------------------------------------------
    public Letter(int stamps) {
        this.stamps = stamps;
    }

    public Letter() {
    }

    //----------------------------------Get Method----------------------------------------------
    public int getStamps() {
        return stamps;
    }

    //----------------------------------Set Method----------------------------------------------
    public void setStamps(int stamps) {
        this.stamps = stamps;
    }

    //----------------------------------To String-----------------------------------------------
    @Override
    public String toString() {
        return String.format("Receiver: %s, Sender: %s, Weight: %.2f g, Cost: %.2f Kr, Stamps: %s", getReceiver(),
                getSender(), getWeight(), getCost(), stamps);
    }
}
