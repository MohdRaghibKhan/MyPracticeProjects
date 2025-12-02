package leetcode;

public class ReverseWord {

	public static void main(String[] args) {
		String str="Hello this is Raghib";
		String reverseWord = reverseWord(str);
		System.out.println(reverseWord);
	}

	private static String reverseWord(String str) {
		
		String[] words = str.split("\\s+");
		StringBuilder builder=new StringBuilder();
		for(int i=words.length-1; i >=0; i--) {
			
			builder.append(words[i]).append(" ");
		}
		return builder.toString().trim();
	}
	
}
