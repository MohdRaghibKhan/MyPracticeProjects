package demo.demo;

public class Demo2 {
	public static void main(String[] args) {
//		MyThread myThread=new MyThread();
//		Thread thread=new Thread(myThread);
//		thread.start();
		MyThread2 myThread2=new MyThread2();
		myThread2.start();
		new Thread(new Runnable() {

			@Override
			public void run() {
				try {
					for (int i = 0; i < 10; i++) {
//						System.out.println(i);
						Thread.sleep(1000);
					}
				} catch (Exception e) {
				}

			}
		}).start();
		Runnable runnable=() -> {
			try {
				for (int i = 0; i < 10; i++) {
					System.out.println(i);
					Thread.sleep(1000);
				}
			} catch (Exception e) {
			}
		};
		new Thread(runnable).start();

	}
}

class MyThread implements Runnable {
	@Override
	public void run() {
		try {
			for (int i = 0; i < 10; i++) {
//				System.out.println(i);
//				Thread.sleep(1000);
			}
		} catch (Exception e) {
		}

	}

	public MyThread() {
		new Thread(this).start();
	}
}

class MyThread2 extends Thread {
		
	@Override
	public void run() {
		try {
			for (int i = 0; i < 10; i++) {
//				System.out.println(i);
				Thread.sleep(1000);
			}
		} catch (Exception e) {
		}
	}	
	
}

