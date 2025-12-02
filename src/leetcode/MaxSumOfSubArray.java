package leetcode;

public class MaxSumOfSubArray {
	public static void main(String[] args) {
		
		 int[] arr= {2, 3, -8, 7, -1, 2, 3};
//		    int[] arr= {-5,-4,-2,-1};

		    int maxSumOfSubArray = getMaxSumOfSubArray(arr);
		    System.out.println(maxSumOfSubArray);
	}
	public static int getMaxSumOfSubArray(int[] arr){
		int j=0;
		int maxSum=Integer.MIN_VALUE;
		int sum=0;
		for (int i = 0; i < arr.length; i++) {
			int num = arr[i];
			sum=sum+num;
			if(sum > maxSum) {
				maxSum=sum;
			}
			if(sum<0) {
				sum=0;
			}
		}
	    System.out.println(maxSum);
		return maxSum;
	}
}
