package leetcode;

import java.util.Iterator;

public class LongestPalindromicSubstring {
	public static void main(String[] args) {

		String s = "babad";
		String subStr1=optimal(s);
		String subStr2=simple(s);

	}

	private static String simple(String s) {
		int start=0;
		int end=0;
		int max=0;
		for (int i = 0; i < s.length(); i++) {
			for (int j = i; j < s.length(); j++) {
				boolean palidrome = isPalidrome2(s, i, j);
				if(palidrome && max < (end - start +1)) {
//					System.out.println(s.substring(start,end+1));
					max=j-i+1;
					start=i;
					end=j;
				}
			}
		}
		return s.substring(start,end+1);
	}
	private static boolean isPalidrome2(String s,int left,int right) {
		
		while(left < right) {
			char charAt = s.charAt(left);
			char charAt2 = s.charAt(right);
			if(charAt!=charAt2) {
				return false;
			}
			left++;
			right--;
		}
		return true;
	}

	private static String optimal(String s) {
		int start = 0, end = 0;
		for (int i = 0; i < s.length(); i++) {

//			for odds
			int len1 = expandFromCenter(s, i, i);
//			for even
			int len2 = expandFromCenter(s, i, i + 1);

			int maxLen = Math.max(len1, len2);

			if (maxLen > end - start) {
				start = i - (maxLen - 1) / 2;
				end = i + maxLen / 2;
			}
		}
		System.out.println(s.substring(start, end + 1));
		return s.substring(start, end + 1);
	}

	private static int expandFromCenter(String s, int left, int right) {

		while (left >= 0 && right < s.length() 
			   && s.charAt(left) == s.charAt(right)) {
			left--;
			right++;
		}
		return right - left - 1;
	}
}
