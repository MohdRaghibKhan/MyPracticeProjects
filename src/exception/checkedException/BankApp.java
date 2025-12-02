package exception.checkedException;
public class BankApp {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(100.0);

        try {
            account.withdraw(150.0); // This will trigger the exception
        } catch (InsufficientFundsException e) {
            System.out.println("Error: " + e.getMessage());
        }

        // Trying a valid withdrawal
        try {
            account.withdraw(50.0); // This should succeed
        } catch (InsufficientFundsException e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("Final balance: " + account.getBalance());
    }
}
