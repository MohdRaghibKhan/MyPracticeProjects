package demo.multitreading.RunnableInterface;

public class MultiTheading_Runnable2 {
	public static void main(String[] args) {
		System.out.println("main thread starts here");
		new Thread(new FourthTask()).start();
		Thread thread = new Thread(new FourthTask());
		thread.start();
		System.out.println("main thread ends here");
	}
  }
	class FourthTask implements Runnable {
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
		public FourthTask() {
			this.id = ++count;
		}
}

