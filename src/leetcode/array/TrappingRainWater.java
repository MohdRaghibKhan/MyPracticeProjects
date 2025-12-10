package leetcode.array;

public class TrappingRainWater {

	public static void main(String[] args) {
		
		int[] arr= {3,1,2,4,0,1,3,2};

//		first we need to find out grater building on left and right for a particular index
		int[] left=new int[arr.length]; // for storing all greater on left side
		int[] right=new int[arr.length];// for storing all greater on right side
		left[0]=arr[0];
		for (int i = 1; i < arr.length; i++) {
			left[i]=Math.max(left[i-1], arr[i]); // finding greater on left
		}
		int len=arr.length-1;
		right[len]=arr[len];
		
		for (int i = len-1; i >=0; i--) {
			right[i]=Math.max(right[i+1], arr[i]);
		}
//		 finally after getting left and right max now we will get the min height because water can fill upto only min height
//		 and subtract the current hieght with minimum to get the ans
		int maxWater=0;
		for (int i = 0; i < arr.length; i++) {
			int num = arr[i];
			int leftGreater = left[i];
			int rightGreater = right[i];
			maxWater=maxWater+(Math.min(leftGreater, rightGreater) -arr[i]); 
		}
		System.out.println(maxWater);
	}
}
