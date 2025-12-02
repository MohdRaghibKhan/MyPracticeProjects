package practice;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class StringCompression {
	public static void main(String[] args) {

		String str = "aabcccccaaa";
		int compressionCount = 0;
		StringBuilder builder = new StringBuilder();
		for (int i = 0; i < str.length(); i++) {
			compressionCount++;
			if (i + 1 >= str.length() || str.charAt(i) != str.charAt(i + 1)) {
				builder.append(str.charAt(i));
				builder.append(compressionCount);
				compressionCount = 0;
			}
		}
		System.out.println(builder);
		
		//
		System.out.println(">>>>>>>>USING MAP<<<<<<<<");
		Map<Character, Integer> map = new HashMap<>();
		for (char chr : str.toCharArray()) {
			map.put(chr, map.getOrDefault(chr, 0) + 1);
		}
		StringBuilder builder2 = new StringBuilder();
		for (Map.Entry<Character, Integer> entry : map.entrySet()) {
			builder2.append(entry.getKey());
			builder2.append(entry.getValue());
		}
		System.out.println(builder2);
	}
}
