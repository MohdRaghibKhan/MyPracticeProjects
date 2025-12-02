package Java_8;

import java.util.Random;
import java.util.function.Supplier;

public class Supplier_Interface {
	public static void main(String[] args) {
		Supplier<Integer> supplier=() -> 100;
		Supplier<String> supplier2=() -> "I am Raghib khan";
		System.out.println(supplier.get());
		System.out.println(supplier2.get());
		
		//second example
		System.out.println(">>>>>>>>Second Example<<<<<<<<");
		Supplier<Integer> randomSupplier=() -> new Random().nextInt();
		int count =5;
		while(count-- >0) {
			System.out.println(randomSupplier.get());
		}
	}
}
