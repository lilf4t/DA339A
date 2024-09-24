package controller;

import model.Accounts.*;
import model.Customer;
import model.CustomerManager;
import view.MainView;


public class Controller {

    private MainView view;
    private CustomerManager model;
    private AccountManager model2;
    private Customer currCustomer;
    private Account currAccount = new CurrentAccount();


    public Controller() {
        final int maxCustomers = 100;
        final int maxAccounts = 5;
        model = new CustomerManager(maxCustomers);
        model2 = new AccountManager(maxAccounts);

        view = new MainView(this);

        showMenu();
    }

    private void showMenu() {
        int choice = 0;
        do {
            choice = view.showMenu();

            switch (choice) {
                case 0:
                    view.showMessage("Välkommen åter!");
                    break;
                case 1:
                    currCustomer = new Customer();
                    view.readCustomerInfo();
                    addNewCustomer();
                    break;
                case 2:
                    view.displayACustomerInfo(model.getInfoStrings());
                    break;
                case 3:
                    view.deleteCustomerInfo();
                    break;
                case 4:
                    view.specifyAccounts();
                    break;
                case 5:
                    view.deleteAccountInfo();
                    break;
                case 6:
                    view.displayAccountInfo(model2.getInfoStrings());
                    //view.displayACustomerInfo(model.getInfoStrings());
                    break;
                default:
                    view.showMessage("Inte klar");
                    break;
            }

        } while (choice != 0);

    }

    public void setPersonnr(String personnr) {
        if (currCustomer == null)
            currCustomer = new Customer();
        currCustomer.setPersonnr(personnr);
    }

    public void setFirstName(String firstName) {
        if (currCustomer == null)
            currCustomer = new Customer();
        currCustomer.setFirstName(firstName);
    }
    public void setLastName(String lastName) {
        if ( currCustomer == null)
            currCustomer = new Customer();
        currCustomer.setLastName(lastName);
    }

    public void addNewCustomer() {
        boolean ok = model.addCustomer(currCustomer);
        if (ok)
            view.showMessage("Ny kund registrerad!");
        else {
            view.showMessage("Kunden kunde inte registreras!");
        }

    }

    public void deleteCustomer(int i) {
        boolean ok = model.removeCustomer(i);
            if (ok)
                view.showMessage("Kund är borrtagen.");
            else {
                view.showMessage("Kunden kan inte tas bort.");
            }

    }

    public void typeOfAccount(int choice) {
        switch (choice) {
            case 1:
                currAccount = new CurrentAccount();
                view.readAccountInfo(choice);
                addNewAccount();
                break;
            case 2:
                currAccount = new SavingsAccount();
                view.readAccountInfo(choice);
                addNewAccount();
                break;
            case 3:
                currAccount = new PensionAccount();
                view.readAccountInfo(choice);
                addNewAccount();
                break;
            case 4:
                currAccount = new SalaryAccount();
                view.readAccountInfo(choice);
                addNewAccount();
                break;
            case 5:
                currAccount = new CreditCardAccount();
                view.readAccountInfo(choice);
                addNewAccount();
                break;
            default:
                view.showMessage("Vänligen ange 1-5");
                break;
        }
    }

    public void addNewAccount() {
        boolean ok = model2.addAccount(currAccount);
        if (ok) {
            view.showMessage("Ny kund har registrerats!");
        } else {
            view.showMessage("Kunde kunde inte registreras.");
        }
    }

    public void deleteAccount(int i) {
        boolean ok = model2.removeAccount(i);
        if (ok) {
            view.showMessage("Konto är borttaget!");
        } else {
            view.showMessage("Kontot kunde inte tas bort.");
        }
    }

    public void setEmployerName(String employerName) {
        if (employerName != null)
            ((SalaryAccount)currAccount).setEmployerName(employerName);
    }

    public void setOrgNbr(String orgNbr) {
        if (orgNbr != null)
            ((CurrentAccount)currAccount).setOrganisationNumber(orgNbr);
    }

    public void setSaveInt(double interest) {
        if (interest >= 0)
            ((SavingsAccount)currAccount).setSavingInterest(interest);
    }

    public void setCreditLimit(Double limit) {
        if (limit > 0)
            ((CreditCardAccount)currAccount).setMinusBalanceLimit(limit);
    }

    public void setStartBalance(Double balance) {
        if (balance >= 0)
            currAccount.setBalance(balance);
    }
}