package Java_8;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class Consumer_Interface {
	public static void main(String[] args) {
		Consumer<List<Integer>> multiplyBy2 = x -> {   // this method will modify the list
			for (int i = 0; i < x.size(); i++) {
				x.set(i, x.get(i) * 2);
			}
		};
		Consumer<List<Integer>> dispList = list -> list.forEach(i -> System.out.print(i+" "));
		
		List<Integer> list=Arrays.asList(10,20,30,40,50,60,70,80,90);
		
		multiplyBy2.accept(list);
		dispList.accept(list);
		// andThen Method
		System.out.println();
		System.out.println(">>>>>>>>Using andThen() method<<<<<<<<");
		multiplyBy2.andThen(dispList).accept(list);
		System.out.println(">>>>>>>>> Second Example<<<<<<<");
		Consumer<Student> ageIncrementBy1= age -> age.age+=1;
		Consumer<Student> print=System.out::println;
		List<Student> students=Arrays.asList(new Student("RAGHIB", 101, 23),
				               				 new Student("Vipin", 102, 200),
				               				 new Student("santosh", 103, 23),
											 new Student("salman", 104, 24),
											 new Student("abhishek", 105, 24));
		students.forEach(ageIncrementBy1.andThen(print));
		
	}		
}
