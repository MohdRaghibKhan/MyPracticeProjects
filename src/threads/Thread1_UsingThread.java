package threads;

public class Thread1_UsingThread {
	
	public static void main(String[] args) {
		
		MyThread myThread=new MyThread();
		myThread.start();
		
	}
}

class MyThread extends Thread{
	@Override
	public void run() {
		System.out.println("Thread running: "+Thread.currentThread().getName());
		
	}
}