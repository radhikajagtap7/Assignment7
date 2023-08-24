public class Main {
    public static void main(String[] args) {

        Account [] a = new Account [4];
        a[0] = new SavingAccount(135777,"RR",3000,4);
        a[1] = new SavingAccount(8348,"TT",7000,2);
        a[2] = new SavingAccount(8348,"JJ",5000,6);
        a[3] = new SavingAccount(8348,"KK",7070,3);


        Util.processAccounts(a);

        a[0].getInfo();
        System.out.println("...............................................");

        a[1].withdraw(300);
        a[1].getInfo();
        a[3].withdraw(200);
        a[3].getInfo();




    }
}