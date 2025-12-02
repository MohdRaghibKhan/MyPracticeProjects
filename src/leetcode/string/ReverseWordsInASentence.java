package leetcode.string;

public class ReverseWordsInASentence {

	public static void main(String[] args) {
		String sentence="hello this is Raghib";
		
		String reverse=getReversedSentence(sentence);
		System.out.println(reverse);
	}

	private static String getReversedSentence(String sentence) {
		
		String[] wordOfSentence = sentence.split("\\s+");
		StringBuilder builder=new StringBuilder();
		for (int i = wordOfSentence.length-1; i >= 0; i--) {
			String word = wordOfSentence[i];
			builder.append(word).append(" ");
		}
		
		return builder.toString().trim();
	}
}
