package design_patterns.factory_methods;


interface Shape{
	void draw();
}

class Circle implements Shape{
	@Override
	public void draw() {
		System.out.println("Draw a Circle");
		
	}
}

class Rectangle implements Shape{
	@Override
	public void draw() {
		System.out.println("Draw a Rectangle");
		
	}
}

class Square implements Shape{
	@Override
	public void draw() {
		System.out.println("Draw a Square");
		
	}
}

class ShapeFactory{
	public Shape getShape(String shape) {
		
		if(shape==null) {
		return null;
		}
		if(shape.equalsIgnoreCase("circle")) {
			return new Circle();
		}else if(shape.equalsIgnoreCase("rectangle")) {
			return new Rectangle();
		}else if(shape.equalsIgnoreCase("square")) {
			return new Square();
		}
		return null;
	}
}

public class Factory_Method {
	public static void main(String[] args) {
		ShapeFactory factory=new ShapeFactory();
		Shape circle = factory.getShape("CIRCLE");
		circle.draw();
		Shape rectangle = factory.getShape("RECTANGLE");
		rectangle.draw();
		Shape square = factory.getShape("SQUARE");
		square.draw();
	}
}
/*
 * Summary of Key Points Factory Method pattern allows a class to delegate the
 * responsibility of creating objects to a factory.
 * It hides the object creation logic from the client.
 * This pattern improves maintainability and  extensibility of code by adhering to the
 * Open/Closed Principle (easy to extend without modifying existing code).
 * Open/Closed Principle (a rule that says your code should be open for extension but closed for modification).
 * 
 */
