package Java_8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Stream_API {
	
	public static void main(String[] args) {
//		                                				WAYS OF CREATING STREAMS
		Stream<Integer> stream=Stream.of(2,4,6,8,256,56);
		Integer[] integers= {2,4,6,8,256,56};
		Stream<Integer> stream2 = Arrays.stream(integers);
		List<String> list=Arrays.asList("Apple","Banana","Cherry");
		Stream<String> stream3=list.stream();
			int count=0;					
		Stream<Integer> limit = Stream.iterate(0, n -> n+1).limit(100); // loop from 0 to 99 in stream
//		limit.forEach( i -> System.out.println(i));
		Stream<String> limit2=Stream.generate(() -> "hello").limit(100); //this will generate 99 hello in strea,
//		limit2.forEach( i -> System.out.println(i));
		
//														Filter() Example
		List<Integer> list2=Arrays.asList(1,2,3,4,5,6,7,23456,2345,876,876,33,234,4,23);
		
		List<Integer> filteredList= list2.stream().filter(x -> x%2==0).collect(Collectors.toList()); 
//		System.out.println(filteredList);
//														Map() Example
		List<Integer> collect = filteredList.stream().map(x -> x/2).collect(Collectors.toList());
//		System.out.println(collect);
//											distinct() will remove all duplicates
		List<Integer> filteredList2= list2.stream().filter(x -> x%2==0).map(x -> x/2).distinct().collect(Collectors.toList());
//		System.out.println(filteredList2);
		
//										 sorted() will sort data we can change order by passing comperator as argument
		Stream<Integer> Naturalsort = list2.stream().sorted();
		
		Stream<Integer> customSort = list2.stream().sorted((a,b) -> b-a);
		
		List<Integer> filteredList3= list2.stream().filter(x -> x%2==0)
								     .map(x -> x/2)
								     .sorted((x,y) -> y-x)  // custom sort
								     .distinct()
								     .collect(Collectors.toList());
//		System.out.println(filteredList3);
//		                          Limit & Skip -> limit will set the range of list to be fetched & Skip will skip the list from given length
		
		List<Integer> filteredList4= list2.stream().filter(x -> x%2==0)
			     .map(x -> x/2)
			     .sorted((x,y) -> y-x)  // custom sort
			     .limit(6)
			     .skip(1)
			     .distinct()
			     .collect(Collectors.toList());
//		System.out.println(filteredList4);
//								  					This will print numbers from 1 to 100
		List<Integer> iterateInStream=Stream.iterate(0, n -> n+1)
									  .limit(101).skip(1)
									  .collect(Collectors.toList());
//		System.out.println(iterateInStream);
//													Peek
						List<Integer> iterateInStream2=Stream.iterate(0, n -> n+1)
													.limit(101).skip(1)
										            .filter(x -> x%2==0)
//										            .peek(i -> System.out.println(i))
										            .map(x -> x/2)
										            .collect(Collectors.toList());
//					System.out.println(iterateInStream);
//														MAX & MIN
					 Integer min = Stream.iterate(0, n -> n+1)
							.limit(101).skip(1)
				            .filter(x -> x%2==0)
				            .map(x -> x/2)
				            .min((a,b) -> a-b).get();
//					 System.out.println(min);
					 Long max = Stream.iterate(0, n -> n+1)
							.limit(101)
				            .map(x -> x/20)
				            .distinct()
//				            .peek(i-> System.out.println(i))
//				            .max((a,b) -> a-b).get()
					        .count();
					 System.out.println(max);
					 
					 
					 
					 
	}
		
}
