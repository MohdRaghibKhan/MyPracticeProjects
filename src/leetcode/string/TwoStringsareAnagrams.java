package leetcode.string;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoStringsareAnagrams {

	public static void main(String[] args) {
		String s1="listen";
		String s2="silent";
		boolean isAna1=isAnagram1(s1,s2);
		System.out.println(isAna1);
		boolean isAna2=isAnagram2(s1,s2);
		System.out.println(isAna2);
	}
	

	private static boolean isAnagram2(String s1, String s2) {
		Map<Character, Integer> map=new HashMap<>();
		for (Character chr : s1.toCharArray()) {
			map.put(chr, map.getOrDefault(chr, 0)+1);
		}
		for (Character chr : s2.toCharArray()) {
			if(!map.containsKey(chr) || map.get(chr)<=0) {
				return false;
			}
			map.put(chr, map.getOrDefault(chr, 0)-1);
		}
		return true;
	}


	private static boolean isAnagram1(String s1, String s2) {
		char[] charArray1 = s1.toCharArray();
		char[] charArray2 = s2.toCharArray();
		Arrays.sort(charArray1);
		Arrays.sort(charArray2);
		if(Arrays.equals(charArray1, charArray2)) {
			return true;
		}else {
			return false;
		}
	}
}
