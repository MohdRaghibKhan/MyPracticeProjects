package StreamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicates {
	public static void main(String[] args) {
		List<String> lists=new ArrayList<>();
		lists.add("Raghib");
		lists.add("Raghib");
		lists.add("Vipin");
		lists.add("Salman");
		lists.add("Abhishek");
		List<String> distint = lists.stream().distinct().collect(Collectors.toList());
		System.out.println(distint);
	}
}
