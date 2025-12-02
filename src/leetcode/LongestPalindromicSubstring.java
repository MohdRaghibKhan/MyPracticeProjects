package leetcode;

public class LongestPalindromicSubstring {
	public static void main(String[] args) {

		String s = "babad";
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
	}

	private static int expandFromCenter(String s, int left, int right) {

		while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
			left--;
			right++;
		}
		return right - left - 1;
	}
}
