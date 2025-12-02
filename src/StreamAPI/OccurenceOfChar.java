package StreamAPI;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class OccurenceOfChar {
	public static void main(String[] args) {
		List<Integer> integers=Arrays.asList( 1, 1, 3, 6 , 18, 8, 10, 18, 3, 36);
//		integers.stream().max(Comparator.naturalOrder())
		String charater="harkirat is not a human";
		charater=charater.replace(" ","");
		Map<Object, Long> map=charater.chars().mapToObj(e-> (char)e).collect(Collectors.groupingBy(e->e,Collectors.counting()));
//		long count = Stream.of(chars).count();
//		System.out.println(map);
//		charater.chars().mapToObj(e-> (char)e).filter(e-> e.equals('10')).
//		integers.stream().filter(e->e.equals("10"))
		Map<Character, Long> collect = charater.chars().mapToObj(i -> (char)i).collect(Collectors.groupingBy(e -> e,Collectors.counting()));
		System.out.println(collect);
		Map<Integer,Long> collect4 = integers.stream().collect(Collectors.groupingBy(g -> g, Collectors.counting()));
		System.out.println(collect4);
		
//	
		List<String> abc = Arrays.asList("aa", "aa", "kjh");
		Map<String, Long> collect2 = abc.stream().filter(i -> Collections.frequency(abc, i) > 1)
				.collect(Collectors.groupingBy(i -> i, Collectors.counting()));
		System.out.println(collect2);
		System.out.println(">>>>>>>>>>>>>>>>>>>>Practice<<<<<<<<<<<<<<<<<<<<<<<");
		
		Map<Character,Long> collect3 = charater.chars().mapToObj(m -> (char) m).collect(Collectors.groupingBy( g -> g , Collectors.counting()));
		System.out.println(">>>String occurence<<<<");
		System.out.println(collect3);
		System.out.println("NUMBER OCCURENCE IN LIST");
		Map<Integer,Long> collect5 = integers.stream().collect(Collectors.groupingBy( g -> g, Collectors.counting()));
		System.out.println(collect5);
		
		
	}
}
