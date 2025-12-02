package practice;

public class Inheritance_demo {
	Inheritance_demo(){
		System.out.println("con1");
	}
		public void display()
		{	
			System.out.println("salman");
		}
}
class c_class extends Inheritance_demo{
	public c_class() {
		System.out.println("con2");
	}
	public void display()
	{	
		System.out.println("raghib");
	}
	
}
class maina{
	public static void main(String[] args) {
		c_class c_classOb=new c_class();	
	}
	
}