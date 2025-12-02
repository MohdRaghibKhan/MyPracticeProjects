package demo.multitreading.usingTreadClass;

public class MultiThreading_Tread {
	public static void main(String[] args) {
		System.out.println("main thread starts here");
		A a=new A();
		Thread a1=new A();
		System.out.println("main thread ends here");
	}
}

class A extends Thread {
	 // for capturing all treads instances
	private static int count = 0;
	private int id=0;
	@Override
	public void run()  {
		
		for (int i = 0; i <=10; i++) {
			
			System.out.println("<"+id+"> Tick tick : "+i);
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				
			}
		}
		
	}
	public A() {
//		new Thread().start(); we cant create the new seperate object of thread bcz 
//		thread must associated with current class instead of we can use this keyword bcz this return current obj of class
		this.id=++count;
		this.start();
		
 	}
}
