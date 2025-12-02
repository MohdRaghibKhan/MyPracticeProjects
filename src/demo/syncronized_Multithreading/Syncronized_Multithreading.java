package demo.syncronized_Multithreading;

import java.util.concurrent.locks.ReentrantLock;

/* This example leads to race condition & generate determistic output in which may balance go in negetive beacuse
two threads are accessing same so we can use synchronized to prevent race condition on the top of withdraw method */
class BankAccount {
	private int balance = 1000;

	public void withdraw(int amount) {
		if (balance >= amount) {
			System.out.println(Thread.currentThread().getName() + " is going to withdraw ₹" + amount);
			try {
				Thread.sleep(100); // Simulate delay
			 } catch (InterruptedException e) {
			}
			balance -= amount;
			System.out.println(
					Thread.currentThread().getName() + " completed withdrawal. Remaining balance: ₹" + balance);
		} else {
			System.out.println(Thread.currentThread().getName() + " can't withdraw. Insufficient balance!");
		}
	}
}

public class Syncronized_Multithreading {
	public static void main(String[] args) {
		BankAccount account = new BankAccount();

//		example using reentrant lock
//		BankAccountReentrant account = new BankAccountReentrant();

		Runnable task = () -> {
			for (int i = 0; i < 3; i++) {
				account.withdraw(700);
			}
		};

		Thread t1 = new Thread(task, "Raghib");
		Thread t2 = new Thread(task, "Friend");

		t1.start();
		t2.start();
	}
}

class BankAccountReentrant {
	private int balance = 1000;
	private final ReentrantLock lock = new ReentrantLock();

	public void withdraw(int amount) {
		lock.lock();
		try {
			System.out.println(Thread.currentThread().getName() + " is trying to withdraw ₹" + amount);

			if (balance >= amount) {
				System.out.println(Thread.currentThread().getName() + " sees enough balance: ₹" + balance);
				try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					Thread.currentThread().interrupt();
				}

				balance -= amount;
				System.out.println(Thread.currentThread().getName() + " has withdrawn ₹" + amount
						+ ", Remaining balance: ₹" + balance);
			} else {
				System.out.println(Thread.currentThread().getName() + " can't withdraw ₹" + amount
						+ ". Not enough balance: ₹" + balance);
			}
		} finally {
			lock.unlock();
		}
	}
}
