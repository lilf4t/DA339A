package model.Accounts;

public class AccountManager {

    private int nbrOfAccounts;
    private Account[] accounts;


    public AccountManager(int maxAccounts) {
        this.nbrOfAccounts = 0;
        this.accounts = new Account[maxAccounts];
    }

    public int getNbrOfAccounts() {
        return nbrOfAccounts;
    }

    //Add account
    public boolean addAccount(Account account) {
        boolean ok;

        //om konto ej är tomt och antalet konton är mindre än array längden, så ska array[i] sparas i konto
        if (nbrOfAccounts < accounts.length && account != null) {
            ok = true;
            accounts[nbrOfAccounts] = account;
            // visar index
            account.setNumber(nbrOfAccounts);
            nbrOfAccounts++;
        } else
            ok = false;
        return ok;
    }

    //Remove account
    public boolean removeAccount(int i) {
        boolean ok = true;
        if (i >= 0 && i < accounts.length && accounts[i] != null) {
            accounts[i] = null;
            nbrOfAccounts--;
            moveToLeft(i);
        } else {
            ok = false;
        }
        return ok;
    }

    //move to left
    private void moveToLeft(int index) {

        for (int i = index + 1; i < accounts.length; i++) {
            accounts[i - 1] = accounts[i];
        }
        accounts[accounts.length - 1] = null;
    }

    //get info strings
    public String[] getInfoStrings() {
        String[] infoStrings = new String[nbrOfAccounts];
        for (int i = 0; i < infoStrings.length; i++) {
            infoStrings[i] = accounts[i].toString();
        }
        return infoStrings;
    }

}
