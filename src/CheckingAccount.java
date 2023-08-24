public class CheckingAccount extends Account {
    private int overDraftLimit;

    public CheckingAccount(int accountNumber, String accountHolder, double balance, int overDraftLimit) {
        super(accountNumber, accountHolder, balance);
        this.overDraftLimit = overDraftLimit;

    }

    public boolean withdraw(int amount) {
        if ((getBalance() < -overDraftLimit)) {
            System.out.println("Over Draft Limit has been exceed");
            return false;
        }

        setBalance(getBalance() - amount);
        return true;
    }

    public int getOverDraftLimit() {
        return overDraftLimit;
    }

    public void setOverDraftLimit(int overDraftLimit) {
        this.overDraftLimit = overDraftLimit;
    }


    }


