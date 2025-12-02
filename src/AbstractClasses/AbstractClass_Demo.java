package AbstractClasses;

public abstract class AbstractClass_Demo {

	public void m1() {
		System.out.println("this is Abstract class void method");
	}

	public void m1(int i, int j) {
		System.out.println("this is Abstract class void method with value of : i " + i + " j " + j);
	}

	public abstract String m1(int i, int j, int k);
}

class abstractImpl extends AbstractClass_Demo {

	@Override
	public String m1(int i, int j, int k) {

		return "from implementation of abstract class i,j,k addition"+(i+j+k);
	}
}

    class main {
	public static void main(String[] args) {
		abstractImpl impl = new abstractImpl();
		impl.m1();
		impl.m1(10, 20);
		String m1 = impl.m1(10, 20, 30);
		System.out.println(m1);
	}
}
