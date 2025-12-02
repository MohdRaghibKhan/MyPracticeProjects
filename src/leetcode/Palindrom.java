package leetcode;

public class Palindrom {
	public static void main(String[] args) {
		int x = 121;
		int replica=x;
		int reverse=0;
		while(x!=0) {
			
			int lastDigit=x%10;
			x=x/10;
			reverse = (reverse * 10) + lastDigit;
		}
		if(reverse==replica) {
			System.out.println("palidrom");
		}else {
			System.out.println("not palindrom");
		}
	}
	
}
