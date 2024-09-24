package model.Accounts;

public class SalaryAccount extends Account {
    private String employerName;

    public String getEmployerName() {
        return employerName;
    }

    public void setEmployerName(String employerName) {
        this.employerName = employerName;
    }

    public String toString() {
        return String.format("%s Employer name: %s", super.toString(), employerName);
    }

}