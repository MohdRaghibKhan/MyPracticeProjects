package leetcode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class LongestSubstringWithoutRepeatingCharacters {
	
	public static void main(String[] args) {
		String str="abcabcbb";
//		String res=bruteForce(str);
		String res2=optimalSol(str);
		System.out.println(res2);
	}

	private static String bruteForce(String str) {
		String longestStr="";
		String curLongest="";
		for (int i = 0; i < str.length(); i++) {
			char charAt = str.charAt(i);
			if(curLongest.length()>=longestStr.length() && curLongest.contains(String.valueOf(charAt))) {
				longestStr=curLongest;
				curLongest="";
			}
			curLongest=curLongest+charAt;
		}
		 if(curLongest.length()> longestStr.length()){
			 longestStr=curLongest;
        }
		System.out.println(longestStr.length());
		return longestStr;
	}
	
	private static String optimalSol(String str) {
		Map<Character, Integer> map=new HashMap<>();
		int left=0;
		int right=0;
		int max=0;
		for (int i = 0; i < str.length(); i++) {
			char charAt = str.charAt(i);
			if(map.containsKey(charAt)) {
				left=Math.max(left, map.get(charAt)+1);
				right=i;
			}
			map.put(charAt, i);
			max=Math.max(max, i-left+1);
			right=i;
		}
		String substring = str.substring(left,right);
		return substring;
	}
}
