package practice;

import java.util.HashMap;
import java.util.Map;

public class CountOccurenceOfWord {
	public static void main(String[] args) {
		 String sentence = "This is a sentence. This is another sentence.";
		 String[] strings = sentence.split("\\s");
		 Map<String, Integer> map=new HashMap<>();
		 for (String string : strings) {
			map.put(string, map.getOrDefault(string, 0)+1);
		}
		 System.out.println(map);
	}
}
