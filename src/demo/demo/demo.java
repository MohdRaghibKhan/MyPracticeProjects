package demo.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Spliterator;
import java.util.Spliterator.OfInt;

public class demo {
	public static void main(String[] args) {
		Map<String, String> map = new HashMap<>();
		map.put("raghib", "khan");
		map.put("santosh", "chaurasiya");

//		System.out.println(map.keySet());
//		System.out.println(map.values());
		for (Map.Entry<String, String> data : map.entrySet()) {

		}
		List<String> list = new ArrayList<>();
		list.add("raghib");
		list.add("satosh");
		list.add("salman");
		Iterator<String> iterator = list.iterator();
//		while (iterator.hasNext()) {
////			System.out.println(iterator.next());
//		}
		Set<String> set = new HashSet<>();
		set.add("raghib");
		set.add("satosh");
		set.add("salman");
		Spliterator<String> spliterator = set.spliterator();
//		System.out.println("Spliterator characteristics: " + spliterator.characteristics());
		spliterator.forEachRemaining(i -> System.out.println(i));
		int[] arr= {10,20,40,50,60,70};
		Spliterator<Integer> spliterator2 = Arrays.spliterator(arr);
		spliterator2.forEachRemaining(i -> System.out.println(i));
	}
	
}
