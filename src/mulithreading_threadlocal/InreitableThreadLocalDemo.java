package mulithreading_threadlocal;

class Parent extends Thread {
	public static InheritableThreadLocal it1 = new InheritableThreadLocal() {
		protected String childValue(Object parentValue) {
			return "Child Thread Local Value set in Parent class>>>>>>";
		}
	};

	@Override
	public void run() {
		it1.set("Parent Thread local>>>");
		System.out.println("Running Thread in Parent: " + it1.get());
		Child child = new Child();
		child.start();
	}
}

class Child extends Thread {
	@Override
	public void run() {
		System.out.println("Running Thread in Child : " + Parent.it1.get());
	}
}

public class InreitableThreadLocalDemo {
	public static void main(String[] args) {
		Parent parent=new Parent();
		parent.start();
	}
}
