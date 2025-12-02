package multithreading_inhancement.reentrantClass;

import java.util.concurrent.locks.ReentrantLock;

class MyThread2 extends Thread {
	static ReentrantLock lock = new ReentrantLock(); // thread will create two so that lock should be one thats why
														// static keysword

	public MyThread2(String name) { // constructor for attaching name or accociating tread name
		super(name);
	}

	@Override
	public void run() {
		if (lock.tryLock()) {
			System.out.println(Thread.currentThread().getName() + " " + "....got lock & performing safe operation");
			try {
				Thread.sleep(3000);
			} catch (Exception e) {
				
			}
			lock.unlock();
		} else {
			System.out.println(Thread.currentThread().getName() + " "
					+ "unable to get lock and hence performing alternative operation");
		}
	}
}

public class ReentrantLock_tryLock_Demo {
	public static void main(String[] args) {
		MyThread2 t1=new MyThread2("Thread 1");
		MyThread2 t2=new MyThread2("Thread 2");
		t1.start();
		t2.start();
	}
}
