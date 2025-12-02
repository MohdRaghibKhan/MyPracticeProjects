package multithreading_inhancement.reentrantClass;

import java.util.concurrent.locks.ReentrantLock;

class Display {
	ReentrantLock lock = new ReentrantLock();

	public void wish(String name) {
		lock.lock();                        //----------> 1
		for (int i = 0; i <= 10; i++) {
			System.out.print("Good Evening :");
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				// TODO: handle exception
			}
			System.out.println(name);
		}
		lock.unlock();                  //-------------> 2
	}
}

class MyThread extends Thread {
	Display d;
	String name;
	public MyThread(Display d,String name) {
		this.d=d;
		this.name=name;
	}
	@Override
	public void run() {
		d.wish(name);
	}
}

public class ReentrantLockDemo1 {

	public static void main(String[] args) {
		Display d=new Display();
		MyThread t1=new MyThread(d, "JHON");
		MyThread t2=new MyThread(d, "ALICE");
		t1.start();
		t2.start();
	}
	
}
