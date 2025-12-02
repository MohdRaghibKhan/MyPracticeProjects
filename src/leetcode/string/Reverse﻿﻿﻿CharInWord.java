package leetcode.string;

public class Reverse﻿﻿﻿CharInWord {

	public static void main(String[] args) {
		String str=reverseTheWord("DRONE");
		System.out.println(str);

	}

	private static String reverseTheWord(String string) {
		int left=0;
		int right = string.length();
		String reverse="";
		for (int i = string.length()-1; i >= 0; i--) {
			reverse=reverse+string.charAt(i);
		}
		return reverse;
	}
}
