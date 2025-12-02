package mulithreading_threadlocal;

class CustomerThread extends Thread {
	static Integer custId = 0;
	private static ThreadLocal t1 = new ThreadLocal() {
		protected Integer initialValue() {
			return custId++;
		}
	};

	public CustomerThread(String name) {
		super(name);
	}

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName() + " Exceuting with Customer Id :" + t1.get());
	}
}

public class ThreadLocalDemo1 {
	public static void main(String[] args) {
		CustomerThread c1=new CustomerThread("Customer Thread-1");
		CustomerThread c2=new CustomerThread("Customer Thread-2");
		CustomerThread c3=new CustomerThread("Customer Thread-3");
		CustomerThread c4=new CustomerThread("Customer Thread-4");
		CustomerThread c5=new CustomerThread("Customer Thread-5");
		c1.start();
		c2.start();
		c3.start();
		c4.start();
		c5.start();
	}
}
