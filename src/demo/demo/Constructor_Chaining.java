package demo.demo;
public class Constructor_Chaining {
	public static void main(String[] args) {
		GrandChild  gd= new GrandChild(10, 20, 30, 40, 50);
	}
}

class Parent {
	public Parent(int d) {
		System.out.println(d+">>>>>>>>>>>d");
	}
}

class Child extends Parent {
	public Child(int c, int d) {
		super(d);
		System.out.println(c+">>>>>>>>>>>c");
	}
	// call parent

}

class GrandChild extends Child {
	public GrandChild(int a, int b, int c, int d) {
		super(c, d);
		System.out.println(b+">>>>>>>>>>>b");

	}

	// call GrandChild
	public  GrandChild(int a, int b, int c, int d,int e) {
		this(a, b, c, d);
		System.out.println(e+">>>>>>>>>>>>>e");
	}
}

