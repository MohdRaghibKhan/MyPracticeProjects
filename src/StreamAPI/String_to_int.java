package StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class String_to_int {
	public static void main(String[] args) {
		
		List<String> listOfString = Arrays.asList("1", "2", "3", "4", "5");
		List<Integer> list = listOfString.stream().map(Integer::valueOf).collect(Collectors.toList());
		System.out.println(list);
	}
}
