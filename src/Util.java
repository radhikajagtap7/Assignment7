public class Util {
    public static void processAccounts(Account[]accounts){
        for (Account account:accounts){
            if(account instanceof SavingAccount){
                account.deposit(500);
            } else if (account instanceof CheckingAccount) {
                account.deposit(200);

            }
        }
    }
}
