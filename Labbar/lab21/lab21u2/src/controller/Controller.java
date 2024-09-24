package controller;

import model.items.*;
import model.items.Package;
import view.MainView;

public class Controller {

    /* dynamisk bindning exempel
    MailItem j = new PostCard();
    ((PostCard)j).    för att komma åt j så skriver vi så
    */

    private MainView view;
    private MailItem item;
    private Size size;

    public Controller() {
        view = new MainView(this);
        showMenu();
    }
    private void showMenu() {
        int choice;

        do {
            choice = view.showMenu();

            switch (choice) {
                case 1:
                    view.showMessage("Sending letter");
                    item = new Letter(view.createLetter());
                    view.getSmallItemInfo();
                    item.setReceiver(view.getReciever());
                    item.setSender(view.getSender());
                    view.showMessage(item.toString());
                    break;
                case 2:
                    view.showMessage("Sending postcard");
                    item = new PostCard(view.createPostCard());
                    view.getSmallItemInfo();
                    item.setReceiver(view.getReciever());
                    item.setSender(view.getSender());
                    view.showMessage(item.toString());
                    break;
                case 3:
                    view.showMessage("Sending parcel");
                    item = new Parcel(setSize());
                    view.getBigItemInfo();
                    item.setReceiver(view.getReciever());
                    item.setSender(view.getSender());
                    view.showMessage(item.toString());
                    break;
                case 4:
                    view.showMessage("Sending package");
                    item = new Package(question());
                    view.getBigItemInfo();
                    item.setReceiver(view.getReciever());
                    item.setSender(view.getSender());
                    view.showMessage(item.toString());
                    break;
                case 0:
                    view.showMessage("Exiting");
                    break;
            }
        } while (choice != 0);
    }
    public Size setSize() {
        size = new Size(view.getParcelLength(), view.getParcelWidth(), view.getParcelHeight());
        return size;
    }

    public boolean question() {
        return view.getPackageFragility();
    }

    //för letter och postcard
    public void setSmallItemInfo(double weight) {
        item.setWeight(weight);
        if (weight <= 50)
            item.setCost(10);
        else if (weight <= 100)
            item.setCost(20);
        else if (weight <= 150)
            item.setCost(30);
        else
            item.setCost(40);
    }

    //för package och parcel
    public void setBigItemInfo(double weight) {
        item.setWeight(weight);
        if (weight <= 3)
            item.setCost(150);
        else if (weight <= 5)
            item.setCost(170);
        else if (weight <= 10)
            item.setCost(210);
        else
            item.setCost(250);
    }
}
