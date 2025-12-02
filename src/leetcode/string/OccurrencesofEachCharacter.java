package leetcode.string;

import java.util.HashMap;
import java.util.Map;

public class OccurrencesofEachCharacter {
		
	
	public static void main(String[] args) {
		String str="Raghibkhan";
		Map<Character, Integer> map=new HashMap<>();
		for (char chr : str.toCharArray()) {
			map.put(chr, map.getOrDefault(chr, 0)+1);
			
			
		}
		System.out.println(map);
	}
}
