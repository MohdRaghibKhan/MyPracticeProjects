package multithreading_inhancement.Executor_FrameWork;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class MyRunnable implements Runnable{
	String name;
	public MyRunnable(String name) {
		this.name=name;
		
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println(name+" Job started by Thread :"+Thread.currentThread().getName());
		try {
			Thread.sleep(5000);
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		System.out.println(name+"....Job Completed by Thread:"+Thread.currentThread().getName());
	}
	
}
public class Executors_Demo {
	public static void main(String[] args) {
		MyRunnable[] myRunnable= {
				                  new MyRunnable("Jhon"),
				                  new MyRunnable("alias"),
				                  new MyRunnable("peter"),
				                  new MyRunnable("alen"),
				                  new MyRunnable("robert"),
				                  new MyRunnable("tony")
				                  };
		ExecutorService service=Executors.newFixedThreadPool(2);
		for (MyRunnable print : myRunnable) {
			service.submit(print);
		}
		service.shutdown();
	}
}
