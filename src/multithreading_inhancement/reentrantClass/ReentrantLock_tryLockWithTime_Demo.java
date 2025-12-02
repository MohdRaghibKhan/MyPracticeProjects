package multithreading_inhancement.reentrantClass;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

class Thread3 extends Thread {
	 static ReentrantLock lock = new ReentrantLock();

	Thread3(String name) {
		super(name);
	}

	@Override
	public void run() {
		do {
			try {
				if (lock.tryLock(5000, TimeUnit.MILLISECONDS)) {
					System.out.println(Thread.currentThread().getName() + " " + "....got lock");
					Thread.sleep(30000);
					lock.unlock();
					System.out.println(Thread.currentThread().getName() + " " + "....release lock");
					break;
				} else {
					System.out.println(
							Thread.currentThread().getName() + " " + "Unable to get lock and will try again....");
				}
			} catch (Exception e) {
				// TODO: handle exception
			}
		} while (true);
	}

}

public class ReentrantLock_tryLockWithTime_Demo {
	public static void main(String[] args) {
		Thread3 t1 = new Thread3("Thread 1");
		Thread3 t2 = new Thread3("Thread 2");
		Thread3 t3 = new Thread3("Thread 3");
		t1.start();
		t2.start();
		t3.start();
	}

}
