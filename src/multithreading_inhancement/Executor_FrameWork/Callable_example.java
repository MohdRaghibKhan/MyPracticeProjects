package multithreading_inhancement.Executor_FrameWork;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Callable_example implements Callable{
	int num;
	public Callable_example(int num) {
		this.num=num;
//		System.out.println(sum);
	}
	@Override
	public Object call() throws Exception {
		int sum=0;
		for (int i = 1; i < num; i++) {
			sum=sum+i;
		}
		return sum;
	}
	
}
class maxyzin{
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		Callable_example[]  callables= {
				new Callable_example(10),
				new Callable_example(20),
				new Callable_example(30),
				new Callable_example(40),
				new Callable_example(50)
		};
		
		ExecutorService threadPool = Executors.newFixedThreadPool(2);
		for (Callable_example callable_example : callables) {
			System.out.println( threadPool.submit(callable_example).get());
		}
		
		}
}
