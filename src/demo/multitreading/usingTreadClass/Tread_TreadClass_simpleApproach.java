package demo.multitreading.usingTreadClass;

public class Tread_TreadClass_simpleApproach {

	public static void main(String[] args) {

		MyThread t1 = new MyThread();
		t1.start();
	}
}

class MyThread extends Thread {
	@Override
	public void run() {
		
		for (int i = 0; i < 11; i++) {
			try {
				Thread.sleep(1000L);
				System.out.println("tik tik "+ i);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}