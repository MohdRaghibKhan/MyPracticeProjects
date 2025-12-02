package multihtreading_copyofwritearraylist;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class MultiThreading_CopyOfWriteArrayList extends Thread  {
	static CopyOnWriteArrayList<String> list=new CopyOnWriteArrayList<>();
	@Override
	public void run() {
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		System.out.println("Current running thread is child Thread :");
		list.add("raghib");
	}
	public static void main(String[] args) throws InterruptedException {
		list.add("vipin");
		list.add("harkirat");
		list.add("salman");
		MultiThreading_CopyOfWriteArrayList t1=new MultiThreading_CopyOfWriteArrayList();
		t1.start();
		Iterator i = list.iterator();
		while(i.hasNext()) {
			String itr=(String) i.next();
			System.out.println("Main Thread iterating list & current object is :"+itr);
			Thread.sleep(3000);
		}
		System.out.println(list);
		
	}
}
