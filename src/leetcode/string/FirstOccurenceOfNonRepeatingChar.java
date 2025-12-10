package leetcode.string;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstOccurenceOfNonRepeatingChar {
	public static void main(String[] args) {
		String s1 = "Hello";
		char char1 = getChar(s1);
		System.out.println(char1);
		char char2 = getLeetCodeStyle("hello");
		System.out.println(char2);
	}
	
	private static char getLeetCodeStyle(String s1) {
	
		int[] freq=new int[26];
		
		for (int i = 0; i < s1.length(); i++) {
			char charAt = s1.charAt(i);
			freq[charAt -'a']++;
		}
		for(int i=0; i< s1.length();i++) {
			char charAt = s1.charAt(i);
			if(freq[charAt-'a']==1) {
				return charAt;
			}
		}
		return 0;
	}

	public static char getChar(String s1) {

		Map<Character, Integer> map = new LinkedHashMap<>();
		for (int i = 0; i < s1.length(); i++) {
			char charAt = s1.charAt(i);
			map.put(charAt, map.getOrDefault(charAt, 0) + 1);
		}
		for (Map.Entry<Character, Integer> entry : map.entrySet()) {
			if (entry.getValue() == 1) {
//				System.out.println(entry.getKey());
				return entry.getKey();
			}
		}
		return 0;
	}
}
