package leetcode;

import java.util.Stack;

public class ValidParetesis {

	public static void main(String[] args) {
		String s = "([]){";
//		String  s = "(]";
//		String s = "([])";
//		String  s = "([)]";
		boolean valid = isValid(s);
		System.out.println(valid);
		

		
	}

	public static boolean isValid(String s) {
		Stack<Character> characters=new Stack<>();
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if(ch=='(' || ch =='[' || ch == '{') {
				characters.push(ch);
			}else {
				if(characters.isEmpty()) {
					return false;
				}
				if(ch==')' && !characters.pop().equals('(') ||
				   ch==']' && !characters.pop().equals('[') ||
				   ch=='}' && !characters.pop().equals('{')) {
					return false;
				}
			}
		}
		return characters.isEmpty();
	}
	
	
	
}
