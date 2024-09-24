package model;

public class Customer {

    private int customerNumber;
    private String firstName;
    private String lastName;
    private String personnr;

    public int getCustomerNumber() {return customerNumber;}
    public void setCustomerNumber(int customerNumber) {this.customerNumber = customerNumber;}

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPersonnr() {
        return personnr;
    }

    public void setPersonnr(String personnr) {
        this.personnr = personnr;
    }

    public String toString() {
        return String.format("Kundnummer: %s,  Förnamn: %s, Efternamn: %s, Personnummer: %s", customerNumber, firstName, lastName, personnr);
    }
}