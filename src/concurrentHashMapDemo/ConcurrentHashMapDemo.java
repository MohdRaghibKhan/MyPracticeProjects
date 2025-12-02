package concurrentHashMapDemo;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapDemo extends Thread  {
	static ConcurrentHashMap<String,String> map=new ConcurrentHashMap<>();
	@Override
	public void run() {
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		System.out.println("Child Thread is executing");
		map.put("101", "A");
		map.put("102", "B");
	}
	public static void main(String[] args) throws InterruptedException {
		map.put("103", "C");
		map.put("104", "D");
		map.put("105", "E");
		ConcurrentHashMapDemo demo=new ConcurrentHashMapDemo();
		demo.start();
		Set es = map.keySet();
		Iterator i=es.iterator();
		while (i.hasNext()) {
			String c=i.next().toString();
			System.out.println("Main Thread is Iterating and current entry is :"+map.get(c));
			Thread.sleep(2000);
		}
		System.out.println(map);
	}

}
