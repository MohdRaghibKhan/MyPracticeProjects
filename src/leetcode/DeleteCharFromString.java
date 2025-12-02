package leetcode;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DeleteCharFromString {

	public static void main(String[] args) {
	
		String str="Helloi World";
		System.out.println(removeChar('i', str));
		String removeCharUsingStreams = removeCharUsingStreams(str,'i');
		System.out.println(">>>>>>>>>>>>>>using streams>>>>>>>>>>>");
		System.out.println(removeCharUsingStreams);
	}

	private static String removeChar(char c, String str) {
		
		return str.replace(String.valueOf(c),"");
		
	}
	
	private static String removeCharUsingStreams(String str, char c) {
		
	String filteredStr = str.chars().filter(f -> f!=c).mapToObj(m -> String.valueOf((char) m)).collect(Collectors.joining());
	
	return filteredStr;
	}
}
