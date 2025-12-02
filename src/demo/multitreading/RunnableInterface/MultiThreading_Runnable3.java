package demo.multitreading.RunnableInterface;

public class MultiThreading_Runnable3 {
	public static void main(String[] args) {
		System.out.println("main thread starts here");
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				for (int i = 0; i <= 10; i++) {

					System.out.println(" Tick tick : " + i);
					try {
						Thread.sleep(1000);
					} catch (Exception e) {

					}
				}
			}
		}).start();
		System.out.println("main thread ends here");
	}
  }
