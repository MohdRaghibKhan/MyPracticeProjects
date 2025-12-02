package StreamAPI;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Acs_Decs_Sort {
	public static void main(String[] args) {
		List<String> colors = Arrays.asList("Red", "Green", "Blue", "Pink", "Brown");
		System.out.println("Ascending order");
		List<String> sorted = colors.stream().sorted().collect(Collectors.toList());
		System.out.println(sorted);
		System.out.println("Descending order");
		List<String> desc = colors.stream().sorted((o1, o2) -> o2.compareTo(o1)).collect(Collectors.toList());
		System.out.println("using comperator");
		System.out.println(desc);
		System.out.println("using Collections");
		 List<String> collect = colors.stream().sorted(Collections.reverseOrder()).collect(Collectors.toList());
		 System.out.println(collect);
	}
}
