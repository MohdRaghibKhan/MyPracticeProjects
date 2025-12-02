package exception.checkedException;

public class InsufficientFundsException extends Exception {
	// Default constructor
	public InsufficientFundsException() {
		super("Insufficient funds in the account.");
	}

	// Constructor with a custom message
	public InsufficientFundsException(String message) {
		super(message);
	}

	// Constructor with a custom message and cause
	public InsufficientFundsException(String message, Throwable cause) {
		super(message, cause);
	}
}
