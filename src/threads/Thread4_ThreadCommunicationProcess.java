package threads;

class SharedResources{
	
	boolean available=false;
	int data;
	public synchronized void  producer(int value) throws InterruptedException {
		
		if(available) {
			wait();
		}
		data=value;
		available=true;
		System.out.println("Producer is producing: "+data);
		notify();
	}
	
	public synchronized void consumer() throws InterruptedException {
		
		if(!available) {
			wait();
		}
		available=false;
		System.out.println("Consumer is consuming: "+data);
		notify();
	}
	
}

class Producer implements Runnable{
	private SharedResources sharedResources;
	public Producer(SharedResources sharedResources) {
		this.sharedResources=sharedResources;
	}
	int value;
	@Override
	public void run() {
		
		while (true) {
			try {
				sharedResources.producer(value++);
				Thread.sleep(1000);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
	} 
	
}

class Consumer implements Runnable{
	private SharedResources sharedResources;
	public Consumer(SharedResources sharedResources) {
		this.sharedResources=sharedResources;
	}
	@Override
	public void run() {
		
		while (true) {
			try {
				sharedResources.consumer();
				Thread.sleep(800);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
	} 
	
}


public class Thread4_ThreadCommunicationProcess {

	public static void main(String[] args) {
		SharedResources sharedResources = new SharedResources();
		Thread producer = new Thread(new Producer(sharedResources),"Producer");
		Thread consumer = new Thread(new Consumer(sharedResources),"Consumer");
		producer.start();
		consumer.start();
	}
	
}
