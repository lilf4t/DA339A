package model.Accounts;

public class CurrentAccount extends Account {
    private String organisationNumber;

    public String getOrganisationNumber() {
        return organisationNumber;
    }

    public void setOrganisationNumber(String organisationNumber) {
        this.organisationNumber = organisationNumber;
    }

    public String toString() {
        return String.format("%s Organisationsnummer: %s", super.toString(), organisationNumber);
    }
}