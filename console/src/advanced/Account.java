package advanced;

/**
 * @author William
 */
public class Account {
    private double balance;

    public double getBalance() {
        return balance;
    }

    public void setBalance(double value) {
        this.balance = value;
    }

    public synchronized void update(double tax) {
        this.balance *= (1 + tax);
    }

    public synchronized void deposit(double value) {
        this.balance += value;
    }
}