package leetcode;

// # leetcode 7
public class ReverseInteger32BIT {

	public static void main(String[] args) {

		int x = 123;
		int reverse = 0;
			while ( x != 0 ) {

				int digit = x % 10;
				
				
				
				if(reverse>Integer.MAX_VALUE/10 || (reverse==Integer.MAX_VALUE && digit>7)) {
					System.out.println(reverse=0);
					return;
				}
				if(reverse<Integer.MIN_VALUE/10 || (reverse==Integer.MIN_VALUE && digit<-8)) {
					System.out.println(reverse=0);
					return;
				}
				
				reverse = digit + reverse * 10;
				x = x / 10;
			}
		System.out.println(reverse);
	}

}
