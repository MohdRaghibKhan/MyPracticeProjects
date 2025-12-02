package threads;

public class Thread3_ThreadCommunicationProcess {
	public static void main(String[] args) throws InterruptedException {
		
		Counter counter=new Counter();
		Runnable runnable1 = new Runnable() {
			@Override
			public void run() {
				for (int i = 0; i < 1000; i++) {
					counter.increment();
				}
			}
		};
		Runnable runnable2 = new Runnable() {
			@Override
			public void run() {
				for (int i = 0; i < 1000; i++) {
					counter.increment();
				}
			}
		};
		Thread thread1 = new Thread(runnable1);
		Thread thread2 = new Thread(runnable2);
		thread1.start();
		thread2.start();
		thread1.join();
		thread2.join();
        System.out.println("Final Count = " + counter.getCount());

		
	}
}

class Counter{
	
	private int count=0;
	
	public synchronized int increment() {
		return count++;
	}
	public int getCount() {
		return count;
	}
	
}