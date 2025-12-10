package leetcode.string;

public class rough {
	public static void main(String[] args) {
		
		String str="bbbbb";
		int[] freq=new int[256];
		int left=0;
		int max=0;
		int end=0;
		int start=0;
		for (int i = 0; i < str.length(); i++) {
			
			if(freq[str.charAt(i)]>left) {
				left=freq[str.charAt(i)]+1;
			}
			freq[str.charAt(i)]=i;
			
			if(max < (i -left+1)) {
				max = i-left+1;
				end=i;
				start=left;
			}
		}
		System.out.println(str.substring(start,end));
	}
}
