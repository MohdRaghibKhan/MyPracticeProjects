package design_patterns;

interface Prototype {
	Prototype clone();
}

class Point{
	private int x,y;

	
	public Point(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
}
//  deep cloning
class Circle implements Prototype {
	private int radius;
	private String color;
	private Point center;
	public Circle(int radius, String color, Point center) {
		super();
		this.radius = radius;
		this.color = color;
		this.center = center;
	}

	public Prototype clone() {
		return new Circle(this.radius, this.color,this.center);
	}
	
	public int getRadius() {
		return radius;
	}
	public void setRadius(int radius) {
		this.radius = radius;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public Point getCenter() {
		return center;
	}
	public void setCenter(Point center) {
		this.center = center;
	}
}
//  shallow cloning
class Rectangle implements Prototype,Cloneable {
	private Point point;
	private String color;
	public Rectangle(Point point, String color) {
		super();
		this.point = point;
		this.color = color;
	}
	public Prototype clone() {
		try {
			Rectangle cloned=(Rectangle) super.clone();
			return cloned;
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
			return null;
		}
	}
	public Point getPoint() {
		return point;
	}
	public void setPoint(Point point) {
		this.point = point;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
}

public class Prototype_Pattern {
	public static void main(String[] args) {
		
		Circle circle=new Circle(0, "Black",new Point(10, 20));
		Prototype clone = circle.clone();
		Rectangle rectangle=new Rectangle(new Point(10, 20), "Blue");
		Prototype clone2 = rectangle.clone();
		if(clone2.hashCode()==rectangle.hashCode()) {
			System.out.println("Using Reference...");
		}
		System.out.println();
	}
	
//	Shallow cloning - copies the reference to the objects, and thus, any changes made to the referenced objects affect all references to those objects.
//	Deep cloning - creates new instances of the referenced objects, so changes to the original object do not affect the clones.

}
