package model.Accounts;

public class PensionAccount extends SavingsAccount {
    private final double minBalance;
    private final int withdrawalAgeLimit;
    private int withdrawalStart;

    public PensionAccount() {
        minBalance = 0;
        withdrawalAgeLimit = 55;
    }

    public int getWithdrawalStart() {
        return withdrawalStart;
    }

    public void setWithdrawalStart(int withdrawalStart) {
        this.withdrawalStart = withdrawalStart;
    }

    public String toString() {
        return String.format(
                "Kontonummer: %s, Saldo: %.2fKR, Minimum saldo: %.2fKR, Åldersgräns för uttag: %d, " +
                        "Ålder när man startat första uttag: %d",
                getNumber(), getBalance(), minBalance, withdrawalAgeLimit, withdrawalStart);
    }
}
