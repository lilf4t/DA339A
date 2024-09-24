package view;
import controller.Controller;

public class MainView {
    private Controller controller;
    CustomerView customerView;
    AccountView accountView;

    public MainView(Controller controller) {
        this.controller = controller;
        customerView = new CustomerView(controller);
        accountView = new AccountView(controller);
    }
    public int showMenu() {
        int choice = 0;

        Utilities.padChars('*', 40);
        System.out.println("Välkommen till Bank System!");
        System.out.println("[0] Avbryt");
        System.out.println("[1] Registrera ny kund");
        System.out.println("[2] Visa alla kunder");
        System.out.println("[3] Ta bort kund");
        System.out.println("[4] Skapa ett nytt konto");
        System.out.println("[5] Ta bort konto");
        System.out.println("[6] Visa konto information");
        choice = Utilities.getInteger(0, 6);

        return choice;
    }

    public void displayACustomerInfo(String[] infoStrings) {
        for (int i = 0; i < infoStrings.length; i++)
            System.out.println(infoStrings[i]);
    }

    public void displayAccountInfo(String[] infoStrings) {
        System.out.println("Visar alla konton: ");
        for (String infoString : infoStrings)
            System.out.println(infoString);
    }

    public void readCustomerInfo() {
        customerView.readCustomerInfo();
    }

    public void showMessage(String message) {
        System.out.println(message);
    }

    public void deleteCustomerInfo() {customerView.removeCustomerInfo();
    }

    public void specifyAccounts() {
        accountView.specifyAccount();
    }

    public void readAccountInfo(int choice) {
        accountView.readAccountInfo(choice);
    }

    public void deleteAccountInfo() {
        accountView.deleteAccountInfo();
    }


}

