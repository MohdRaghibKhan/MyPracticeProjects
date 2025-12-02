package abstraction;
// we can achieve abstraction in single class using private variables & public methods to access them & one method to displaying method implemention
// is done in this class when we call these method all implementation is hidden from user 
public class BankAccount {
    private double balance;
    private String accountNumber;
    
    // Constructor
    public BankAccount(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    // Public method to deposit money
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    // Public method to withdraw money
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew: " + amount);
        } else {
            System.out.println("Insufficient funds or invalid amount.");
        }
    }

    // Public method to check the balance
    public double getBalance() {
        return balance;
    }

    // Public method to get account details
    public String getAccountDetails() {
        return "Account Number: " + accountNumber + ", Balance: " + balance;
    }

    // Private method (internal detail) to calculate interest (not exposed)
    private double calculateInterest(double rate) {
        return balance * rate / 100;
    }

    // Public method to apply interest
    public void applyInterest(double rate) {
        double interest = calculateInterest(rate);
        balance += interest;
        System.out.println("Applied interest: " + interest);
    }
}
