package design_patterns.structuralPattern;

interface Coffee {
	Double cost();

	String description();
}

class PlainCoffee implements Coffee {
	@Override
	public Double cost() {
		return 5.0;
	}

	@Override
	public String description() {
		return "Simple Coffee";
	}
}

abstract class CoffeeDecorator implements Coffee {

	protected Coffee decoratedCoffee;

	public CoffeeDecorator(Coffee coffee) {
		this.decoratedCoffee = coffee;
	}
}

class MilkCoffee extends CoffeeDecorator {

	public MilkCoffee(Coffee coffee) {
		super(coffee);
	}

	@Override
	public Double cost() {
		return decoratedCoffee.cost() + 1;
	}

	@Override
	public String description() {
		return decoratedCoffee.description() + " , Milk";
	}
	

}

class SugarCoffee extends CoffeeDecorator {

	public SugarCoffee(Coffee coffee) {
		super(coffee);

	}

	@Override
	public Double cost() {
		return decoratedCoffee.cost() + 1;
	}

	@Override
	public String description() {
		return decoratedCoffee.description() + " , Sugar";
	}

}

public class DecoratorPattern {

	public static void main(String[] args) {

		Coffee plainCoffee = new PlainCoffee();
		System.out.println("Description: " + plainCoffee.description());
	     System.out.println("Cost: ₹" + plainCoffee.cost());  
	     
		plainCoffee=new MilkCoffee(plainCoffee);
		System.out.println("Description: " + plainCoffee.description());
	     System.out.println("Cost: ₹" + plainCoffee.cost());  
	     
		plainCoffee=new SugarCoffee(plainCoffee);
		 System.out.println("Description: " + plainCoffee.description());
	     System.out.println("Cost: ₹" + plainCoffee.cost());   
	}

}
