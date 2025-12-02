package demo.multitreading.RunnableInterface;

public class MultiThreading_Runnable {
	public static void main(String[] args) {
		System.out.println("main thread starts here");
		new ThirdTask();
		new ThirdTask();
		System.out.println("main thread ends here");
	}
  }
	class ThirdTask implements Runnable {
		// for capturing all thread instances
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
		public ThirdTask() {
			this.id = ++count;
			new Thread(this).start();  // creating obj of Thread Class & passing 
			                           //  the current class object to Thread class by using this
									   //  & then start method call from Thread object
		}
}

