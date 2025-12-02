package leetcode.string;

import java.util.Arrays;

public class LongestSubstringWithoutRepeatingCharacters {

	public static void main(String[] args) {
		String s1="abcadcdbcd";
		int max=0;
		int left=0;
       int  startIndex = 0;

		int[] arr=new int[256];
		Arrays.fill(arr, -1);
		for (int i = 0; i < s1.length(); i++) {
			char charAt = s1.charAt(i);
			if(arr[charAt]>=left) {
				left=arr[charAt]+1;
			}
			arr[charAt]=i;
			if(i-left+1 > max) {
				startIndex=left;
				max=i-left+1;
			}
		}
		String substring = s1.substring(startIndex, max+startIndex);
		System.out.println(substring);
	}
}
