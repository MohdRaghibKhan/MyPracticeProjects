package demo.demo;
public class InnerClasses {
	int a = 30;
	static int b = 30;

	static class subStaticInnerClass {
		public static void m1() {
			b = 50;
			System.out.println(b);
		}

		public void m2() {
			b = 50;
			System.out.println(b);
		}
	}
	class subInnerClass{
		public static void m1() {
			b = 50;
			System.out.println(b);
		}

		public void m2() {
			a=40;
			b = 50;
			System.out.println(a);
			System.out.println(b);
		}
	}
}
class main {
	public static void main(String[] args) {
	    InnerClasses.subStaticInnerClass innerClass=new InnerClasses.subStaticInnerClass();
	    InnerClasses classes=new InnerClasses();
	    innerClass.m1();
		innerClass.m2();
		System.out.println("NON STATIC INNER CLASS");
	    //creating object for non static inner class
	    InnerClasses.subInnerClass innerClass2= classes.new subInnerClass();
	    innerClass2.m1();
	    innerClass2.m2();
		
	}
}