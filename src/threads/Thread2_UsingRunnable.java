package threads;

public class Thread2_UsingRunnable {

	public static void main(String[] args) {
		MyRunnable myRunnable=new MyRunnable();
		new Thread(myRunnable).start();
		MyRunnable myRunnable1=new MyRunnable();
		new Thread(myRunnable1).start();
	}
}

class MyRunnable implements Runnable{

	@Override
	public void run() {
		for (int i = 0; i <= 10; i++) {
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch (Exception e) {

			}
		}
	}
}