package view;

import controller.Controller;
import java.util.Scanner;

public class AccountView {
    private final Controller controller;
    private final Scanner user = new Scanner(System.in);

    public AccountView(Controller controller) {
        this.controller = controller;
    }

    public void specifyAccount() {
        System.out.println("Skapa ett nytt konto!");
        System.out.println("Välj vilken typ av konto du vill skapa: ");
        System.out.println("[1] Företag konto");
        System.out.println("[2] Spar konto");
        System.out.println("[3] Pension konto");
        System.out.println("[4] Lön konto");
        System.out.println("[5] Kreditkort konto");

        int choice = user.nextInt();
        controller.typeOfAccount(choice);
    }

    public void readAccountInfo(int choice) {
        System.out.println("Ange startbelopp: ");
        double balance = user.nextDouble();
        controller.setStartBalance(balance);

        switch (choice) {
            case 1:
                System.out.println("Ange organisationsnummer: ");
                String orgNbr = Utilities.getString();
                controller.setOrgNbr(orgNbr);
                break;
             case 2:
                System.out.println("Ange sparränta: ");
                double sInt = user.nextDouble();
                controller.setSaveInt(sInt);
                break;
            case 4:
                System.out.println("Ange employer name: ");
                String empName = Utilities.getString();
                controller.setEmployerName(empName);
                break;
              case 5:
                System.out.println("Ange minimum saldo: ");
                Double limit = user.nextDouble();
                controller.setCreditLimit(limit);
                break;
        }
    }

    public void deleteAccountInfo() {
        System.out.println("Du valde att ta bort ett konto!");
        System.out.println("Ange index: ");
        int index = user.nextInt();
        controller.deleteAccount(index);
    }

}