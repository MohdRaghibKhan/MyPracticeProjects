package demo.multitreading.usingTreadClass;
public class MultiTreading_Tread2 {
	public static void main(String[] args) {
		System.out.println("main thread starts here");
		new B().start();
		Thread b1 = new B();
		b1.start();
		System.out.println("main thread ends here");
	}
}

class B extends Thread {
	// for capturing all tread instances
	private static int count = 0;
	private int id = 0;

	@Override
	public void run() {
		for (int i = 0; i <= 10; i++) {

			System.out.println("<" + id + "> Tick tick : " + i);
			try {
				Thread.sleep(1000);
			} catch (Exception e) {

			}
		}
	}
	public B() {
		this.id = ++count;
	}
}
