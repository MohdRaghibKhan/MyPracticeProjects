package practice;

public class Palindrome {
	public static void main(String[] args) {
		String str="A man, a plan, a canal, Panama";
		String sting = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
		int left=0;
		int right=sting.length()-1;
		boolean isPalindrome=true;
		while(left < right) {
			if(sting.charAt(left)!=sting.charAt(right)) {
				isPalindrome=false;
				break;
			}
			left++;
		    right--;
		}
		if(isPalindrome) {
			System.out.println("is palindrome");
		}else {
			System.out.println("is not palidrome");
		}
	}
}
