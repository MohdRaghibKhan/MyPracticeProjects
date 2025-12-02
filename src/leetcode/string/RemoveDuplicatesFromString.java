package leetcode.string;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class RemoveDuplicatesFromString {

	public static void main(String[] args) {
		
		
		String s1="Coded";
		String str1=usingPartialStreams("Hello");
		System.out.println(str1);
		String str2=pureLogic(s1);
		System.out.println(str2);

	}

//	integers falls 48 - 57  , Capital chars falls in 65-90 , small chars falls in 97-122
	private static String pureLogic(String s1) {
		boolean[] chars=new boolean[256]; //Because ASCII has values 0–255.
		StringBuilder builder=new StringBuilder();
		for (char chr : s1.toCharArray()) {
			if(!chars[chr]) {
				chars[chr]=true;
				builder.append(chr);
			}
		}
		return builder.toString();
	}


	private static String usingPartialStreams(String s1) {
		Map<Character, Integer> map=new LinkedHashMap<>();
		for (int i = 0; i < s1.length(); i++) {
			char charAt = s1.charAt(i);
			map.put(charAt, i);
		}
		String str=map.keySet().stream().map(String::valueOf).collect(Collectors.joining(""));
		return str;
	}
}
