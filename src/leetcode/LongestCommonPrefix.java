package leetcode;

import java.util.Iterator;

public class LongestCommonPrefix {
	public static void main(String[] args) {
		String matcher = "";
//		String[] strs = { "fly", "flower", "flying" };
		String[] strs = {"reflower","flow","flight"};

		String toBeMatched = strs[0];
		String res="";
		StringBuilder builder = new StringBuilder();
		outer:
		for (int j = 0; j < toBeMatched.length(); j++) {
			char charAt = toBeMatched.charAt(j);
			builder.append(charAt);
			for (int k = 1; k < strs.length; k++) {
				String matchie = strs[k];
				if(!matchie.startsWith(builder.toString())) {
					builder.deleteCharAt(builder.length()-1);
					break outer;
				}
			}
		}
		System.out.println(builder);
	}

}
