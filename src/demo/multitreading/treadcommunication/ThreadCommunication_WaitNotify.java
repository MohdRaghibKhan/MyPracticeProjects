package demo.multitreading.treadcommunication;

import java.util.LinkedList;
import java.util.Queue;

class SharedQueue {

	private final Queue<Integer> queue = new LinkedList<>();
	private final int CAPACITY = 5;

	public synchronized void producer(int value) throws InterruptedException {
		while (queue.size() == CAPACITY) {
			System.out.println("Queue is full. Producer is waiting...");
			wait();
		}
		System.out.println("PRODUCED : " + value);
		queue.add(value);
		notify();
	}

	public synchronized void consumer() throws InterruptedException {
		while (queue.isEmpty()) {
			System.out.println("Queue is empty. Consumer is waiting...");
			wait();
		}
		Integer poll = queue.poll();
		System.out.println("CONSUMED : " + poll);
		notify();
	}

}

class Producer extends Thread {
	private final SharedQueue queueObj;

	public Producer(SharedQueue queue) {
		this.queueObj = queue;
	}

	@Override
	public void run() {
		int value = 0;
		try {
			while (true) {
				queueObj.producer(value++);
				Thread.sleep(1000);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

}

class Consumer extends Thread {
	private final SharedQueue queueObj;

	public Consumer(SharedQueue queue) {
		this.queueObj = queue;
	}

	@Override
	public void run() {
		try {
			while (true) {
				queueObj.consumer();
				Thread.sleep(500);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

}

public class ThreadCommunication_WaitNotify {
	public static void main(String[] args) {
		SharedQueue sharedQueue = new SharedQueue();
		Producer producer = new Producer(sharedQueue);
		Consumer consumer = new Consumer(sharedQueue);
		producer.start();
		consumer.start();
	}

}
