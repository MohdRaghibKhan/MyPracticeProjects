package leetcode;

import java.util.ArrayList;
import java.util.List;

public class Subsequence {

	public static void main(String[] args) {
		String str = "abc";
		List<String> subsequences = getAllSubsequences(str);
		System.out.println(subsequences); // Output: [ , a, b, ab, c, ac, bc, abc]
	}

	private static List<String> getAllSubsequences(String str) {
		List<String> result = new ArrayList<>();
		int n = str.length();
		for (int mask = 0; mask < (1 << n); mask++) { // this will create all possible subsequence length 2 ^n
			StringBuilder builder = new StringBuilder();
			for (int i = 0; i < n; i++) {
				if ((mask & (1 << i)) != 0) { // it is working like for 1 (001) & 1 after
					builder.append(str.charAt(i));
				}
			}
			result.add(builder.toString());
		}
		return result;
	}

}
