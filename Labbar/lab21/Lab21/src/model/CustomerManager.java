package model;

public class CustomerManager {
    private int nbrOfCustomers;
    private Customer[] customers;

    public CustomerManager(int maxCustomers) {
        nbrOfCustomers = 0;
        customers = new Customer[maxCustomers];
    }

    public String[] getInfoStrings() {
        String[] infoStrings = new String[nbrOfCustomers];
        for (int i = 0; i < infoStrings.length; i++) {
            infoStrings[i] = customers[i].toString();
        }
        return infoStrings;
    }

    public boolean addCustomer(Customer customer) {
        boolean ok;
        if (customer != null && nbrOfCustomers != customers.length) {
            ok = true;
            customers[nbrOfCustomers] = customer;
            //visar index
            customer.setCustomerNumber(nbrOfCustomers);
            nbrOfCustomers++;
        } else
            ok = false;
            System.out.println("Max antal kunder uppnåd");
        return ok;
    }

    public boolean removeCustomer(int i) {
        boolean ok = true;
        if (i >= 0 && i < customers.length && customers[i] != null) {
            customers[i] = null;
            nbrOfCustomers--;
            moveToLeft(i);
        } else {
            ok = false;
        }
        return ok;
    }

    private void moveToLeft(int index) {
        for (int i = index + 1; i < customers.length; i++) {
            customers[i - 1] = customers[i];
        }
        customers[customers.length - 1] = null;
    }

}
