package design_patterns.Behavioral;

interface PaymentStrategy{
	void pay(Double amount);
}
class CreditCardPayment implements PaymentStrategy{
	String cardNumber;
	public CreditCardPayment(String cardNumber) {
		this.cardNumber=cardNumber;
	}
	
	@Override
	public void pay(Double amount) {
		System.out.println(amount +" : Amount is paid by this card number : "+cardNumber);
		
	}
	
}

class PaypalPayment implements PaymentStrategy{

	String email;
	
	public PaypalPayment(String email) {
		this.email=email;
	}
	@Override
	public void pay(Double amount) {
		System.out.println(amount +" : Amount is paid by this emial : "+email);
	}
}

public class StrategyPattern {
	PaymentStrategy paymentStrategy;
	
	public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
		this.paymentStrategy = paymentStrategy;
	}
	
	public void checkout(Double amount) {
		paymentStrategy.pay(amount);
	}
	
	
	public static void main(String[] args) {
		StrategyPattern strategyPattern=new StrategyPattern();
		strategyPattern.setPaymentStrategy(new CreditCardPayment("123456789"));
		strategyPattern.checkout(500.00);
		
		strategyPattern.setPaymentStrategy(new PaypalPayment("raghib@gamil.com"));
		strategyPattern.checkout(1000.00);
		
	}
}
