package StreamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class UpperOrLowerCase {
	
	public static void main(String[] args) {
		List<String> lists=new ArrayList<>();
		lists.add("Raghib");
		lists.add("Vipin");
		lists.add("Salman");
		lists.add("Abhishek");
		List<String> collect = lists.stream().map(i -> i.toUpperCase()).collect(Collectors.toList());
		List<String> lower = lists.stream().map(i -> i.toLowerCase()).collect(Collectors.toList());
		System.out.println(collect);
		System.out.println(">>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<");
		System.out.println(lower);
	}
	
}
