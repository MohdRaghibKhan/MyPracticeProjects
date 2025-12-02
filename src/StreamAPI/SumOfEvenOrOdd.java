package StreamAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SumOfEvenOrOdd {
	public static void main(String[] args) {
		List<Integer> number=Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		int even = number.stream().filter(i -> i%2==0).mapToInt(Integer::intValue).sum();
		int odd = number.stream().filter(i -> i%2!=0).mapToInt(Integer::intValue).sum();
		System.out.println(even);
		System.out.println(">>>>>>>>>>>>>>><<<<<<<<<<<<<<<<");
		System.out.println(odd);
		
	}
}
