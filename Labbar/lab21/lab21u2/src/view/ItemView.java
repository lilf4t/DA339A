package view;

import controller.Controller;

public class ItemView {
    private Controller controller;

    public ItemView(Controller controller) {
        this.controller = controller;
    }

    //Create Letter, attribut: antal stamps
    public int createLetter() {
        int stamps;
        System.out.println("How many stamps would you like to add?");
        stamps = Utilities.getInteger(0, 5);
        return stamps;
    }

    //Creat postcard, attribut: datum
    public String createPostCard() {
        String date;
        System.out.println("Enter todays date:");
        date = Utilities.getString();
        return date;
    }

    //Frågar efter vikt, påverkar pris (if satser finns i controller)
    public void smallItemInfo() {
        System.out.println("Enter the items weight in grams:");
        double weight = Utilities.getDouble();
        controller.setSmallItemInfo(weight);
    }

    public void bigItemInfo() {
        System.out.println("Enter the items weight in kilograms:");
        double weight = Utilities.getDouble();
        controller.setBigItemInfo(weight);
    }

    public double getParcelLength() {
        System.out.println("Enter the parcels length in cm:");
        return Utilities.getDouble();
    }

    public double getParcelWidth() {
        System.out.println("Enter the parcels width in cm:");
        return Utilities.getDouble();
    }

    public double getParcelHeight() {
        System.out.println("Enter the parcels height in cm: ");
        return Utilities.getDouble();
    }
    public boolean getPackageFragility() {
        boolean answer = false;
        System.out.println("Does the package contain fragile content? Write Y for yes");
        String text = Utilities.getString();
        answer = text.equals("Yes") || text.equals("Y") || text.equals("y");
        return answer;
    }
    public String getRecieverFirstName() {
        System.out.println("Please enter the receivers first name: ");
        return Utilities.getString();
    }

    public String getRecieverLastName() {
        System.out.println("Please enter the receivers last name: ");
        return Utilities.getString();
    }

    public String getRecieverAddress() {
        System.out.println("Please enter the receivers address: ");
        return Utilities.getString();
    }

    public String getRecieverCity() {
        System.out.println("Please enter the receivers city: ");
        return Utilities.getString();
    }

    public String getRecieverZIP() {
        System.out.println("Please enter the receivers ZIP-code: ");
        return Utilities.getString();
    }

    public String getRecieverCountry() {
        System.out.println("Please enter the receivers country: ");
        return Utilities.getString();
    }

    public String getSendersFirstName() {
        System.out.println("Please enter the senders first name: ");
        return Utilities.getString();
    }

    public String getSendersLastName() {
        System.out.println("Please enter the senders last name: ");
        return Utilities.getString();
    }

    public String getSendersAddress() {
        System.out.println("Please enter the senders address: ");
        return Utilities.getString();
    }

    public String getSendersCity() {
        System.out.println("Please enter the senders city: ");
        return Utilities.getString();
    }

    public String getSendersZIP() {
        System.out.println("Please enter the senders ZIP-code: ");
        return Utilities.getString();
    }

    public String getSendersCountry() {
        System.out.println("Please enter the senders country: ");
        return Utilities.getString();
    }

}
