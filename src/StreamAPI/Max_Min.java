package StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Max_Min {
	public static void main(String[] args) {
		List<Integer> integers = Arrays.asList(1, 3, 6, 8, 10, 18, 36);
		Optional<Integer> min = integers.stream().min(Integer::compareTo);
		min.ifPresent(i -> System.out.println(i));
		Optional<Integer> max = integers.stream().max(Integer::compareTo);
		max.ifPresent(i -> System.out.println(i));
		System.out.println(">>>>>>>practice Lexographical search<<<<<<<<<<");
		List<String> strings= Arrays.asList("apple","banana","pineapple","orange");
		System.out.println(strings.stream().min(String::compareTo).orElse(null));
		System.out.println("Max>>>>>>>>>>>>>>");
		System.out.println(strings.stream().max(String::compareTo).orElse(null));
		
	}
}
