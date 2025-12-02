package design_patterns;

public class BillPughSingleton {
    
    // Private constructor to prevent instantiation
    private BillPughSingleton() { }

    // Static inner class responsible for holding the Singleton instance
    private static class SingletonHelper {
        private static final BillPughSingleton INSTANCE = new BillPughSingleton();
    }

    // Public method to provide access to the Singleton instance
    public static BillPughSingleton getInstance() {
        return SingletonHelper.INSTANCE; // First access triggers class loading
    }
}

class TestSingleTon {
	public static void main(String[] args) {
		Runnable task=() -> {
			
			BillPughSingleton instance=BillPughSingleton.getInstance();
			System.out.println(Thread.currentThread().getName()+ " - "+ instance);
			
		};
		
		Thread t1=new Thread(task);
		t1.start();		
		Thread t2=new Thread(task);
		t2.start();
		Thread t3=new Thread(task);
		t3.start();
		
		
		Runnable task2= () -> {
			Singleton instance = Singleton.getSingleton();
			System.out.println(Thread.currentThread().getName()+" SINGLETON "+instance);
		};
		
		new Thread(task2).start();
		new Thread(task2).start();
	    new Thread(task2).start();
		
	}
}

class Singleton{
	private Singleton() {
		
	}
	public static Singleton getSingleton() {
		return InnerSingleton.INSTANCE;
	}
	static class InnerSingleton{
		private static final Singleton INSTANCE=new Singleton();
	}
}





