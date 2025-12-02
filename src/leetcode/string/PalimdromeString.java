package leetcode.string;

public class PalimdromeString {

	public static void main(String[] args) {
		
		boolean str=isPalimdrome("tribe");
		System.out.println(str);
		
	}

	private static boolean isPalimdrome(String str) {
			
		int left=0;
		int right=str.length()-1;
		while(left!= right) {
			char leftChr = str.charAt(left);
			char rightChr = str.charAt(right);
			if(leftChr!=rightChr) {
				return false;
			}
			left++;
			right--;
		}
		return true;
	}

}
