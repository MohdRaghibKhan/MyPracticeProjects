package StreamAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class LastElementOfStream {

	public static void main(String[] args) {
		String[] arr= {"Geek_First","Geek_2","Geek_3","Geek_4","Geek_Last"};
		List<String> collect =Arrays.stream(arr).filter(i -> i.equals(arr[arr.length-1]))
				              .collect(Collectors.toList());
		System.out.println(collect);
		System.out.println(">>>>>practice<<<<<<<");
		List<String> collect3 = Arrays.stream(arr).filter(f -> f.equals(arr[arr.length-1])).collect(Collectors.toList());
		System.out.println(collect3);
		System.out.println(">>>>>>>>>Get the value of specific index<<<<<<<<<<<<<<<");
		int idx = 2;
		List<String> collect2 = IntStream.range(0, arr.length).filter(i -> i==idx).boxed().map(m -> arr[m]).collect(Collectors.toList());
		System.out.println(collect2);
		
		System.out.println(">>>>>>>>>Using reduce method<<<<<<<<<<<<<<<");
		String lastElement = Arrays.stream(arr).reduce((x,y) -> y).orElse("");
		System.out.println(lastElement);
		
		
		int[] intarr= {1,2,3,4,5,6,7};
		List<Integer> intInp=Arrays.asList(1,2,3,4,5,6,7);
		
		int orElse = Arrays.stream(intarr).reduce((x,y) -> y).orElse(-1);
		System.out.println(orElse);
		Integer orElse2 = intInp.stream().reduce((x,y) -> y).orElse(-1);
		System.out.println(orElse2);
		
	}
}
