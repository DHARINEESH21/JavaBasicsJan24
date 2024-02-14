
package bankSample;

public class BankDriver {

    public static void main(String[] args) {

        Bank bank = new Bank();

        SavingAccount savingsAccount = new SavingAccount(5700.0, 1080.0);

        CurrentAccount currentAccount = new CurrentAccount(6800.0);

          bank.addAccount(savingsAccount);

        bank.addAccount(currentAccount);

        System.out.println("Amount in Savings Account before depositing Amount:" +savingsAccount.getBalance());

        System.out.println("Amount in current Account before depositing Amount:"+currentAccount.getBalance());

        System.out.println("Now deposit 500 Savings Account.");

          savingsAccount.deposit(500.0);

          System.out.println(savingsAccount.getBalance());

        System.out.println("Now deposit 600 Current Account");

        currentAccount.deposit(600.0);

        System.out.println(currentAccount.getBalance());

         System.out.println("Withdraw 100 from Savings Account");

         savingsAccount.withdraw(100.0);

       System.out.println(savingsAccount.getBalance());

       System.out.println("Withdraw 100 from Current Account");

       currentAccount.withdraw(100.0);

        System.out.println(currentAccount.getBalance());

        System.out.println("After applying interest");

        System.out.println(savingsAccount.calculateInterest());

        System.out.println("After applying interest");

        System.out.println(currentAccount.calculateInterest());

    }

}
