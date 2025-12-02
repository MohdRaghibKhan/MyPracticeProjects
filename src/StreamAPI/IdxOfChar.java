package StreamAPI;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class IdxOfChar {
	public static void main(String[] args) {
		List<String> strings = List.of("banana","apple", "cherry", "date");
		String string="apple";
		char ch='p';
		int index = IntStream.range(0, string.length()).filter(i -> string.charAt(i)==ch).findFirst().orElse(-1);
		System.out.println(index);
		List<Integer> collect = IntStream.range(0, string.length()).filter(i -> string.charAt(i)==ch).boxed().collect(Collectors.toList());
		System.out.println(collect);
		System.out.println(">>>>>>>>>>>>practice<<<<<<<<<<<<<<<");
		int findFirst = IntStream.range(0, strings.size()).filter( f -> strings.get(f).equals(string)).findFirst().orElse(0);
		System.out.println(findFirst);
		System.out.println(">>>>Occurence of string in  list");
		int orElse = IntStream.range(0, string.length()).filter(f -> string.charAt(f)==ch).findFirst().orElse(-1);
		System.out.println(orElse);
		System.out.println(">>>>all Indexes of charcter occurence");
		List<Integer> collect2 = IntStream.range(0, string.length()).filter(f -> string.charAt(f)==ch).boxed().collect(Collectors.toList());
		System.out.println(collect2);
		 
		IntStream.range(0, string.length()).filter(f -> string.charAt(f)==ch).findFirst().orElse(-1);
		IntStream.range(0, strings.size()).filter(f -> strings.get(0).equals(string)).findFirst().orElse(-1);
		
	}
}
