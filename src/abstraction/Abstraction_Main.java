package abstraction;

public class Abstraction_Main {
	public static void main(String[] args) {
		CoffeeMaker coffeeMaker=new CoffeeMaker();
		coffeeMaker.addIngredients(4, 1);
		coffeeMaker.makeCoffee();
		System.out.println("Coffee Delivered");
	}
}
