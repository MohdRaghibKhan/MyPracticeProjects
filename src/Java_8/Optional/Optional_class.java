package Java_8.Optional;

import java.util.Optional;

public class Optional_class {
	
	public static void main(String[] args) {
		Optional<String> name = getName(10);
		if(name.isPresent()) {
			System.out.println(name.get());
		}
		name.ifPresent(System.out::println);
		Optional<String> name2 = getName2(20);
//													 orelse   WE will use this when we want do something when value is empty
		 String tobeUsedString=  name2.isPresent() ? name2.get() : "NA"; 
		 System.out.println(tobeUsedString);
		 String tobeUsedString2=  name2.orElse("NA");
		 System.out.println(tobeUsedString2);
//		 											orElseGet    WE will use this when we want to perform some big operations when value is empty
		 String orelseget=  name2.orElseGet( () -> "DO SOMTHING BIG HERE");
		 System.out.println(tobeUsedString2);
//		 											orElseThrow  we will use this when we want to throw exception when value is empty
//		 String orelsethrow=  name2.orElseThrow( () -> new NullPointerException());
			System.out.println(/* orelsethrow */);
		 
		 Optional<String> optional = getName(10);
			Optional<String> map = optional.map(x -> x.toUpperCase());
			map.ifPresent(System.out::println);
	}
	public static Optional<String> getName(int id) {
		String name="raghib";
		return Optional.ofNullable(name);
	} 
	public static Optional<String> getName2(int id) {
//		String name="santosh";
		return Optional.empty();
	}
}
