package Java_8;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Streamapi {
	public static void main(String[] args) {
		String str="MADAM";
//		String reverse=new StringBuilder("RADAR").reverse().toString();
	   boolean isPalindrome = IntStream.range(0, str.length()/2).allMatch(i -> str.charAt(i)==str.charAt(str.length()-i-1));				
	   if(isPalindrome) {
//		   System.out.println("STring is palidrome :"+str);
	   }else {
//		   System.out.println("not palindrome");
	   }
	   String str2="SANTOSHCHAURASIYA";
	   Map<Character, Long> collect = str2.chars().mapToObj(c -> (char) c ).collect(Collectors.groupingBy(i -> i,Collectors.counting()))
			   .entrySet().stream().filter(value -> value.getValue()>1)
			   .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
	   System.out.println(collect);
	   
	}
}
