package practice;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Anagram_String {
	public static void main(String[] args) {
		String str = "listen";
		String str2 = "silent";
		String lowerCase = str.replace("\\s", "").toLowerCase();
		String lowerCase2 = str2.replace("\\s", "").toLowerCase();
		char[] charArray = lowerCase.toCharArray();
		char[] charArray2 = lowerCase2.toCharArray();
		Arrays.sort(charArray);
		Arrays.sort(charArray2);
		boolean equals = Arrays.equals(charArray, charArray2);
		if (equals) 
			System.out.println("anagram String");
		 else
			System.out.println("STring is not anagram");

		System.out.println(">>>>>>>>>ANAGRAM USING MAP<<<<<<<<<<<");
		String string = str.replaceAll("\\s", "").toLowerCase();
		String string2 = str2.replaceAll("\\s", "").toLowerCase();
		Map<Character, Integer> map = new HashMap<>();
		boolean isAnagram = true;
		for (Character chr : str.toCharArray()) {
			if(str.length()!=str2.length()) {
				isAnagram=false;
				break;
			}
			map.put(chr, map.getOrDefault(chr, 0) + 1);
		}
		for (char chr2 : str2.toCharArray()) {
			if (!map.containsKey(chr2) || map.get(chr2) == 0) {
				isAnagram = false;
				break;
			}
			map.put(chr2, map.getOrDefault(chr2, 0) - 1);
		}
		if (isAnagram) {
			System.out.println("string is anagram");
		} else {
			System.out.println("STring is not a anagram");
		}
	}
}
