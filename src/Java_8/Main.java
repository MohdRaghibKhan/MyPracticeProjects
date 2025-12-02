package Java_8;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Main {
	public static void main(String[] args) {
		Predicate<Integer> modBy2= x -> x%2==0;
		Function<Integer, Integer> square= x -> x*x;
		Consumer<Integer>  print= x -> System.out.println(x);
		Supplier<Integer> argument= () -> 2000;
		
		if(modBy2.test(argument.get())) {
			Integer apply = square.apply(argument.get());
			print.accept(apply);
		}
	}
}
