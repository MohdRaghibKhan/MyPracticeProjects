package leetcode.string;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class LongestSubstring {
	public static void main(String[] args) {
		String s = "abcabcbb";
		longestSubstring(s);
		System.out.println(longestSubstring(s));
		int max=0;
		int left=0;
		Set<Character> set=new HashSet<>();
		for (int right = 0; right < s.length(); right++) {
			char charAt = s.charAt(right);
			while(set.contains(charAt)) {
				set.remove(charAt);
				left++;
			}
			set.add(s.charAt(right));
			max=Math.max(max, right - left +1);
		}
		System.out.println(max);
		
		
		
		
	}
	public static String longestSubstring(String s) {
	    int[] map = new int[256];
	    Arrays.fill(map, -1);

	    int left = 0;
	    int maxLen = 0;
	    int startIndex = 0; // to store starting index of longest substring

	    for (int right = 0; right < s.length(); right++) {
	        char c = s.charAt(right);

	        // Duplicate found inside current window
	        if (map[c] >= left) {
	            left = map[c] + 1;
	        }

	        // Update last seen index
	        map[c] = right;

	        // Check window size
	        if (right - left + 1 > maxLen) {
	            maxLen = right - left + 1;
	            startIndex = left;  // store starting position
	        }
	    }

	    return s.substring(startIndex, startIndex + maxLen);
	}

}
