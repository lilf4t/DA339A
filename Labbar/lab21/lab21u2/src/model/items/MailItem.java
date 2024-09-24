package model.items;

import model.items.IMail;
import model.person.Receiver;
import model.person.Sender;

public class MailItem implements IMail {
    private Receiver receiver;
    private Sender sender;
    private double weight;
    private double cost;

    //----------------------------------Get method----------------------------------------------
    public Receiver getReceiver() {
        return receiver;
    }
    public Sender getSender() {
        return sender;
    }
    public double getWeight() {
        return weight;
    }
    public double getCost() {return cost;}

    //----------------------------------Set method----------------------------------------------
    public void setReceiver(Receiver receiver) {this.receiver = receiver;}
    public void setSender(Sender sender) {this.sender = sender;}
    public void setWeight(double weight) {this.weight = weight;}
    public void setCost(double cost) {this.cost = cost;}
}
