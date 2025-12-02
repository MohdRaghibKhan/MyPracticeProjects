package StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Avg_Int_In_List {
	public static void main(String[] args) {
		List<Integer> integers=Arrays.asList(1, 3, 6, 8, 10, 18, 36);
//				   mapTo... function is used because average() funtion is present in mapToInt or mapToDauble object
		double d = integers.stream().mapToDouble(Integer::doubleValue).average().orElse(0.0);
		System.out.println(d);
		double e = integers.stream().mapToInt(Integer::intValue).average().orElse(0);
		System.out.println(e);
		List<Integer> collect = integers.stream().filter(i -> i==0).collect(Collectors.toList());
		System.out.println(collect);
		
		
		
//		integers.stream().mapToInt(Integer::intValue).average().orElse(0);

	}
}
