package StreamAPI;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Duplicate_In_Arr {
	public static void main(String[] args) {
		int[] arr = { 5, 13, 4, 21, 13, 27, 2, 59, 59, 34 };
		Map<Integer, Long> collect = Arrays.stream(arr).boxed().collect(Collectors.groupingBy(i -> i , Collectors.counting()));
		List<Integer> collect2 = collect.entrySet().stream().filter(i -> i.getValue()>1)
				                 .map(i -> i.getKey()).collect(Collectors.toList());
		
		System.out.println(collect2);
		System.out.println(">>>>>>Second Key <<<<<<<<<<");
		List<String> abc = Arrays.asList("aa", "aa", "kjh");
		List<String> collect4 = abc.stream().filter(i -> Collections.frequency(abc, i)>1).collect(Collectors.toList());
		Map<String, Long> collect3 = abc.stream().filter(i -> Collections.frequency(abc, i)>1).collect(Collectors.groupingBy(i -> i , Collectors.counting()));
		 List<String> dup_In_List = collect3.entrySet().stream().filter(i -> i.getValue() >1).map(i -> i.getKey()).collect(Collectors.toList());
//		System.out.println(collect4);
		System.out.println("practice");
//	  Integer[] integers = IntStream.of(arr).boxed().toArray(Integer[]::new);
//	  Map<Object, Long> collect5 = Arrays.asList(integers).stream().filter(f -> Collections.frequency(Arrays.asList(integers), f) >1).collect(Collectors.groupingBy(i -> i, Collectors.counting()));
//	  Map<String, Long> collect6 = abc.stream().filter(i -> Collections.frequency(abc, i)>1).collect(Collectors.groupingBy(g -> g,Collectors.counting()));
//	List<int[]> collect5 = Arrays.asList(arr).stream().filter(i -> Collections.frequency(Arrays.asList(arr), i) > 1).collect(Collectors.toList());
//		System.out.println(collect6);
		
		List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.groupingBy(i -> i, Collectors.counting())).entrySet().stream().filter(i -> i.getValue()>1).map(m -> m.getKey()).collect(Collectors.toList());
		System.out.println(list);
		Map<Integer, Long> map = Arrays.stream(arr).boxed().collect(Collectors.groupingBy(i -> i, Collectors.counting())).entrySet().stream().filter(i -> i.getValue()>1).collect(Collectors.toMap(Entry::getKey, Entry::getValue));
		System.out.println(map);
		Map<String, Long> map2 = abc.stream().collect(Collectors.groupingBy(i -> i, Collectors.counting())).entrySet().stream().filter(f -> f.getValue()>1).collect(Collectors.toMap(Entry::getKey, Entry::getValue));	
		System.out.println(map2);
		List<String> list2 = abc.stream().collect(Collectors.groupingBy(i -> i, Collectors.counting())).entrySet().stream().filter(f -> f.getValue()>1).map(m -> m.getKey()).collect(Collectors.toList());	
		System.out.println(list2);
		Map<Integer, Long> way2Map = Arrays.stream(arr).boxed().filter(f -> Collections.frequency(Arrays.asList(arr), f)>1).collect(Collectors.groupingBy(i -> i, Collectors.counting()));
		System.out.println(way2Map);
	}
	
}
