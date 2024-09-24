package view;

import controller.Controller;

import java.util.Scanner;

public class CustomerView {
    Controller controller;

    public CustomerView(Controller controller) {
        this.controller = controller;
    }


    //Om användaren väljer alt 1
    public void readCustomerInfo() {
        System.out.println("Du valde att registrera en ny kund");
        System.out.println("Ange personnummer: ");
        String text = Utilities.getString();
        controller.setPersonnr(text);

        System.out.println("Ange förnamn: ");
        text = Utilities.getString();
        controller.setFirstName(text);;

        System.out.println("Ange efternamn: ");
        text = Utilities.getString();
        controller.setLastName(text);
    }

    public void removeCustomerInfo() {
        System.out.println("Du valde att ta bort en kund");
        System.out.println("Ange index för kund du vill radera");
        Scanner user = new Scanner(System.in);
        int i = user.nextInt();
        controller.deleteCustomer(i);
    }
}
