package leetcode;

public class StringToInteger {

	public static void main(String[] args) {
		
		String numStr="-91283472332";
		numStr = numStr.trim();
		int sign =1;
		int res=0;
		int i = 0;
		if(numStr.isEmpty()) {
			System.out.println(0);
			System.exit(0);
		}
		if(numStr.charAt(0)=='-' || numStr.charAt(0)=='+') {
			sign= numStr.charAt(0)=='-' ? -1 : 1;
			i++;
		}
		while (i < numStr.length() && Character.isDigit(numStr.charAt(i))) {
			res=res *10 ;
			res =res + (numStr.charAt(i) - '0');
			if(sign==1 && res>Integer.MAX_VALUE) {
				res=Integer.MAX_VALUE;
			}
			if(sign==-1 && res< Integer.MIN_VALUE) {
				res=Integer.MIN_VALUE;
			}
			i++;
		}
		res=res*sign;
		System.out.println(res);
	}
}
