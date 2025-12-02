package Java_8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Predicate_Interface {
	public static void main(String[] args) {
//		 next question odd even
		Predicate<Integer> isEven = x -> x % 2 == 0;
		List<Integer> integers = Arrays.asList(1, 3, 4, 2, 4, 7, 8, 5, 6, 9, 8, 10, 12);
		for (Integer integer : integers) {
			if (isEven.test(integer)) {
//				System.out.println(integer);
			}
		}
		
//		 string starts with 'R'
		Predicate<String> isNameStartsWith = x -> x.toLowerCase().charAt(0) == 'r';
		boolean test = isNameStartsWith.test("Raghib");
//		System.out.println(test);
		
		
//		                                                    default & static methods in predicate interface
//		String startwithR && String ends with 'B'
		Predicate<String> isNameEndsWith= x -> x.toLowerCase().charAt(x.length()-1) == 'b';
		Predicate<String> and = isNameStartsWith.and(isNameEndsWith);
		boolean b = and.test("RAGHIB");
//		System.out.println(b);
		
//		String startwithR OR String ends with 'B'
		Predicate<String> or = isNameStartsWith.or(isNameEndsWith);
		boolean isor = or.test("RAGHIB");
//		System.out.println(isor);
		
//		String NoStartWithR
		Predicate<String> isNotStartWith= x -> x.toLowerCase().charAt(0) == 'a';
		boolean isNot = isNotStartWith.negate().test("Arsalan");
//		System.out.println(isNot);
		
//		Object isequal or not
		Student s1=new Student("Jhon", 001);
		Student s2=new Student("Mickel", 002);
		Student s3=new Student("Ron", 002);
		Predicate<Integer> isIdEqual=Predicate.isEqual(s2.getId());
		boolean isEqual = isIdEqual.test(s3.getId());
		System.out.println(isEqual);
		
		
	}
	
	
}
class Student {
	String name;
	Integer id;
	int age;
	
	public Student(String name, Integer id, int age) {
		super();
		this.name = name;
		this.id = id;
		this.age = age;
	}
	public Student(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}
	public Student(Integer id, String name) {
		super();
		this.name = name;
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + ", age=" + age + "]";
	}
	
}
