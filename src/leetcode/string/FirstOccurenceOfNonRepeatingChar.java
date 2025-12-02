package leetcode.string;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstOccurenceOfNonRepeatingChar {
	public static void main(String[] args) {
		String s1 = "Hello";
		Map<Character, Integer> map = new LinkedHashMap<>();
		for (int i = 0; i < s1.length(); i++) {
			char charAt = s1.charAt(i);
			map.put(charAt, map.getOrDefault(charAt, 0) + 1);
		}
		for (Map.Entry<Character, Integer> entry : map.entrySet()) {
			if (entry.getValue() == 1) {
				System.out.println(entry.getKey());
				break;
			}
		}
	}
}
