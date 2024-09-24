package view;

import controller.Controller;
import model.person.Address;
import model.person.Receiver;
import model.person.Sender;

public class MainView {

    private Controller controller;
    private ItemView itemView;


    public MainView(Controller controller) {
        this.controller = controller;
        itemView = new ItemView(controller);
    }

    public int showMenu() {
        int choice = 0;

        Utilities.padChars('=', 40);
        System.out.println("What would you like to send?");
        System.out.println("[1] Letter");
        System.out.println("[2] Postcard");
        System.out.println("[3] Parcel");
        System.out.println("[4] Package");
        System.out.println("[0] Exit");

        choice = Utilities.getInteger(0, 4);

        return choice;
    }

    public int createLetter() {
        return itemView.createLetter();
    }

    public String createPostCard() {return itemView.createPostCard();}

    public double getParcelLength() {
        return itemView.getParcelLength();
    }

    public double getParcelWidth() {
        return itemView.getParcelWidth();
    }

    public double getParcelHeight() {
        return itemView.getParcelHeight();
    }

    public boolean getPackageFragility() {
        return itemView.getPackageFragility();
    }

    public void getSmallItemInfo() {itemView.smallItemInfo();}

    public void getBigItemInfo() {
        itemView.bigItemInfo();
    }

    public void showMessage(String text) {
        System.out.println(text);
    }

    public Receiver getReciever() {
        Receiver receiver = new Receiver();
        Address address = new Address();

        receiver.setFirstName(itemView.getRecieverFirstName());
        receiver.setLastName(itemView.getRecieverLastName());

        address.setStreet(itemView.getRecieverAddress());
        address.setCity(itemView.getRecieverCity());
        address.setZipCode(itemView.getRecieverZIP());
        address.setCountry(itemView.getRecieverCountry());
        receiver.setAddress(address);

        return receiver;
    }

    public Sender getSender() {
        Sender sender = new Sender();
        Address address = new Address();

        sender.setFirstName(itemView.getSendersFirstName());
        sender.setLastName(itemView.getSendersLastName());

        address.setStreet(itemView.getSendersAddress());
        address.setCity(itemView.getSendersCity());
        address.setZipCode(itemView.getSendersZIP());
        address.setCountry(itemView.getSendersCountry());
        sender.setAddress(address);

        return sender;
    }


}
