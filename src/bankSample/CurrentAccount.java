
package bankSample;

public class CurrentAccount implements Account {
    private double balance;
    public CurrentAccount(double initialDeposit) {
        this.balance = initialDeposit;
      }

    @Override
    public void deposit(double amount) {
             balance += amount;
             }
    @Override
    public void withdraw(double amount) {
    	  balance -=amount;
             }

    @Override

    public double getBalance() {

        return balance;

    }


    public double calculateInterest() {
         balance += balance * 0.5 / 100;
            return balance;

            }



}


