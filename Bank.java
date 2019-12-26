package BuySmart;

public class Bank {

    private double balance;

    public Bank(double amount)
    {
        this.balance = amount;
    }

    public void deposit(double value)
    {
        this.balance = this.balance + value;
    }

    public void withdraw (double value)
    {
        this.balance = this.balance - value;
    }

    public double getBalance()
    {
        return this.balance;
    }

}
