public class Account {
    private int accountNumber;
    private String accountHolder;
    private double balance;

    public Account(int accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }



    public boolean deposit(int amount) {
        if (amount == 0) {
            System.out.println("Invalid Amount");
            return false;
        }
        balance-=amount;
        return  true;
    }
    public boolean withdraw(int amount){
        if (amount > balance) {
            System.out.println("Insufficient balance");
            return false;
        }
        balance += amount;
        return true;
    }


    public void getInfo(){
            System.out.println("Account Number = " + accountNumber +'\n'+
                    "Account Holder Name=" + accountHolder + '\n'+
                    "Balance = " + balance);
        }



    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}