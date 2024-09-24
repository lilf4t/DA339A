package model.Accounts;

public class SavingsAccount extends Account {
    private double savingInterest;
    private final double minBalance;
    private final int maxWithdrawalPerYear;

    public double getSavingInterest() {
        return savingInterest;
    }

    public void setSavingInterest(double savingInterest) {
        this.savingInterest = savingInterest;
    }

    public SavingsAccount() {
        minBalance = 100;
        maxWithdrawalPerYear = 5;
    }

    public String toString() {
        return String.format("%s Sparränta: %.2f%% , Minimum saldo: %.2fKR, Max uttag per år: %d",
                super.toString(), savingInterest, minBalance, maxWithdrawalPerYear);
    }

}