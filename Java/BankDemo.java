abstract class BankAccount {
    protected double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    // Abstract method to calculate interest
    public abstract void calculateInterest();
}

// SavingsAccount with interest calculation
class SavingsAccount extends BankAccount {
    private double interestRate;

    public SavingsAccount(double balance, double interestRate) {
        super(balance);
        this.interestRate = interestRate;
    }

    @Override
    public void calculateInterest() {
        double interest = balance * (interestRate / 100);
        balance += interest;
        System.out.println("Savings Account Interest Added: " + interest);
        System.out.println("New Balance: " + balance);
    }
}

// CurrentAccount without interest
class CurrentAccount extends BankAccount {
    public CurrentAccount(double balance) {
        super(balance);
    }

    @Override
    public void calculateInterest() {
        System.out.println("Current Account has no interest.");
    }
}

// Main class to test functionality
public class BankDemo {
    public static void main(String[] args) {
        SavingsAccount savings = new SavingsAccount(1000, 5); // 5% interest rate
        CurrentAccount current = new CurrentAccount(2000);

        savings.calculateInterest();
        current.calculateInterest();
    }
}
