package Java_8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class Function_Interface {
	public static void main(String args[]) {

		Function<String, Integer> function1 = x -> x.length();
		Function<String, String> function2 = x -> x.substring(0, 1);
		Function<List<Student>, List<Student>> function3 = x -> {
			List<Student> studentList = new ArrayList<>();

			for (Student s : x) {
				if (function2.apply(s.getName()).equalsIgnoreCase("s")) {
					studentList.add(s);
				}
			}
			return studentList;
		};
		Student student = new Student(101, "Raghib");
		Student student2 = new Student(102, "Santosh");
		Student student3 = new Student(103, "Vipin");
		Student student4 = new Student(104, "salman");
		List<Student> studentList = Arrays.asList(student, student2, student3, student4);
		List<Student> filteredList = function3.apply(studentList);
//		System.out.println(filteredList);
		
		// identity()          // return argument as it is
		Function<String, String> identity=Function.identity();
		System.out.println(identity.apply("Raghib"));
	}
	
}
class Function_Chaining{
	public static void main(String[] args) {
		Function<Integer, Integer> mulBy2=x -> 2*x;
		Function<Integer, Integer> cube=x -> x*x*x;
		System.out.println(mulBy2.andThen(cube).apply(10));
		System.out.println(cube.andThen(mulBy2).apply(10)); // same 
		System.out.println(mulBy2.compose(cube).apply(10)); // same
	}
}