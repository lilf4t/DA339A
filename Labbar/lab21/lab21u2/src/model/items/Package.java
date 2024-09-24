package model.items;

public class Package extends Parcel {

     //ToDO: Skapa egen attribut för Package

    //----------------------------------Instance Variables---------------------------------------
    private boolean containsFragileContent;

    //----------------------------------Constructor----------------------------------------------
    public Package(boolean answer) {
        this.containsFragileContent = answer;
    }

    //----------------------------------Get Method----------------------------------------------

    public boolean getContainsFragileContent() {return containsFragileContent;}

    //----------------------------------Set Method----------------------------------------------
    public void setContainsFragileContent(boolean fragile) {
        containsFragileContent = fragile;
    }

    //----------------------------------To String-----------------------------------------------
    public String toString() {
        return String.format("Receiver: %s, Sender: %s, Weight: %.2fkg, Cost: %.2fkr, Contains fragile content? : %s", getReceiver(),
                getSender(), getWeight(), getCost(), containsFragileContent);
    }
}
