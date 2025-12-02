package StreamAPI;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ReverseElementParallelStream {
	public static void main(String[] args) {
		 int[] data = {11, 22, 33, 44};
		List<Integer> collect = IntStream.range(0, data.length).map(i -> data[data.length-1-i]).boxed().collect(Collectors.toList());
	    System.out.println(collect);
	    System.out.println(">>>>>>>>>>>>PRACTICE<<<<<<<<<<<<");
	    System.out.println("orignal array");
	    Integer[] array = IntStream.of(data).boxed().toArray(Integer[]::new);
	    System.out.println(Arrays.asList(array));
	    Collections.reverse(Arrays.asList(array));
	    System.out.println("after reversing");
	    System.out.println(Arrays.asList(array));
	    
//	    new style
	    int[] array2 = IntStream.range(0, data.length).map(i -> data[data.length-1-i]).toArray();
	    System.out.println(Arrays.toString(array2));
	    
	}
}
