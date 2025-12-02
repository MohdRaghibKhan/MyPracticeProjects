package demo.multitreading.RunnableInterface;

public class Runnable_simpleApproach {
	public static void main(String[] args) {
		MyRunnable myRunnable = new MyRunnable();
		Thread thread = new Thread(myRunnable);
		thread.start();
	}
}
class MyRunnable implements Runnable {

	@Override
	public void run() {
		
		for (int i = 0; i < 10; i++) {
			try {
				Thread.sleep(1000L);
				System.out.println("TIK TIK "+i );
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}
