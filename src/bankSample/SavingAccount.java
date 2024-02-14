package bankSample;

public class SavingAccount implements Account {

    private double balance;
    private double interestRate;
    private double interest;

    public SavingAccount(double initialDeposit, double interestRate) {// Constructor
        this.balance = initialDeposit;
        this.interestRate = interestRate;
    }


    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        balance -= amount;
    }

    public double getBalance() {
        return balance;

    }


      public double calculateInterest() {
// TODO Auto-generated method stub

       balance += balance * interestRate / 100;
       return balance;

      }





}




