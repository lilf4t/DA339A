package model.Accounts;

public class CreditCardAccount extends Account {
    private double creditInterest;
    private double minusBalanceLimit;

    public CreditCardAccount() {
        creditInterest = 8;
    }

    public double getCreditInterest() {
        return creditInterest;
    }

    public void setCreditInterest(double creditInterest) {
        this.creditInterest = creditInterest;
    }

    public double getMinusBalanceLimit() {
        return minusBalanceLimit;
    }

    public void setMinusBalanceLimit(double minusBalanceLimit) {
        this.minusBalanceLimit = minusBalanceLimit;
    }

    @Override
    public String toString() {
        return String.format("%s Kreditkort ränta: %.2f%% Maximal minussaldo: %.2fKR", super.toString(), creditInterest,
                minusBalanceLimit);
    }
}