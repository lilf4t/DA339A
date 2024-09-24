package model.Accounts;

public abstract class Account implements IAccount {
    private int number;
    private double balance;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }


    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String toString() {
        return String.format("Kontonummer: %s, Saldo: %.2fKR", number, balance);
    }
}