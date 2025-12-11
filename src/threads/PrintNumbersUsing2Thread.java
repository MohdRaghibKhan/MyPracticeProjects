package threads;

public class PrintNumbersUsing2Thread {
    
	private int num = 0;
    private final int MAX = 5;
	
    public synchronized void printEven() {
    	while(MAX >= num) {
    		while(num%2!=0) {
    			try {
					wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
    		}
    		if(MAX >= num) {
    			System.out.println(num);
    			try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
    			num++;
    			notify();
    		}
    	}
	}
	

	public synchronized void printOdd() {
		
		while (MAX >=num) {
			
			while(num%2==0) {
				try {
					wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if(MAX>=num) {
				System.out.println(num);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				num++;
				notify();
			}
		}
	}
	public static void main(String[] args) {
		PrintNumbersUsing2Thread numbersUsing2Thread=new PrintNumbersUsing2Thread();
		Thread thread1 = new Thread(() -> numbersUsing2Thread.printOdd());
		Thread thread2 = new Thread(() -> numbersUsing2Thread.printEven());
		thread1.start();
		thread2.start();
		
	}
}
