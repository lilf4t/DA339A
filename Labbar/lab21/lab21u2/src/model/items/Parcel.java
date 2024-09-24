package model.items;

public class Parcel extends MailItem{

    //ToDO: En parcel är en package, har inte samma storlek, den längsta sidan måste vara measured

    //----------------------------------Instance Variables---------------------------------------
    private Size size;

    //----------------------------------Constructor----------------------------------------------

    public Parcel() {
    }
    public Parcel(Size size) {
        this.size = size;
    }

    //----------------------------------Get Method----------------------------------------------
    public Size getSize() {return size;}

    //----------------------------------Set Method----------------------------------------------
    public void setSize(Size size) {this.size = size;}

    //----------------------------------To String-----------------------------------------------
    @Override
    public String toString() {
        return String.format("Receiver: %s, Sender: %s, Weight: %.2f Kg, Cost: %.2f Kr, Size: %s", getReceiver(),
                getSender(), getWeight(), getCost(), size);
    }
}
