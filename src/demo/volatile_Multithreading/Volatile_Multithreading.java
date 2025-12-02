package demo.volatile_Multithreading;


class SharedResource {
//	for correct this code use volatile for dont use varaible fom cache
	private volatile boolean flag=false;
	
//	private boolean flag=false;
	
	
	public void setFlagTrue() {
		System.out.println("Writer Thread made the flag true!!!");
		flag=true;
	}
	public void printIfFlagTrue() {
		while(!flag) {
//			if  we uncomment this syso then this example will not work because syso is synchronized internally ,
//			When the reader thread calls println, it flushes memory, including the CPU's cache.
			
//			System.out.println("writter flag is still false");
		}
		System.out.println("flag is true!!!");
	}
}



public class Volatile_Multithreading {

	
	public static void main(String[] args) {
		SharedResource  sharedResource=new SharedResource();
		Thread writerThread=new Thread(()-> {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				Thread.currentThread().interrupt();
			}
			sharedResource.setFlagTrue();
		});
		
		Thread readerThread=new Thread(()-> {
			sharedResource.printIfFlagTrue();
		});
		writerThread.start();
		readerThread.start();
		
	}
	
}
