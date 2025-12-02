package design_patterns.structuralPattern;

//our application supports
interface PaymentProcessor{
	void pay(int amount);
}
// OUR PAYMENT method
class GpayGateway implements PaymentProcessor{

	@Override
	public void pay(int amount) {
        System.out.println("Paid " + amount + " USD using Stripe.");
	}
}
public class Payment_AdapterPattern {
	public static void main(String[] args) {
		PaymentProcessor paymentProcessor= new GpayGateway();
		paymentProcessor.pay(1000);
		
		PaypalGateway paypalGateway=new PaypalGateway();
		PaymentProcessor paypalProcessor=new PaypalAdapter(paypalGateway);
		paypalProcessor.pay(20000);
	}
	
}
//incompatible gateway
class PaypalGateway{

	public void payPalPay(String currency, int amount) {
        System.out.println("Paid " + amount + " " + currency + " using PayPal.");
	}
}
// adapter to work with two incompatible interface
class PaypalAdapter implements PaymentProcessor{ 
	
	PaypalGateway gateway;
	
	public PaypalAdapter(PaypalGateway paypalGateway) {
		this.gateway=paypalGateway;
	}

	@Override
	public void pay(int amount) {
		gateway.payPalPay("USD", amount);
	}
}
