package practice;

import java.util.LinkedHashMap;
import java.util.Map;

public class FrequencyOfChar {
	public static void main(String[] args) {
		String str="Hello World";
		String string = str.replaceAll("\\s", "");
		Map<Character, Integer> map=new LinkedHashMap<>();
		for (char chr : string.toCharArray()) {
			map.put(chr, map.getOrDefault(chr, 0)+1);
		}
		for (Map.Entry<Character, Integer> entry : map.entrySet()) {
			System.out.println(entry.getKey() +" "+ entry.getValue());
			
		}
	}
}
